/**
  * Op�rateur unaire correspondant � la n�gation.
  *
  * @author	Xavier Cr�gut
  * @version	$Revision$
  */

public class Negation implements OperateurUnaire {

	public <R> R accepter(VisiteurExpression<R> visiteur) {
		return visiteur.visiterNegation(this);
	}

}
