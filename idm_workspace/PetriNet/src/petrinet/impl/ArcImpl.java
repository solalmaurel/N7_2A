/**
 */
package petrinet.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import petrinet.Arc;
import petrinet.Noeud;
import petrinet.PetriNet;
import petrinet.PetrinetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinet.impl.ArcImpl#getPoids <em>Poids</em>}</li>
 *   <li>{@link petrinet.impl.ArcImpl#getSource <em>Source</em>}</li>
 *   <li>{@link petrinet.impl.ArcImpl#getCible <em>Cible</em>}</li>
 *   <li>{@link petrinet.impl.ArcImpl#getName <em>Name</em>}</li>
 *   <li>{@link petrinet.impl.ArcImpl#getLecteur <em>Lecteur</em>}</li>
 *   <li>{@link petrinet.impl.ArcImpl#getPetrinet <em>Petrinet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArcImpl extends MinimalEObjectImpl.Container implements Arc {
	/**
	 * The default value of the '{@link #getPoids() <em>Poids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoids()
	 * @generated
	 * @ordered
	 */
	protected static final Integer POIDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPoids() <em>Poids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoids()
	 * @generated
	 * @ordered
	 */
	protected Integer poids = POIDS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Noeud source;

	/**
	 * The cached value of the '{@link #getCible() <em>Cible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCible()
	 * @generated
	 * @ordered
	 */
	protected Noeud cible;

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
	 * The default value of the '{@link #getLecteur() <em>Lecteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLecteur()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean LECTEUR_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getLecteur() <em>Lecteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLecteur()
	 * @generated
	 * @ordered
	 */
	protected Boolean lecteur = LECTEUR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetPackage.Literals.ARC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPoids() {
		return poids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPoids(Integer newPoids) {
		Integer oldPoids = poids;
		poids = newPoids;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__POIDS, oldPoids, poids));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Noeud getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Noeud)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetPackage.ARC__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Noeud basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Noeud newSource, NotificationChain msgs) {
		Noeud oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(Noeud newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, PetrinetPackage.NOEUD__DEPART, Noeud.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, PetrinetPackage.NOEUD__DEPART, Noeud.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Noeud getCible() {
		if (cible != null && cible.eIsProxy()) {
			InternalEObject oldCible = (InternalEObject)cible;
			cible = (Noeud)eResolveProxy(oldCible);
			if (cible != oldCible) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetPackage.ARC__CIBLE, oldCible, cible));
			}
		}
		return cible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Noeud basicGetCible() {
		return cible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCible(Noeud newCible, NotificationChain msgs) {
		Noeud oldCible = cible;
		cible = newCible;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__CIBLE, oldCible, newCible);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCible(Noeud newCible) {
		if (newCible != cible) {
			NotificationChain msgs = null;
			if (cible != null)
				msgs = ((InternalEObject)cible).eInverseRemove(this, PetrinetPackage.NOEUD__ARRIVEE, Noeud.class, msgs);
			if (newCible != null)
				msgs = ((InternalEObject)newCible).eInverseAdd(this, PetrinetPackage.NOEUD__ARRIVEE, Noeud.class, msgs);
			msgs = basicSetCible(newCible, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__CIBLE, newCible, newCible));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getLecteur() {
		return lecteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLecteur(Boolean newLecteur) {
		Boolean oldLecteur = lecteur;
		lecteur = newLecteur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__LECTEUR, oldLecteur, lecteur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PetriNet getPetrinet() {
		if (eContainerFeatureID() != PetrinetPackage.ARC__PETRINET) return null;
		return (PetriNet)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPetrinet(PetriNet newPetrinet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPetrinet, PetrinetPackage.ARC__PETRINET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPetrinet(PetriNet newPetrinet) {
		if (newPetrinet != eInternalContainer() || (eContainerFeatureID() != PetrinetPackage.ARC__PETRINET && newPetrinet != null)) {
			if (EcoreUtil.isAncestor(this, newPetrinet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPetrinet != null)
				msgs = ((InternalEObject)newPetrinet).eInverseAdd(this, PetrinetPackage.PETRI_NET__ARCS, PetriNet.class, msgs);
			msgs = basicSetPetrinet(newPetrinet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__PETRINET, newPetrinet, newPetrinet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetrinetPackage.ARC__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, PetrinetPackage.NOEUD__DEPART, Noeud.class, msgs);
				return basicSetSource((Noeud)otherEnd, msgs);
			case PetrinetPackage.ARC__CIBLE:
				if (cible != null)
					msgs = ((InternalEObject)cible).eInverseRemove(this, PetrinetPackage.NOEUD__ARRIVEE, Noeud.class, msgs);
				return basicSetCible((Noeud)otherEnd, msgs);
			case PetrinetPackage.ARC__PETRINET:
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
			case PetrinetPackage.ARC__SOURCE:
				return basicSetSource(null, msgs);
			case PetrinetPackage.ARC__CIBLE:
				return basicSetCible(null, msgs);
			case PetrinetPackage.ARC__PETRINET:
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
			case PetrinetPackage.ARC__PETRINET:
				return eInternalContainer().eInverseRemove(this, PetrinetPackage.PETRI_NET__ARCS, PetriNet.class, msgs);
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
			case PetrinetPackage.ARC__POIDS:
				return getPoids();
			case PetrinetPackage.ARC__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case PetrinetPackage.ARC__CIBLE:
				if (resolve) return getCible();
				return basicGetCible();
			case PetrinetPackage.ARC__NAME:
				return getName();
			case PetrinetPackage.ARC__LECTEUR:
				return getLecteur();
			case PetrinetPackage.ARC__PETRINET:
				return getPetrinet();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PetrinetPackage.ARC__POIDS:
				setPoids((Integer)newValue);
				return;
			case PetrinetPackage.ARC__SOURCE:
				setSource((Noeud)newValue);
				return;
			case PetrinetPackage.ARC__CIBLE:
				setCible((Noeud)newValue);
				return;
			case PetrinetPackage.ARC__NAME:
				setName((String)newValue);
				return;
			case PetrinetPackage.ARC__LECTEUR:
				setLecteur((Boolean)newValue);
				return;
			case PetrinetPackage.ARC__PETRINET:
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
			case PetrinetPackage.ARC__POIDS:
				setPoids(POIDS_EDEFAULT);
				return;
			case PetrinetPackage.ARC__SOURCE:
				setSource((Noeud)null);
				return;
			case PetrinetPackage.ARC__CIBLE:
				setCible((Noeud)null);
				return;
			case PetrinetPackage.ARC__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PetrinetPackage.ARC__LECTEUR:
				setLecteur(LECTEUR_EDEFAULT);
				return;
			case PetrinetPackage.ARC__PETRINET:
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
			case PetrinetPackage.ARC__POIDS:
				return POIDS_EDEFAULT == null ? poids != null : !POIDS_EDEFAULT.equals(poids);
			case PetrinetPackage.ARC__SOURCE:
				return source != null;
			case PetrinetPackage.ARC__CIBLE:
				return cible != null;
			case PetrinetPackage.ARC__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PetrinetPackage.ARC__LECTEUR:
				return LECTEUR_EDEFAULT == null ? lecteur != null : !LECTEUR_EDEFAULT.equals(lecteur);
			case PetrinetPackage.ARC__PETRINET:
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
		result.append(" (poids: ");
		result.append(poids);
		result.append(", name: ");
		result.append(name);
		result.append(", lecteur: ");
		result.append(lecteur);
		result.append(')');
		return result.toString();
	}

} //ArcImpl
