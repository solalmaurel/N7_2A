/**
 */
package petrinet.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import petrinet.Arc;
import petrinet.Noeud;
import petrinet.PetriNet;
import petrinet.PetrinetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Noeud</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinet.impl.NoeudImpl#getName <em>Name</em>}</li>
 *   <li>{@link petrinet.impl.NoeudImpl#getDepart <em>Depart</em>}</li>
 *   <li>{@link petrinet.impl.NoeudImpl#getArrivee <em>Arrivee</em>}</li>
 *   <li>{@link petrinet.impl.NoeudImpl#getPetrinet <em>Petrinet</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NoeudImpl extends MinimalEObjectImpl.Container implements Noeud {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDepart() <em>Depart</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepart()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> depart;

	/**
	 * The cached value of the '{@link #getArrivee() <em>Arrivee</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivee()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> arrivee;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoeudImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetPackage.Literals.NOEUD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.NOEUD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Arc> getDepart() {
		if (depart == null) {
			depart = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PetrinetPackage.NOEUD__DEPART, PetrinetPackage.ARC__SOURCE);
		}
		return depart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Arc> getArrivee() {
		if (arrivee == null) {
			arrivee = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PetrinetPackage.NOEUD__ARRIVEE, PetrinetPackage.ARC__CIBLE);
		}
		return arrivee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PetriNet getPetrinet() {
		if (eContainerFeatureID() != PetrinetPackage.NOEUD__PETRINET) return null;
		return (PetriNet)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPetrinet(PetriNet newPetrinet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPetrinet, PetrinetPackage.NOEUD__PETRINET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPetrinet(PetriNet newPetrinet) {
		if (newPetrinet != eInternalContainer() || (eContainerFeatureID() != PetrinetPackage.NOEUD__PETRINET && newPetrinet != null)) {
			if (EcoreUtil.isAncestor(this, newPetrinet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPetrinet != null)
				msgs = ((InternalEObject)newPetrinet).eInverseAdd(this, PetrinetPackage.PETRI_NET__NOEUDS, PetriNet.class, msgs);
			msgs = basicSetPetrinet(newPetrinet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.NOEUD__PETRINET, newPetrinet, newPetrinet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetrinetPackage.NOEUD__DEPART:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDepart()).basicAdd(otherEnd, msgs);
			case PetrinetPackage.NOEUD__ARRIVEE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getArrivee()).basicAdd(otherEnd, msgs);
			case PetrinetPackage.NOEUD__PETRINET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPetrinet((PetriNet)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetrinetPackage.NOEUD__DEPART:
				return ((InternalEList<?>)getDepart()).basicRemove(otherEnd, msgs);
			case PetrinetPackage.NOEUD__ARRIVEE:
				return ((InternalEList<?>)getArrivee()).basicRemove(otherEnd, msgs);
			case PetrinetPackage.NOEUD__PETRINET:
				return basicSetPetrinet(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case PetrinetPackage.NOEUD__PETRINET:
				return eInternalContainer().eInverseRemove(this, PetrinetPackage.PETRI_NET__NOEUDS, PetriNet.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PetrinetPackage.NOEUD__NAME:
				return getName();
			case PetrinetPackage.NOEUD__DEPART:
				return getDepart();
			case PetrinetPackage.NOEUD__ARRIVEE:
				return getArrivee();
			case PetrinetPackage.NOEUD__PETRINET:
				return getPetrinet();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PetrinetPackage.NOEUD__NAME:
				setName((String)newValue);
				return;
			case PetrinetPackage.NOEUD__DEPART:
				getDepart().clear();
				getDepart().addAll((Collection<? extends Arc>)newValue);
				return;
			case PetrinetPackage.NOEUD__ARRIVEE:
				getArrivee().clear();
				getArrivee().addAll((Collection<? extends Arc>)newValue);
				return;
			case PetrinetPackage.NOEUD__PETRINET:
				setPetrinet((PetriNet)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PetrinetPackage.NOEUD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PetrinetPackage.NOEUD__DEPART:
				getDepart().clear();
				return;
			case PetrinetPackage.NOEUD__ARRIVEE:
				getArrivee().clear();
				return;
			case PetrinetPackage.NOEUD__PETRINET:
				setPetrinet((PetriNet)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PetrinetPackage.NOEUD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PetrinetPackage.NOEUD__DEPART:
				return depart != null && !depart.isEmpty();
			case PetrinetPackage.NOEUD__ARRIVEE:
				return arrivee != null && !arrivee.isEmpty();
			case PetrinetPackage.NOEUD__PETRINET:
				return getPetrinet() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //NoeudImpl
