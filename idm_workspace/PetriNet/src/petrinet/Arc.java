/**
 */
package petrinet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.Arc#getPoids <em>Poids</em>}</li>
 *   <li>{@link petrinet.Arc#getSource <em>Source</em>}</li>
 *   <li>{@link petrinet.Arc#getCible <em>Cible</em>}</li>
 *   <li>{@link petrinet.Arc#getName <em>Name</em>}</li>
 *   <li>{@link petrinet.Arc#getLecteur <em>Lecteur</em>}</li>
 *   <li>{@link petrinet.Arc#getPetrinet <em>Petrinet</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getArc()
 * @model
 * @generated
 */
public interface Arc extends EObject {
	/**
	 * Returns the value of the '<em><b>Poids</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poids</em>' attribute.
	 * @see #setPoids(Integer)
	 * @see petrinet.PetrinetPackage#getArc_Poids()
	 * @model required="true"
	 * @generated
	 */
	Integer getPoids();

	/**
	 * Sets the value of the '{@link petrinet.Arc#getPoids <em>Poids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poids</em>' attribute.
	 * @see #getPoids()
	 * @generated
	 */
	void setPoids(Integer value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link petrinet.Noeud#getDepart <em>Depart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Noeud)
	 * @see petrinet.PetrinetPackage#getArc_Source()
	 * @see petrinet.Noeud#getDepart
	 * @model opposite="depart" required="true"
	 * @generated
	 */
	Noeud getSource();

	/**
	 * Sets the value of the '{@link petrinet.Arc#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Noeud value);

	/**
	 * Returns the value of the '<em><b>Cible</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link petrinet.Noeud#getArrivee <em>Arrivee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cible</em>' reference.
	 * @see #setCible(Noeud)
	 * @see petrinet.PetrinetPackage#getArc_Cible()
	 * @see petrinet.Noeud#getArrivee
	 * @model opposite="arrivee" required="true"
	 * @generated
	 */
	Noeud getCible();

	/**
	 * Sets the value of the '{@link petrinet.Arc#getCible <em>Cible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cible</em>' reference.
	 * @see #getCible()
	 * @generated
	 */
	void setCible(Noeud value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petrinet.PetrinetPackage#getArc_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petrinet.Arc#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Lecteur</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lecteur</em>' attribute.
	 * @see #setLecteur(Boolean)
	 * @see petrinet.PetrinetPackage#getArc_Lecteur()
	 * @model default="false"
	 * @generated
	 */
	Boolean getLecteur();

	/**
	 * Sets the value of the '{@link petrinet.Arc#getLecteur <em>Lecteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lecteur</em>' attribute.
	 * @see #getLecteur()
	 * @generated
	 */
	void setLecteur(Boolean value);

	/**
	 * Returns the value of the '<em><b>Petrinet</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link petrinet.PetriNet#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinet</em>' container reference.
	 * @see #setPetrinet(PetriNet)
	 * @see petrinet.PetrinetPackage#getArc_Petrinet()
	 * @see petrinet.PetriNet#getArcs
	 * @model opposite="arcs" required="true" transient="false"
	 * @generated
	 */
	PetriNet getPetrinet();

	/**
	 * Sets the value of the '{@link petrinet.Arc#getPetrinet <em>Petrinet</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Petrinet</em>' container reference.
	 * @see #getPetrinet()
	 * @generated
	 */
	void setPetrinet(PetriNet value);

} // Arc
