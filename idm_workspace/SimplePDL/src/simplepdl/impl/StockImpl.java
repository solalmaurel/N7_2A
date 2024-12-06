/**
 */
package simplepdl.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import simplepdl.Ressource;
import simplepdl.SimplepdlPackage;
import simplepdl.Stock;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stock</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.impl.StockImpl#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link simplepdl.impl.StockImpl#getName <em>Name</em>}</li>
 *   <li>{@link simplepdl.impl.StockImpl#getRessource <em>Ressource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StockImpl extends ProcessElementImpl implements Stock {
	/**
	 * The default value of the '{@link #getQuantite() <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantite()
	 * @generated
	 * @ordered
	 */
	protected static final Integer QUANTITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantite() <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantite()
	 * @generated
	 * @ordered
	 */
	protected Integer quantite = QUANTITE_EDEFAULT;

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
	 * The cached value of the '{@link #getRessource() <em>Ressource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessource()
	 * @generated
	 * @ordered
	 */
	protected EList<Ressource> ressource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplepdlPackage.Literals.STOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getQuantite() {
		return quantite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantite(Integer newQuantite) {
		Integer oldQuantite = quantite;
		quantite = newQuantite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.STOCK__QUANTITE, oldQuantite, quantite));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.STOCK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Ressource> getRessource() {
		if (ressource == null) {
			ressource = new EObjectWithInverseResolvingEList<Ressource>(Ressource.class, this, SimplepdlPackage.STOCK__RESSOURCE, SimplepdlPackage.RESSOURCE__STOCK);
		}
		return ressource;
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
			case SimplepdlPackage.STOCK__RESSOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRessource()).basicAdd(otherEnd, msgs);
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
			case SimplepdlPackage.STOCK__RESSOURCE:
				return ((InternalEList<?>)getRessource()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimplepdlPackage.STOCK__QUANTITE:
				return getQuantite();
			case SimplepdlPackage.STOCK__NAME:
				return getName();
			case SimplepdlPackage.STOCK__RESSOURCE:
				return getRessource();
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
			case SimplepdlPackage.STOCK__QUANTITE:
				setQuantite((Integer)newValue);
				return;
			case SimplepdlPackage.STOCK__NAME:
				setName((String)newValue);
				return;
			case SimplepdlPackage.STOCK__RESSOURCE:
				getRessource().clear();
				getRessource().addAll((Collection<? extends Ressource>)newValue);
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
			case SimplepdlPackage.STOCK__QUANTITE:
				setQuantite(QUANTITE_EDEFAULT);
				return;
			case SimplepdlPackage.STOCK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SimplepdlPackage.STOCK__RESSOURCE:
				getRessource().clear();
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
			case SimplepdlPackage.STOCK__QUANTITE:
				return QUANTITE_EDEFAULT == null ? quantite != null : !QUANTITE_EDEFAULT.equals(quantite);
			case SimplepdlPackage.STOCK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SimplepdlPackage.STOCK__RESSOURCE:
				return ressource != null && !ressource.isEmpty();
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
		result.append(" (quantite: ");
		result.append(quantite);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StockImpl
