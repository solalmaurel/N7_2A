/**
 */
package calcul;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see calcul.CalculPackage
 * @generated
 */
public interface CalculFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CalculFactory eINSTANCE = calcul.impl.CalculFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Binaire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binaire</em>'.
	 * @generated
	 */
	Binaire createBinaire();

	/**
	 * Returns a new object of class '<em>Unaire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unaire</em>'.
	 * @generated
	 */
	Unaire createUnaire();

	/**
	 * Returns a new object of class '<em>Constante</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constante</em>'.
	 * @generated
	 */
	Constante createConstante();

	/**
	 * Returns a new object of class '<em>Entree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entree</em>'.
	 * @generated
	 */
	Entree createEntree();

	/**
	 * Returns a new object of class '<em>Sortie</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sortie</em>'.
	 * @generated
	 */
	Sortie createSortie();

	/**
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	Link createLink();

	/**
	 * Returns a new object of class '<em>Un Calcul</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Un Calcul</em>'.
	 * @generated
	 */
	UnCalcul createUnCalcul();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CalculPackage getCalculPackage();

} //CalculFactory
