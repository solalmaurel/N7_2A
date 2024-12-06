/**
 */
package calcul;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calcul.Binaire#getBinaryType <em>Binary Type</em>}</li>
 * </ul>
 *
 * @see calcul.CalculPackage#getBinaire()
 * @model
 * @generated
 */
public interface Binaire extends Expression {
	/**
	 * Returns the value of the '<em><b>Binary Type</b></em>' attribute.
	 * The literals are from the enumeration {@link calcul.BinaryTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Type</em>' attribute.
	 * @see calcul.BinaryTypes
	 * @see #setBinaryType(BinaryTypes)
	 * @see calcul.CalculPackage#getBinaire_BinaryType()
	 * @model required="true"
	 * @generated
	 */
	BinaryTypes getBinaryType();

	/**
	 * Sets the value of the '{@link calcul.Binaire#getBinaryType <em>Binary Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary Type</em>' attribute.
	 * @see calcul.BinaryTypes
	 * @see #getBinaryType()
	 * @generated
	 */
	void setBinaryType(BinaryTypes value);

} // Binaire
