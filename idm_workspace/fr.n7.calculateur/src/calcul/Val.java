/**
 */
package calcul;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Val</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calcul.Val#getEntree <em>Entree</em>}</li>
 *   <li>{@link calcul.Val#getConst <em>Const</em>}</li>
 *   <li>{@link calcul.Val#getSortie <em>Sortie</em>}</li>
 *   <li>{@link calcul.Val#getName <em>Name</em>}</li>
 *   <li>{@link calcul.Val#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link calcul.Val#getSuccessor <em>Successor</em>}</li>
 * </ul>
 *
 * @see calcul.CalculPackage#getVal()
 * @model
 * @generated
 */
public interface Val extends Expression {
	/**
	 * Returns the value of the '<em><b>Entree</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link calcul.Entree#getValLink <em>Val Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entree</em>' reference.
	 * @see #setEntree(Entree)
	 * @see calcul.CalculPackage#getVal_Entree()
	 * @see calcul.Entree#getValLink
	 * @model opposite="valLink"
	 * @generated
	 */
	Entree getEntree();

	/**
	 * Sets the value of the '{@link calcul.Val#getEntree <em>Entree</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entree</em>' reference.
	 * @see #getEntree()
	 * @generated
	 */
	void setEntree(Entree value);

	/**
	 * Returns the value of the '<em><b>Const</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link calcul.Constante#getValLink <em>Val Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Const</em>' reference.
	 * @see #setConst(Constante)
	 * @see calcul.CalculPackage#getVal_Const()
	 * @see calcul.Constante#getValLink
	 * @model opposite="valLink"
	 * @generated
	 */
	Constante getConst();

	/**
	 * Sets the value of the '{@link calcul.Val#getConst <em>Const</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Const</em>' reference.
	 * @see #getConst()
	 * @generated
	 */
	void setConst(Constante value);

	/**
	 * Returns the value of the '<em><b>Sortie</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link calcul.Sortie#getValLink <em>Val Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sortie</em>' reference.
	 * @see #setSortie(Sortie)
	 * @see calcul.CalculPackage#getVal_Sortie()
	 * @see calcul.Sortie#getValLink
	 * @model opposite="valLink"
	 * @generated
	 */
	Sortie getSortie();

	/**
	 * Sets the value of the '{@link calcul.Val#getSortie <em>Sortie</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sortie</em>' reference.
	 * @see #getSortie()
	 * @generated
	 */
	void setSortie(Sortie value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see calcul.CalculPackage#getVal_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link calcul.Val#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Predecessor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link calcul.Expression#getLinkToSuc <em>Link To Suc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessor</em>' reference.
	 * @see #setPredecessor(Expression)
	 * @see calcul.CalculPackage#getVal_Predecessor()
	 * @see calcul.Expression#getLinkToSuc
	 * @model opposite="linkToSuc"
	 * @generated
	 */
	Expression getPredecessor();

	/**
	 * Sets the value of the '{@link calcul.Val#getPredecessor <em>Predecessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predecessor</em>' reference.
	 * @see #getPredecessor()
	 * @generated
	 */
	void setPredecessor(Expression value);

	/**
	 * Returns the value of the '<em><b>Successor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link calcul.Expression#getLinkToPred <em>Link To Pred</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successor</em>' reference.
	 * @see #setSuccessor(Expression)
	 * @see calcul.CalculPackage#getVal_Successor()
	 * @see calcul.Expression#getLinkToPred
	 * @model opposite="linkToPred"
	 * @generated
	 */
	Expression getSuccessor();

	/**
	 * Sets the value of the '{@link calcul.Val#getSuccessor <em>Successor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successor</em>' reference.
	 * @see #getSuccessor()
	 * @generated
	 */
	void setSuccessor(Expression value);

} // Val
