/**
 */
package calcul;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calcul.Expression#getName <em>Name</em>}</li>
 *   <li>{@link calcul.Expression#getValeur <em>Valeur</em>}</li>
 *   <li>{@link calcul.Expression#getLinkToPredecessor <em>Link To Predecessor</em>}</li>
 *   <li>{@link calcul.Expression#getLinkToSuccessor <em>Link To Successor</em>}</li>
 * </ul>
 *
 * @see calcul.CalculPackage#getExpression()
 * @model abstract="true"
 * @generated
 */
public interface Expression extends CalculElements {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see calcul.CalculPackage#getExpression_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link calcul.Expression#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur</em>' attribute.
	 * @see #setValeur(Float)
	 * @see calcul.CalculPackage#getExpression_Valeur()
	 * @model required="true"
	 * @generated
	 */
	Float getValeur();

	/**
	 * Sets the value of the '{@link calcul.Expression#getValeur <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valeur</em>' attribute.
	 * @see #getValeur()
	 * @generated
	 */
	void setValeur(Float value);

	/**
	 * Returns the value of the '<em><b>Link To Predecessor</b></em>' reference list.
	 * The list contents are of type {@link calcul.Link}.
	 * It is bidirectional and its opposite is '{@link calcul.Link#getSuccessor <em>Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link To Predecessor</em>' reference list.
	 * @see calcul.CalculPackage#getExpression_LinkToPredecessor()
	 * @see calcul.Link#getSuccessor
	 * @model opposite="successor"
	 * @generated
	 */
	EList<Link> getLinkToPredecessor();

	/**
	 * Returns the value of the '<em><b>Link To Successor</b></em>' reference list.
	 * The list contents are of type {@link calcul.Link}.
	 * It is bidirectional and its opposite is '{@link calcul.Link#getPredecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link To Successor</em>' reference list.
	 * @see calcul.CalculPackage#getExpression_LinkToSuccessor()
	 * @see calcul.Link#getPredecessor
	 * @model opposite="predecessor"
	 * @generated
	 */
	EList<Link> getLinkToSuccessor();

} // Expression
