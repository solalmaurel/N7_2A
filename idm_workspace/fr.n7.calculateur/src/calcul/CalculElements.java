/**
 */
package calcul;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calcul.CalculElements#getUnCalcul <em>Un Calcul</em>}</li>
 * </ul>
 *
 * @see calcul.CalculPackage#getCalculElements()
 * @model abstract="true"
 * @generated
 */
public interface CalculElements extends EObject {
	/**
	 * Returns the value of the '<em><b>Un Calcul</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link calcul.UnCalcul#getCalculElements <em>Calcul Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Un Calcul</em>' container reference.
	 * @see #setUnCalcul(UnCalcul)
	 * @see calcul.CalculPackage#getCalculElements_UnCalcul()
	 * @see calcul.UnCalcul#getCalculElements
	 * @model opposite="calculElements" required="true" transient="false"
	 * @generated
	 */
	UnCalcul getUnCalcul();

	/**
	 * Sets the value of the '{@link calcul.CalculElements#getUnCalcul <em>Un Calcul</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Un Calcul</em>' container reference.
	 * @see #getUnCalcul()
	 * @generated
	 */
	void setUnCalcul(UnCalcul value);

} // CalculElements
