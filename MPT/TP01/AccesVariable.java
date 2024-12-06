/**
  * AccesVariable repr�sente l'acc�s � une variable.
  *
  * @author	Xavier Cr�gut
  * @version	$Revision$
  */
public class AccesVariable implements Expression {
	private String nom;

	public AccesVariable(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return this.nom;
	}

	public <R> R accepter(VisiteurExpression<R> visiteur) {
		return visiteur.visiterAccesVariable(this);
	}

}
