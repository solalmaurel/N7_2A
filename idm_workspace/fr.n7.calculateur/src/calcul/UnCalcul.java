/**
 */
package calcul;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Un Calcul</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calcul.UnCalcul#getCalculElements <em>Calcul Elements</em>}</li>
 *   <li>{@link calcul.UnCalcul#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see calcul.CalculPackage#getUnCalcul()
 * @model
 * @generated
 */
public interface UnCalcul extends EObject {
	/**
	 * Returns the value of the '<em><b>Calcul Elements</b></em>' containment reference list.
	 * The list contents are of type {@link calcul.CalculElements}.
	 * It is bidirectional and its opposite is '{@link calcul.CalculElements#getUnCalcul <em>Un Calcul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calcul Elements</em>' containment reference list.
	 * @see calcul.CalculPackage#getUnCalcul_CalculElements()
	 * @see calcul.CalculElements#getUnCalcul
	 * @model opposite="unCalcul" containment="true"
	 * @generated
	 */
	EList<CalculElements> getCalculElements();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see calcul.CalculPackage#getUnCalcul_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link calcul.UnCalcul#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // UnCalcul
