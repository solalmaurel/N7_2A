/**
 */
package calcul.impl;

import calcul.CalculElements;
import calcul.CalculPackage;
import calcul.UnCalcul;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link calcul.impl.CalculElementsImpl#getUnCalcul <em>Un Calcul</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CalculElementsImpl extends MinimalEObjectImpl.Container implements CalculElements {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalculElementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CalculPackage.Literals.CALCUL_ELEMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnCalcul getUnCalcul() {
		if (eContainerFeatureID() != CalculPackage.CALCUL_ELEMENTS__UN_CALCUL) return null;
		return (UnCalcul)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnCalcul(UnCalcul newUnCalcul, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUnCalcul, CalculPackage.CALCUL_ELEMENTS__UN_CALCUL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnCalcul(UnCalcul newUnCalcul) {
		if (newUnCalcul != eInternalContainer() || (eContainerFeatureID() != CalculPackage.CALCUL_ELEMENTS__UN_CALCUL && newUnCalcul != null)) {
			if (EcoreUtil.isAncestor(this, newUnCalcul))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUnCalcul != null)
				msgs = ((InternalEObject)newUnCalcul).eInverseAdd(this, CalculPackage.UN_CALCUL__CALCUL_ELEMENTS, UnCalcul.class, msgs);
			msgs = basicSetUnCalcul(newUnCalcul, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalculPackage.CALCUL_ELEMENTS__UN_CALCUL, newUnCalcul, newUnCalcul));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CalculPackage.CALCUL_ELEMENTS__UN_CALCUL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUnCalcul((UnCalcul)otherEnd, msgs);
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
			case CalculPackage.CALCUL_ELEMENTS__UN_CALCUL:
				return basicSetUnCalcul(null, msgs);
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
			case CalculPackage.CALCUL_ELEMENTS__UN_CALCUL:
				return eInternalContainer().eInverseRemove(this, CalculPackage.UN_CALCUL__CALCUL_ELEMENTS, UnCalcul.class, msgs);
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
			case CalculPackage.CALCUL_ELEMENTS__UN_CALCUL:
				return getUnCalcul();
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
			case CalculPackage.CALCUL_ELEMENTS__UN_CALCUL:
				setUnCalcul((UnCalcul)newValue);
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
			case CalculPackage.CALCUL_ELEMENTS__UN_CALCUL:
				setUnCalcul((UnCalcul)null);
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
			case CalculPackage.CALCUL_ELEMENTS__UN_CALCUL:
				return getUnCalcul() != null;
		}
		return super.eIsSet(featureID);
	}

} //CalculElementsImpl
