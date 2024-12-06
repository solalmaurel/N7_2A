/**
 */
package calcul.tests;

import calcul.CalculFactory;
import calcul.UnCalcul;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Un Calcul</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnCalculTest extends TestCase {

	/**
	 * The fixture for this Un Calcul test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnCalcul fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UnCalculTest.class);
	}

	/**
	 * Constructs a new Un Calcul test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnCalculTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Un Calcul test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(UnCalcul fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Un Calcul test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnCalcul getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CalculFactory.eINSTANCE.createUnCalcul());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //UnCalculTest
