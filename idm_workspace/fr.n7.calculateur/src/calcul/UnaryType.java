/**
 */
package calcul;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Unary Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see calcul.CalculPackage#getUnaryType()
 * @model
 * @generated
 */
public enum UnaryType implements Enumerator {
	/**
	 * The '<em><b>Sin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIN_VALUE
	 * @generated
	 * @ordered
	 */
	SIN(0, "sin", "sin"),

	/**
	 * The '<em><b>Cos</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COS_VALUE
	 * @generated
	 * @ordered
	 */
	COS(1, "cos", "cos"),

	/**
	 * The '<em><b>Opposee</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPPOSEE_VALUE
	 * @generated
	 * @ordered
	 */
	OPPOSEE(2, "Opposee", "Opposee");

	/**
	 * The '<em><b>Sin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIN
	 * @model name="sin"
	 * @generated
	 * @ordered
	 */
	public static final int SIN_VALUE = 0;

	/**
	 * The '<em><b>Cos</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COS
	 * @model name="cos"
	 * @generated
	 * @ordered
	 */
	public static final int COS_VALUE = 1;

	/**
	 * The '<em><b>Opposee</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPPOSEE
	 * @model name="Opposee"
	 * @generated
	 * @ordered
	 */
	public static final int OPPOSEE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Unary Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UnaryType[] VALUES_ARRAY =
		new UnaryType[] {
			SIN,
			COS,
			OPPOSEE,
		};

	/**
	 * A public read-only list of all the '<em><b>Unary Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UnaryType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Unary Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnaryType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnaryType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Unary Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnaryType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnaryType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Unary Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnaryType get(int value) {
		switch (value) {
			case SIN_VALUE: return SIN;
			case COS_VALUE: return COS;
			case OPPOSEE_VALUE: return OPPOSEE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private UnaryType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //UnaryType
