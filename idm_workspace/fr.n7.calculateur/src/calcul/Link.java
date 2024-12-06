/**
 */
package calcul;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calcul.Link#getName <em>Name</em>}</li>
 *   <li>{@link calcul.Link#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link calcul.Link#getSuccessor <em>Successor</em>}</li>
 * </ul>
 *
 * @see calcul.CalculPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends CalculElements {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see calcul.CalculPackage#getLink_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link calcul.Link#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Predecessor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link calcul.Expression#getLinkToSuccessor <em>Link To Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessor</em>' reference.
	 * @see #setPredecessor(Expression)
	 * @see calcul.CalculPackage#getLink_Predecessor()
	 * @see calcul.Expression#getLinkToSuccessor
	 * @model opposite="linkToSuccessor"
	 * @generated
	 */
	Expression getPredecessor();

	/**
	 * Sets the value of the '{@link calcul.Link#getPredecessor <em>Predecessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predecessor</em>' reference.
	 * @see #getPredecessor()
	 * @generated
	 */
	void setPredecessor(Expression value);

	/**
	 * Returns the value of the '<em><b>Successor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link calcul.Expression#getLinkToPredecessor <em>Link To Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successor</em>' reference.
	 * @see #setSuccessor(Expression)
	 * @see calcul.CalculPackage#getLink_Successor()
	 * @see calcul.Expression#getLinkToPredecessor
	 * @model opposite="linkToPredecessor"
	 * @generated
	 */
	Expression getSuccessor();

	/**
	 * Sets the value of the '{@link calcul.Link#getSuccessor <em>Successor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successor</em>' reference.
	 * @see #getSuccessor()
	 * @generated
	 */
	void setSuccessor(Expression value);

} // Link
