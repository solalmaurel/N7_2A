/**
 */
package petrinet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Noeud</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.Noeud#getName <em>Name</em>}</li>
 *   <li>{@link petrinet.Noeud#getDepart <em>Depart</em>}</li>
 *   <li>{@link petrinet.Noeud#getArrivee <em>Arrivee</em>}</li>
 *   <li>{@link petrinet.Noeud#getPetrinet <em>Petrinet</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getNoeud()
 * @model abstract="true"
 * @generated
 */
public interface Noeud extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petrinet.PetrinetPackage#getNoeud_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petrinet.Noeud#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Depart</b></em>' reference list.
	 * The list contents are of type {@link petrinet.Arc}.
	 * It is bidirectional and its opposite is '{@link petrinet.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depart</em>' reference list.
	 * @see petrinet.PetrinetPackage#getNoeud_Depart()
	 * @see petrinet.Arc#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Arc> getDepart();

	/**
	 * Returns the value of the '<em><b>Arrivee</b></em>' reference list.
	 * The list contents are of type {@link petrinet.Arc}.
	 * It is bidirectional and its opposite is '{@link petrinet.Arc#getCible <em>Cible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrivee</em>' reference list.
	 * @see petrinet.PetrinetPackage#getNoeud_Arrivee()
	 * @see petrinet.Arc#getCible
	 * @model opposite="cible"
	 * @generated
	 */
	EList<Arc> getArrivee();

	/**
	 * Returns the value of the '<em><b>Petrinet</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link petrinet.PetriNet#getNoeuds <em>Noeuds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinet</em>' container reference.
	 * @see #setPetrinet(PetriNet)
	 * @see petrinet.PetrinetPackage#getNoeud_Petrinet()
	 * @see petrinet.PetriNet#getNoeuds
	 * @model opposite="noeuds" required="true" transient="false"
	 * @generated
	 */
	PetriNet getPetrinet();

	/**
	 * Sets the value of the '{@link petrinet.Noeud#getPetrinet <em>Petrinet</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Petrinet</em>' container reference.
	 * @see #getPetrinet()
	 * @generated
	 */
	void setPetrinet(PetriNet value);

} // Noeud
