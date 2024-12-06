/**
 */
package petrinet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petri Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.PetriNet#getName <em>Name</em>}</li>
 *   <li>{@link petrinet.PetriNet#getNoeuds <em>Noeuds</em>}</li>
 *   <li>{@link petrinet.PetriNet#getArcs <em>Arcs</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getPetriNet()
 * @model
 * @generated
 */
public interface PetriNet extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petrinet.PetrinetPackage#getPetriNet_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petrinet.PetriNet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Noeuds</b></em>' containment reference list.
	 * The list contents are of type {@link petrinet.Noeud}.
	 * It is bidirectional and its opposite is '{@link petrinet.Noeud#getPetrinet <em>Petrinet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Noeuds</em>' containment reference list.
	 * @see petrinet.PetrinetPackage#getPetriNet_Noeuds()
	 * @see petrinet.Noeud#getPetrinet
	 * @model opposite="petrinet" containment="true"
	 * @generated
	 */
	EList<Noeud> getNoeuds();

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link petrinet.Arc}.
	 * It is bidirectional and its opposite is '{@link petrinet.Arc#getPetrinet <em>Petrinet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @see petrinet.PetrinetPackage#getPetriNet_Arcs()
	 * @see petrinet.Arc#getPetrinet
	 * @model opposite="petrinet" containment="true"
	 * @generated
	 */
	EList<Arc> getArcs();

} // PetriNet
