/**
  * Expression enti�re.
  *
  * @author	Xavier Cr�gut
  * @version	$Revision$
  */

public interface Expression {

	/** Accepter un visiteur.
	 * @param visiteur le visiteur accept�
	 */
	<R> R accepter(VisiteurExpression<R> visiteur);

}
