/**
 */
package calcul.impl;

import calcul.CalculPackage;
import calcul.Unaire;
import calcul.UnaryType;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link calcul.impl.UnaireImpl#getUnaryType <em>Unary Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnaireImpl extends ExpressionImpl implements Unaire {
	/**
	 * The default value of the '{@link #getUnaryType() <em>Unary Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnaryType()
	 * @generated
	 * @ordered
	 */
	protected static final UnaryType UNARY_TYPE_EDEFAULT = UnaryType.SIN;

	/**
	 * The cached value of the '{@link #getUnaryType() <em>Unary Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnaryType()
	 * @generated
	 * @ordered
	 */
	protected UnaryType unaryType = UNARY_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CalculPackage.Literals.UNAIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryType getUnaryType() {
		return unaryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnaryType(UnaryType newUnaryType) {
		UnaryType oldUnaryType = unaryType;
		unaryType = newUnaryType == null ? UNARY_TYPE_EDEFAULT : newUnaryType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalculPackage.UNAIRE__UNARY_TYPE, oldUnaryType, unaryType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CalculPackage.UNAIRE__UNARY_TYPE:
				return getUnaryType();
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
			case CalculPackage.UNAIRE__UNARY_TYPE:
				setUnaryType((UnaryType)newValue);
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
			case CalculPackage.UNAIRE__UNARY_TYPE:
				setUnaryType(UNARY_TYPE_EDEFAULT);
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
			case CalculPackage.UNAIRE__UNARY_TYPE:
				return unaryType != UNARY_TYPE_EDEFAULT;
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
		result.append(" (unaryType: ");
		result.append(unaryType);
		result.append(')');
		return result.toString();
	}

} //UnaireImpl
