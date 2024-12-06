/**
 */
package simplepdl;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stock</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.Stock#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link simplepdl.Stock#getName <em>Name</em>}</li>
 *   <li>{@link simplepdl.Stock#getRessource <em>Ressource</em>}</li>
 * </ul>
 *
 * @see simplepdl.SimplepdlPackage#getStock()
 * @model
 * @generated
 */
public interface Stock extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Quantite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite</em>' attribute.
	 * @see #setQuantite(Integer)
	 * @see simplepdl.SimplepdlPackage#getStock_Quantite()
	 * @model required="true"
	 * @generated
	 */
	Integer getQuantite();

	/**
	 * Sets the value of the '{@link simplepdl.Stock#getQuantite <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite</em>' attribute.
	 * @see #getQuantite()
	 * @generated
	 */
	void setQuantite(Integer value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see simplepdl.SimplepdlPackage#getStock_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simplepdl.Stock#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ressource</b></em>' reference list.
	 * The list contents are of type {@link simplepdl.Ressource}.
	 * It is bidirectional and its opposite is '{@link simplepdl.Ressource#getStock <em>Stock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressource</em>' reference list.
	 * @see simplepdl.SimplepdlPackage#getStock_Ressource()
	 * @see simplepdl.Ressource#getStock
	 * @model opposite="stock" required="true"
	 * @generated
	 */
	EList<Ressource> getRessource();

} // Stock
