/**
  * Op�rateur binaire de multiplication.
  *
  * @author	Xavier Cr�gut
  * @version	$Revision$
  */
public class Multiplication implements OperateurBinaire {

	public <R> R accepter(VisiteurExpression<R> visiteur) {
		return visiteur.visiterMultiplication(this);
	}

}
