/**
  * Op�rateur unaire.
  *
  * @author	Xavier Cr�gut
  * @version	$Revision$
  */
public interface OperateurUnaire {

	<R> R accepter(VisiteurExpression<R> visiteur);

}
