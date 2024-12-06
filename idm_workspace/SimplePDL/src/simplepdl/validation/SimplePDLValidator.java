package simplepdl.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import simplepdl.Guidance;
import simplepdl.Ressource;
import simplepdl.ProcessElement;
import simplepdl.SimplepdlPackage;
import simplepdl.Stock;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;
import simplepdl.util.SimplepdlSwitch;

/**
 * Réalise la validation d'un EObject issu de SimplePDL (en théorie, d'un process).
 * Cet classe visite le modèle et utilise les caseXXX pour rediriger l'algo vers la
 * bonne méthode.
 * Attention, lorsqu'une classe est un parent il faut aller faire la visite des enfants
 * manuellement (cf. caseProcess typiquement).
 * 
 * La classe Switch exige un paramètre de généricité (et gère une partie de la visite à
 * base de comparaison à null). Ici le paramètre est un booléen mais en réalité on ne
 * s'en sert pas...
 * 
 * @author Guillaume Dupont
 * @version 0.1
 */
public class SimplePDLValidator extends SimplepdlSwitch<Boolean> {
	/**
	 * Expression régulière qui correspond à un identifiant bien formé.
	 */
	private static final String IDENT_REGEX = "^[A-Za-z_][A-Za-z0-9_]*$";
	
	/**
	 * Résultat de la validation (état interne réinitialisé à chaque nouvelle validation).
	 */
	private ValidationResult result = null;
	
	/**
	 * Construire un validateur
	 */
	public SimplePDLValidator() {}
	
	/**
	 * Lancer la validation et compiler les résultats dans un ValidationResult.
	 * Cette méthode se charge de créer un résultat de validation vide puis de
	 *  visiter les process présents dans la ressource.
	 * @param resource resource à valider
	 * @return résultat de validation
	 */
	public ValidationResult validate(Resource resource) {
		this.result = new ValidationResult();
		
		for (EObject object : resource.getContents()) {
			this.doSwitch(object);
		}
		
		return this.result;
	}


	/**
	 * Méthode appelée lorsque l'objet visité est un Process.
	 * Cet méthode amorce aussi la visite des éléments enfants.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseProcess(simplepdl.Process object) {
		// Contraintes sur process
		this.result.recordIfFailed(
				object.getName() != null && object.getName().matches(IDENT_REGEX), 
				object, 
				"Le nom du process ne respecte pas les conventions Java");
		
		// Visite
		for (ProcessElement pe : object.getProcessElements()) {
			this.doSwitch(pe);
		}
		
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est un ProcessElement (ou un sous type).
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseProcessElement(ProcessElement object) {
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est une WorkDefinition.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseWorkDefinition(WorkDefinition object) {
	    // Contraintes sur le nom de l'activité
	    this.result.recordIfFailed(
	            object.getName() != null && object.getName().matches(IDENT_REGEX), 
	            object, 
	            "Le nom de l'activité ne respecte pas les conventions Java : il doit commencer par une lettre ou un souligné et ne contenir que des lettres, chiffres ou soulignés.");

	    // Le nom de l'activité doit contenir au moins deux caractères
	    this.result.recordIfFailed(
	            object.getName().length() >= 2, 
	            object, 
	            "Le nom de l'activité doit contenir au moins deux caractères.");

	    // Unicité des noms des activités dans un même processus
	    this.result.recordIfFailed(
	            object.getProcess().getProcessElements().stream()
	                .filter(p -> p.eClass().getClassifierID() == SimplepdlPackage.WORK_DEFINITION)
	                .allMatch(pe -> (pe.equals(object) || !((WorkDefinition) pe).getName().equals(object.getName()))),
	            object, 
	            "Le nom de l'activité (" + object.getName() + ") n'est pas unique au sein du processus.");
	    
	    
	    return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est une WorkSequence.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseWorkSequence(WorkSequence object) {
	    // Contraintes sur les séquences
	    this.result.recordIfFailed(
	            !object.getPredecessor().equals(object.getSuccessor()), 
	            object,
	            object.getPredecessor().getName() + " se réfère à elle-même.");

	    // Unicité de la séquence entre les mêmes activités avec le même type
	    boolean uniqueSequence = object.getProcess().getProcessElements().stream()
	            .filter(pe -> pe instanceof WorkSequence)
	            .map(pe -> (WorkSequence) pe)
	            .filter(ws -> ws.getPredecessor().equals(object.getPredecessor())
	                       && ws.getSuccessor().equals(object.getSuccessor())
	                       && ws.getLinkType() == object.getLinkType())
	            .count() == 1;

	    this.result.recordIfFailed(
	            uniqueSequence, 
	            object,
	            "Il y a une dépendance du même type entre les mêmes activités (" + 
	            object.getPredecessor().getName() + " et " + object.getSuccessor().getName() + ").");

	    return null;
	}


	/**
	 * Méthode appelée lorsque l'objet visité est une Guidance.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseGuidance(Guidance object) {
		// Contraintes sur Guidance
		this.result.recordIfFailed(
				object.getText() != null, 
				object, 
				"La Guidance a un texte vide.");
		
		return null;
	}
	
	
	@Override
	public Boolean caseStock(Stock stock) {
	    // Initialiser la somme des occurrences pour ce stock
	    int totalOccurrences = 0;

	    // Parcourir tous les éléments du processus pour vérifier les WorkDefinitions
	    for (ProcessElement pe : stock.getProcess().getProcessElements()) {
	        if (pe instanceof WorkDefinition) {
	            WorkDefinition workDefinition = (WorkDefinition) pe;

	            // Parcourir les ressources de la WorkDefinition
	            for (Ressource ressource : workDefinition.getRessource()) {
	                // Si la ressource est liée au stock actuel
	                if (ressource.getStock()!=null && ressource.getStock().equals(stock)) {
	                    // Ajouter les occurrences de cette ressource à la somme totale
	                    totalOccurrences += ressource.getOccurrences();
	                }
	            }
	        }
	    }

	    // Vérifier si la somme des occurrences dépasse la quantité disponible dans le stock
	    this.result.recordIfFailed(
	        totalOccurrences <= stock.getQuantite(),
	        stock,
	        "La quantité totale demandée de la ressource " + stock.getName() + " (" + totalOccurrences +
	        ") dépasse la quantité disponible dans le stock (" + stock.getQuantite() + ")."
	    );

	    return null;
	}
	
	/**
	 * Cas par défaut, lorsque l'objet visité ne correspond pas à un des autres cas.
	 * Cette méthode est aussi appelée lorsqu'une méthode renvoie null (comme une sorte de
	 * fallback).
	 * On pourrait implémenter le switch différemment, en ne renvoyant null dans les autres
	 * méthodes que si la contrainte ne sert à rien, et se servir de cette méthode pour
	 * identifier les éléments étrangers (qui de toute façon ne doivent pas exister).
	 * C'est aussi la méthode appelée si on ne redéfini pas un des caseXXX.
	 * @param object objet visité
	 * @return résultat, null ici
	 */
	@Override
	public Boolean defaultCase(EObject object) {
		return null;
	}
	
	
}
