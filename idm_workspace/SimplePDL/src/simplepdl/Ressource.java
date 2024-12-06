/**
 */
package simplepdl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ressource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.Ressource#getOccurrences <em>Occurrences</em>}</li>
 *   <li>{@link simplepdl.Ressource#getStock <em>Stock</em>}</li>
 *   <li>{@link simplepdl.Ressource#getWorkDefinition <em>Work Definition</em>}</li>
 * </ul>
 *
 * @see simplepdl.SimplepdlPackage#getRessource()
 * @model
 * @generated
 */
public interface Ressource extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrences</em>' attribute.
	 * @see #setOccurrences(Integer)
	 * @see simplepdl.SimplepdlPackage#getRessource_Occurrences()
	 * @model required="true"
	 * @generated
	 */
	Integer getOccurrences();

	/**
	 * Sets the value of the '{@link simplepdl.Ressource#getOccurrences <em>Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrences</em>' attribute.
	 * @see #getOccurrences()
	 * @generated
	 */
	void setOccurrences(Integer value);

	/**
	 * Returns the value of the '<em><b>Stock</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simplepdl.Stock#getRessource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stock</em>' reference.
	 * @see #setStock(Stock)
	 * @see simplepdl.SimplepdlPackage#getRessource_Stock()
	 * @see simplepdl.Stock#getRessource
	 * @model opposite="ressource" required="true"
	 * @generated
	 */
	Stock getStock();

	/**
	 * Sets the value of the '{@link simplepdl.Ressource#getStock <em>Stock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stock</em>' reference.
	 * @see #getStock()
	 * @generated
	 */
	void setStock(Stock value);

	/**
	 * Returns the value of the '<em><b>Work Definition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simplepdl.WorkDefinition#getRessource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Definition</em>' reference.
	 * @see #setWorkDefinition(WorkDefinition)
	 * @see simplepdl.SimplepdlPackage#getRessource_WorkDefinition()
	 * @see simplepdl.WorkDefinition#getRessource
	 * @model opposite="ressource" required="true"
	 * @generated
	 */
	WorkDefinition getWorkDefinition();

	/**
	 * Sets the value of the '{@link simplepdl.Ressource#getWorkDefinition <em>Work Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Definition</em>' reference.
	 * @see #getWorkDefinition()
	 * @generated
	 */
	void setWorkDefinition(WorkDefinition value);

} // Ressource
