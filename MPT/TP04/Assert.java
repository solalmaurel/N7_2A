/** La classe Assert d�finit des m�thodes de v�rification.  Pour l'instant, la
 * seule m�thode de v�rification est assertTrue mais d'autres pourraient �tre
 * d�finies (voir JUnit).
 *
 * @author	Xavier Cr�gut
 * @version	$Revision: 1.1 $
 */
abstract public class Assert {

	/** V�rifier que la condition est vraie.
	 * @param condition la condition � v�rifier
	 */
	static public void assertTrue(boolean condition) {
		if (! condition) {
			throw new Echec();
		}
	}

}
