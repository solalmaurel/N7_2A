/**
 */
package calcul;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calcul.Unaire#getUnaryType <em>Unary Type</em>}</li>
 * </ul>
 *
 * @see calcul.CalculPackage#getUnaire()
 * @model
 * @generated
 */
public interface Unaire extends Expression {
	/**
	 * Returns the value of the '<em><b>Unary Type</b></em>' attribute.
	 * The literals are from the enumeration {@link calcul.UnaryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Type</em>' attribute.
	 * @see calcul.UnaryType
	 * @see #setUnaryType(UnaryType)
	 * @see calcul.CalculPackage#getUnaire_UnaryType()
	 * @model required="true"
	 * @generated
	 */
	UnaryType getUnaryType();

	/**
	 * Sets the value of the '{@link calcul.Unaire#getUnaryType <em>Unary Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unary Type</em>' attribute.
	 * @see calcul.UnaryType
	 * @see #getUnaryType()
	 * @generated
	 */
	void setUnaryType(UnaryType value);

} // Unaire
