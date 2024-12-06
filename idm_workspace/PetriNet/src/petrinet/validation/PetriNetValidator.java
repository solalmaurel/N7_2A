package petrinet.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import petrinet.Noeud;
import petrinet.Place;
import petrinet.Transition;
import petrinet.Arc;
import petrinet.util.PetrinetSwitch;

public class PetriNetValidator extends PetrinetSwitch<Boolean> {
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
	public PetriNetValidator() {}
	
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
	 * Méthode appelée lorsque l'objet visité est un Petrinet.
	 * Cet méthode amorce aussi la visite des éléments enfants.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean casePetriNet(petrinet.PetriNet object) {
		// Contraintes sur PetriNet
		this.result.recordIfFailed(
				object.getName() != null && object.getName().matches(IDENT_REGEX), 
				object, 
				"Le nom du process ne respecte pas les conventions Java");
		
		// Visite Noeuds
		for (Noeud nd : object.getNoeuds()) {
			this.doSwitch(nd);
		}
		
		// Visite Arcs
		for (Arc arc : object.getArcs()) {
			this.caseArc((Arc) arc);
		}
		
		return null;
	}
	
	/**
     * Méthode appelée lorsqu'un arc est visité.
     * @param arc élément visité
     * @return null (continue la visite)
     */
    @Override
    public Boolean caseArc(Arc arc) {
        // L'arc doit relier une place à une transition (ou vice versa)
        boolean connexionValide = (arc.getSource() instanceof Place && arc.getCible() instanceof Transition)
                               || (arc.getSource() instanceof Transition && arc.getCible() instanceof Place);
        
       String nom = "";
       if (arc.getName() != null) {
    	   nom = arc.getName();
       }

        this.result.recordIfFailed(
            connexionValide,
            arc,
            "L'arc " + nom + " doit relier une place à une transition (ou l'inverse)."
        );

        // Le poids de l'arc doit être supérieur ou égal à 1
        this.result.recordIfFailed(
            arc.getPoids() >= 1,
            arc,
            "L'arc " + nom + " a un poids invalide (" + arc.getPoids() + "). Le poids doit être >= 1."
        );

        // Si l'arc est lecteur, le poids doit être égal à 1
        if (arc.getLecteur()) {
            this.result.recordIfFailed(
                arc.getPoids() == 1,
                arc,
                "L'arc inhibiteur " + nom + " doit avoir un poids de 1."
            );
        }

        return null;
    }

    /**
     * Méthode appelée lorsqu'une Place est visitée.
     * @param place élément visité
     * @return null (continue la visite)
     */
    @Override
    public Boolean casePlace(Place place) {
        // Le poids d'une place doit être non négatif
        this.result.recordIfFailed(
            place.getPoids() >= 0,
            place,
            "La place " + place.getName() + " a un poids invalide (" + place.getPoids() + "). Le poids doit être >= 0."
        );

        return null;
    }

    /**
     * Méthode appelée lorsqu'une Transition est visitée.
     * @param transition élément visité
     * @return null (continue la visite)
     */
    @Override
    public Boolean caseTransition(Transition transition) {
        // Aucune contrainte spécifique sur la transition

        return null;
    }
}
