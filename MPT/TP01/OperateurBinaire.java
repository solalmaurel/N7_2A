/**
  * Op�rateur binaire.
  *
  * @author	Xavier Cr�gut
  * @version	$Revision$
  */
public interface OperateurBinaire {

	<R> R accepter(VisiteurExpression<R> visiteur);

}
