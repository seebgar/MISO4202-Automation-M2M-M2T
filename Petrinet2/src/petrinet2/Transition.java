/**
 */
package petrinet2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet2.Transition#getMaxDelay <em>Max Delay</em>}</li>
 *   <li>{@link petrinet2.Transition#getMinDelay <em>Min Delay</em>}</li>
 * </ul>
 *
 * @see petrinet2.Petrinet2Package#getTransition()
 * @model
 * @generated
 */
public interface Transition extends Node {
	/**
	 * Returns the value of the '<em><b>Max Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Delay</em>' attribute.
	 * @see #setMaxDelay(double)
	 * @see petrinet2.Petrinet2Package#getTransition_MaxDelay()
	 * @model
	 * @generated
	 */
	double getMaxDelay();

	/**
	 * Sets the value of the '{@link petrinet2.Transition#getMaxDelay <em>Max Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Delay</em>' attribute.
	 * @see #getMaxDelay()
	 * @generated
	 */
	void setMaxDelay(double value);

	/**
	 * Returns the value of the '<em><b>Min Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Delay</em>' attribute.
	 * @see #setMinDelay(double)
	 * @see petrinet2.Petrinet2Package#getTransition_MinDelay()
	 * @model
	 * @generated
	 */
	double getMinDelay();

	/**
	 * Sets the value of the '{@link petrinet2.Transition#getMinDelay <em>Min Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Delay</em>' attribute.
	 * @see #getMinDelay()
	 * @generated
	 */
	void setMinDelay(double value);

} // Transition
