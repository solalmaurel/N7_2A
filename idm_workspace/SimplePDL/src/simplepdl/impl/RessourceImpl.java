/**
 */
package simplepdl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import simplepdl.Ressource;
import simplepdl.SimplepdlPackage;
import simplepdl.Stock;
import simplepdl.WorkDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ressource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.impl.RessourceImpl#getOccurrences <em>Occurrences</em>}</li>
 *   <li>{@link simplepdl.impl.RessourceImpl#getStock <em>Stock</em>}</li>
 *   <li>{@link simplepdl.impl.RessourceImpl#getWorkDefinition <em>Work Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RessourceImpl extends ProcessElementImpl implements Ressource {
	/**
	 * The default value of the '{@link #getOccurrences() <em>Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrences()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OCCURRENCES_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOccurrences() <em>Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrences()
	 * @generated
	 * @ordered
	 */
	protected Integer occurrences = OCCURRENCES_EDEFAULT;
	/**
	 * The cached value of the '{@link #getStock() <em>Stock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStock()
	 * @generated
	 * @ordered
	 */
	protected Stock stock;
	/**
	 * The cached value of the '{@link #getWorkDefinition() <em>Work Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkDefinition()
	 * @generated
	 * @ordered
	 */
	protected WorkDefinition workDefinition;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RessourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplepdlPackage.Literals.RESSOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getOccurrences() {
		return occurrences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOccurrences(Integer newOccurrences) {
		Integer oldOccurrences = occurrences;
		occurrences = newOccurrences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.RESSOURCE__OCCURRENCES, oldOccurrences, occurrences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stock getStock() {
		if (stock != null && stock.eIsProxy()) {
			InternalEObject oldStock = (InternalEObject)stock;
			stock = (Stock)eResolveProxy(oldStock);
			if (stock != oldStock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplepdlPackage.RESSOURCE__STOCK, oldStock, stock));
			}
		}
		return stock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stock basicGetStock() {
		return stock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStock(Stock newStock, NotificationChain msgs) {
		Stock oldStock = stock;
		stock = newStock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimplepdlPackage.RESSOURCE__STOCK, oldStock, newStock);
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
	public void setStock(Stock newStock) {
		if (newStock != stock) {
			NotificationChain msgs = null;
			if (stock != null)
				msgs = ((InternalEObject)stock).eInverseRemove(this, SimplepdlPackage.STOCK__RESSOURCE, Stock.class, msgs);
			if (newStock != null)
				msgs = ((InternalEObject)newStock).eInverseAdd(this, SimplepdlPackage.STOCK__RESSOURCE, Stock.class, msgs);
			msgs = basicSetStock(newStock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.RESSOURCE__STOCK, newStock, newStock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkDefinition getWorkDefinition() {
		if (workDefinition != null && workDefinition.eIsProxy()) {
			InternalEObject oldWorkDefinition = (InternalEObject)workDefinition;
			workDefinition = (WorkDefinition)eResolveProxy(oldWorkDefinition);
			if (workDefinition != oldWorkDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplepdlPackage.RESSOURCE__WORK_DEFINITION, oldWorkDefinition, workDefinition));
			}
		}
		return workDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkDefinition basicGetWorkDefinition() {
		return workDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkDefinition(WorkDefinition newWorkDefinition, NotificationChain msgs) {
		WorkDefinition oldWorkDefinition = workDefinition;
		workDefinition = newWorkDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimplepdlPackage.RESSOURCE__WORK_DEFINITION, oldWorkDefinition, newWorkDefinition);
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
	public void setWorkDefinition(WorkDefinition newWorkDefinition) {
		if (newWorkDefinition != workDefinition) {
			NotificationChain msgs = null;
			if (workDefinition != null)
				msgs = ((InternalEObject)workDefinition).eInverseRemove(this, SimplepdlPackage.WORK_DEFINITION__RESSOURCE, WorkDefinition.class, msgs);
			if (newWorkDefinition != null)
				msgs = ((InternalEObject)newWorkDefinition).eInverseAdd(this, SimplepdlPackage.WORK_DEFINITION__RESSOURCE, WorkDefinition.class, msgs);
			msgs = basicSetWorkDefinition(newWorkDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.RESSOURCE__WORK_DEFINITION, newWorkDefinition, newWorkDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplepdlPackage.RESSOURCE__STOCK:
				if (stock != null)
					msgs = ((InternalEObject)stock).eInverseRemove(this, SimplepdlPackage.STOCK__RESSOURCE, Stock.class, msgs);
				return basicSetStock((Stock)otherEnd, msgs);
			case SimplepdlPackage.RESSOURCE__WORK_DEFINITION:
				if (workDefinition != null)
					msgs = ((InternalEObject)workDefinition).eInverseRemove(this, SimplepdlPackage.WORK_DEFINITION__RESSOURCE, WorkDefinition.class, msgs);
				return basicSetWorkDefinition((WorkDefinition)otherEnd, msgs);
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
			case SimplepdlPackage.RESSOURCE__STOCK:
				return basicSetStock(null, msgs);
			case SimplepdlPackage.RESSOURCE__WORK_DEFINITION:
				return basicSetWorkDefinition(null, msgs);
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
			case SimplepdlPackage.RESSOURCE__OCCURRENCES:
				return getOccurrences();
			case SimplepdlPackage.RESSOURCE__STOCK:
				if (resolve) return getStock();
				return basicGetStock();
			case SimplepdlPackage.RESSOURCE__WORK_DEFINITION:
				if (resolve) return getWorkDefinition();
				return basicGetWorkDefinition();
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
			case SimplepdlPackage.RESSOURCE__OCCURRENCES:
				setOccurrences((Integer)newValue);
				return;
			case SimplepdlPackage.RESSOURCE__STOCK:
				setStock((Stock)newValue);
				return;
			case SimplepdlPackage.RESSOURCE__WORK_DEFINITION:
				setWorkDefinition((WorkDefinition)newValue);
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
			case SimplepdlPackage.RESSOURCE__OCCURRENCES:
				setOccurrences(OCCURRENCES_EDEFAULT);
				return;
			case SimplepdlPackage.RESSOURCE__STOCK:
				setStock((Stock)null);
				return;
			case SimplepdlPackage.RESSOURCE__WORK_DEFINITION:
				setWorkDefinition((WorkDefinition)null);
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
			case SimplepdlPackage.RESSOURCE__OCCURRENCES:
				return OCCURRENCES_EDEFAULT == null ? occurrences != null : !OCCURRENCES_EDEFAULT.equals(occurrences);
			case SimplepdlPackage.RESSOURCE__STOCK:
				return stock != null;
			case SimplepdlPackage.RESSOURCE__WORK_DEFINITION:
				return workDefinition != null;
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
		result.append(" (occurrences: ");
		result.append(occurrences);
		result.append(')');
		return result.toString();
	}

} //RessourceImpl
