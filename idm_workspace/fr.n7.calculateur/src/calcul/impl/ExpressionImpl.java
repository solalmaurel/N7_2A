/**
 */
package calcul.impl;

import calcul.CalculPackage;
import calcul.Expression;

import calcul.Link;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link calcul.impl.ExpressionImpl#getName <em>Name</em>}</li>
 *   <li>{@link calcul.impl.ExpressionImpl#getValeur <em>Valeur</em>}</li>
 *   <li>{@link calcul.impl.ExpressionImpl#getLinkToPredecessor <em>Link To Predecessor</em>}</li>
 *   <li>{@link calcul.impl.ExpressionImpl#getLinkToSuccessor <em>Link To Successor</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExpressionImpl extends CalculElementsImpl implements Expression {
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
	 * The default value of the '{@link #getValeur() <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur()
	 * @generated
	 * @ordered
	 */
	protected static final Float VALEUR_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getValeur() <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur()
	 * @generated
	 * @ordered
	 */
	protected Float valeur = VALEUR_EDEFAULT;
	/**
	 * The cached value of the '{@link #getLinkToPredecessor() <em>Link To Predecessor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkToPredecessor()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> linkToPredecessor;
	/**
	 * The cached value of the '{@link #getLinkToSuccessor() <em>Link To Successor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkToSuccessor()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> linkToSuccessor;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CalculPackage.Literals.EXPRESSION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CalculPackage.EXPRESSION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getValeur() {
		return valeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValeur(Float newValeur) {
		Float oldValeur = valeur;
		valeur = newValeur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalculPackage.EXPRESSION__VALEUR, oldValeur, valeur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getLinkToPredecessor() {
		if (linkToPredecessor == null) {
			linkToPredecessor = new EObjectWithInverseResolvingEList<Link>(Link.class, this, CalculPackage.EXPRESSION__LINK_TO_PREDECESSOR, CalculPackage.LINK__SUCCESSOR);
		}
		return linkToPredecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getLinkToSuccessor() {
		if (linkToSuccessor == null) {
			linkToSuccessor = new EObjectWithInverseResolvingEList<Link>(Link.class, this, CalculPackage.EXPRESSION__LINK_TO_SUCCESSOR, CalculPackage.LINK__PREDECESSOR);
		}
		return linkToSuccessor;
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
			case CalculPackage.EXPRESSION__LINK_TO_PREDECESSOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLinkToPredecessor()).basicAdd(otherEnd, msgs);
			case CalculPackage.EXPRESSION__LINK_TO_SUCCESSOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLinkToSuccessor()).basicAdd(otherEnd, msgs);
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
			case CalculPackage.EXPRESSION__LINK_TO_PREDECESSOR:
				return ((InternalEList<?>)getLinkToPredecessor()).basicRemove(otherEnd, msgs);
			case CalculPackage.EXPRESSION__LINK_TO_SUCCESSOR:
				return ((InternalEList<?>)getLinkToSuccessor()).basicRemove(otherEnd, msgs);
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
			case CalculPackage.EXPRESSION__NAME:
				return getName();
			case CalculPackage.EXPRESSION__VALEUR:
				return getValeur();
			case CalculPackage.EXPRESSION__LINK_TO_PREDECESSOR:
				return getLinkToPredecessor();
			case CalculPackage.EXPRESSION__LINK_TO_SUCCESSOR:
				return getLinkToSuccessor();
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
			case CalculPackage.EXPRESSION__NAME:
				setName((String)newValue);
				return;
			case CalculPackage.EXPRESSION__VALEUR:
				setValeur((Float)newValue);
				return;
			case CalculPackage.EXPRESSION__LINK_TO_PREDECESSOR:
				getLinkToPredecessor().clear();
				getLinkToPredecessor().addAll((Collection<? extends Link>)newValue);
				return;
			case CalculPackage.EXPRESSION__LINK_TO_SUCCESSOR:
				getLinkToSuccessor().clear();
				getLinkToSuccessor().addAll((Collection<? extends Link>)newValue);
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
			case CalculPackage.EXPRESSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CalculPackage.EXPRESSION__VALEUR:
				setValeur(VALEUR_EDEFAULT);
				return;
			case CalculPackage.EXPRESSION__LINK_TO_PREDECESSOR:
				getLinkToPredecessor().clear();
				return;
			case CalculPackage.EXPRESSION__LINK_TO_SUCCESSOR:
				getLinkToSuccessor().clear();
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
			case CalculPackage.EXPRESSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CalculPackage.EXPRESSION__VALEUR:
				return VALEUR_EDEFAULT == null ? valeur != null : !VALEUR_EDEFAULT.equals(valeur);
			case CalculPackage.EXPRESSION__LINK_TO_PREDECESSOR:
				return linkToPredecessor != null && !linkToPredecessor.isEmpty();
			case CalculPackage.EXPRESSION__LINK_TO_SUCCESSOR:
				return linkToSuccessor != null && !linkToSuccessor.isEmpty();
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
		result.append(", valeur: ");
		result.append(valeur);
		result.append(')');
		return result.toString();
	}

} //ExpressionImpl
