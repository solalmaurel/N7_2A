/**
 */
package petrinet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.Place#getPoids <em>Poids</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends Noeud {
	/**
	 * Returns the value of the '<em><b>Poids</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poids</em>' attribute.
	 * @see #setPoids(Integer)
	 * @see petrinet.PetrinetPackage#getPlace_Poids()
	 * @model required="true"
	 * @generated
	 */
	Integer getPoids();

	/**
	 * Sets the value of the '{@link petrinet.Place#getPoids <em>Poids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poids</em>' attribute.
	 * @see #getPoids()
	 * @generated
	 */
	void setPoids(Integer value);

} // Place
