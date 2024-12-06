/**
 */
package simplepdl.tests;

import junit.textui.TestRunner;

import simplepdl.SimplepdlFactory;
import simplepdl.Stock;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Stock</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StockTest extends ProcessElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StockTest.class);
	}

	/**
	 * Constructs a new Stock test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StockTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Stock test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Stock getFixture() {
		return (Stock)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SimplepdlFactory.eINSTANCE.createStock());
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

} //StockTest
