/**
  * Op�rateur binaire d'addition.
  *
  * @author	Xavier Cr�gut
  * @version	$Revision$
  */
public class Addition implements OperateurBinaire {

	public <R> R accepter(VisiteurExpression<R> visiteur) {
		return visiteur.visiterAddition(this);
	}

}
