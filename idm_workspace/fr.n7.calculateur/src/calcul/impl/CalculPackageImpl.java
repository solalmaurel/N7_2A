/**
 */
package calcul.impl;

import calcul.Binaire;
import calcul.BinaryTypes;
import calcul.CalculElements;
import calcul.CalculFactory;
import calcul.CalculPackage;
import calcul.Constante;
import calcul.Entree;
import calcul.Expression;
import calcul.Link;
import calcul.Sortie;
import calcul.UnCalcul;
import calcul.Unaire;
import calcul.UnaryType;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CalculPackageImpl extends EPackageImpl implements CalculPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculElementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constanteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortieEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unCalculEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum binaryTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unaryTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see calcul.CalculPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CalculPackageImpl() {
		super(eNS_URI, CalculFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CalculPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CalculPackage init() {
		if (isInited) return (CalculPackage)EPackage.Registry.INSTANCE.getEPackage(CalculPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCalculPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CalculPackageImpl theCalculPackage = registeredCalculPackage instanceof CalculPackageImpl ? (CalculPackageImpl)registeredCalculPackage : new CalculPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCalculPackage.createPackageContents();

		// Initialize created meta-data
		theCalculPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCalculPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CalculPackage.eNS_URI, theCalculPackage);
		return theCalculPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCalculElements() {
		return calculElementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCalculElements_UnCalcul() {
		return (EReference)calculElementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExpression_Name() {
		return (EAttribute)expressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExpression_Valeur() {
		return (EAttribute)expressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpression_LinkToPredecessor() {
		return (EReference)expressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpression_LinkToSuccessor() {
		return (EReference)expressionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinaire() {
		return binaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBinaire_BinaryType() {
		return (EAttribute)binaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnaire() {
		return unaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnaire_UnaryType() {
		return (EAttribute)unaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstante() {
		return constanteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntree() {
		return entreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSortie() {
		return sortieEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_Name() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLink_Predecessor() {
		return (EReference)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLink_Successor() {
		return (EReference)linkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnCalcul() {
		return unCalculEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnCalcul_CalculElements() {
		return (EReference)unCalculEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnCalcul_Name() {
		return (EAttribute)unCalculEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBinaryTypes() {
		return binaryTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUnaryType() {
		return unaryTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CalculFactory getCalculFactory() {
		return (CalculFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		calculElementsEClass = createEClass(CALCUL_ELEMENTS);
		createEReference(calculElementsEClass, CALCUL_ELEMENTS__UN_CALCUL);

		expressionEClass = createEClass(EXPRESSION);
		createEAttribute(expressionEClass, EXPRESSION__NAME);
		createEAttribute(expressionEClass, EXPRESSION__VALEUR);
		createEReference(expressionEClass, EXPRESSION__LINK_TO_PREDECESSOR);
		createEReference(expressionEClass, EXPRESSION__LINK_TO_SUCCESSOR);

		binaireEClass = createEClass(BINAIRE);
		createEAttribute(binaireEClass, BINAIRE__BINARY_TYPE);

		unaireEClass = createEClass(UNAIRE);
		createEAttribute(unaireEClass, UNAIRE__UNARY_TYPE);

		constanteEClass = createEClass(CONSTANTE);

		entreeEClass = createEClass(ENTREE);

		sortieEClass = createEClass(SORTIE);

		linkEClass = createEClass(LINK);
		createEAttribute(linkEClass, LINK__NAME);
		createEReference(linkEClass, LINK__PREDECESSOR);
		createEReference(linkEClass, LINK__SUCCESSOR);

		unCalculEClass = createEClass(UN_CALCUL);
		createEReference(unCalculEClass, UN_CALCUL__CALCUL_ELEMENTS);
		createEAttribute(unCalculEClass, UN_CALCUL__NAME);

		// Create enums
		binaryTypesEEnum = createEEnum(BINARY_TYPES);
		unaryTypeEEnum = createEEnum(UNARY_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		expressionEClass.getESuperTypes().add(this.getCalculElements());
		binaireEClass.getESuperTypes().add(this.getExpression());
		unaireEClass.getESuperTypes().add(this.getExpression());
		constanteEClass.getESuperTypes().add(this.getExpression());
		entreeEClass.getESuperTypes().add(this.getExpression());
		sortieEClass.getESuperTypes().add(this.getExpression());
		linkEClass.getESuperTypes().add(this.getCalculElements());

		// Initialize classes, features, and operations; add parameters
		initEClass(calculElementsEClass, CalculElements.class, "CalculElements", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalculElements_UnCalcul(), this.getUnCalcul(), this.getUnCalcul_CalculElements(), "unCalcul", null, 1, 1, CalculElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpression_Name(), ecorePackage.getEString(), "name", null, 1, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpression_Valeur(), ecorePackage.getEFloatObject(), "valeur", null, 1, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_LinkToPredecessor(), this.getLink(), this.getLink_Successor(), "linkToPredecessor", null, 0, -1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_LinkToSuccessor(), this.getLink(), this.getLink_Predecessor(), "linkToSuccessor", null, 0, -1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaireEClass, Binaire.class, "Binaire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaire_BinaryType(), this.getBinaryTypes(), "binaryType", null, 1, 1, Binaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaireEClass, Unaire.class, "Unaire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnaire_UnaryType(), this.getUnaryType(), "unaryType", null, 1, 1, Unaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constanteEClass, Constante.class, "Constante", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entreeEClass, Entree.class, "Entree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sortieEClass, Sortie.class, "Sortie", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLink_Name(), ecorePackage.getEString(), "name", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_Predecessor(), this.getExpression(), this.getExpression_LinkToSuccessor(), "predecessor", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_Successor(), this.getExpression(), this.getExpression_LinkToPredecessor(), "successor", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unCalculEClass, UnCalcul.class, "UnCalcul", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnCalcul_CalculElements(), this.getCalculElements(), this.getCalculElements_UnCalcul(), "calculElements", null, 0, -1, UnCalcul.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnCalcul_Name(), ecorePackage.getEString(), "name", null, 1, 1, UnCalcul.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(binaryTypesEEnum, BinaryTypes.class, "BinaryTypes");
		addEEnumLiteral(binaryTypesEEnum, BinaryTypes.ADDITION);
		addEEnumLiteral(binaryTypesEEnum, BinaryTypes.SOUSTRACTION);
		addEEnumLiteral(binaryTypesEEnum, BinaryTypes.DIVISION);

		initEEnum(unaryTypeEEnum, UnaryType.class, "UnaryType");
		addEEnumLiteral(unaryTypeEEnum, UnaryType.SIN);
		addEEnumLiteral(unaryTypeEEnum, UnaryType.COS);
		addEEnumLiteral(unaryTypeEEnum, UnaryType.OPPOSEE);

		// Create resource
		createResource(eNS_URI);
	}

} //CalculPackageImpl
