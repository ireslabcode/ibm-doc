/*
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cclms;

import ilog.odm.dom.IloDomObject;

import java.util.Date;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @extends IloDomObject
 * @generated
 */
public interface ParameterMst extends IloDomObject {
	/**
	 * Returns the value of the '<em><b>Parameter Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Id</em>' attribute.
	 * @see #isSetParameterId()
	 * @see #unsetParameterId()
	 * @see #setParameterId(int)
	 * @generated
	 */
	int getParameterId();

	/**
	 * Sets the value of the '{@link cclms.ParameterMst#getParameterId <em>Parameter Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Id</em>' attribute.
	 * @see #isSetParameterId()
	 * @see #unsetParameterId()
	 * @see #getParameterId()
	 * @generated
	 */
	void setParameterId(int value);

	/**
	 * Unsets the value of the '{@link cclms.ParameterMst#getParameterId <em>Parameter Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetParameterId()
	 * @see #getParameterId()
	 * @see #setParameterId(int)
	 * @generated
	 */
	void unsetParameterId();

	/**
	 * Returns whether the value of the '{@link cclms.ParameterMst#getParameterId <em>Parameter Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Parameter Id</em>' attribute is set.
	 * @see #unsetParameterId()
	 * @see #getParameterId()
	 * @see #setParameterId(int)
	 * @generated
	 */
	boolean isSetParameterId();

	/**
	 * Returns the value of the '<em><b>Parameter Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Desc</em>' attribute.
	 * @see #setParameterDesc(String)
	 * @generated
	 */
	String getParameterDesc();

	/**
	 * Sets the value of the '{@link cclms.ParameterMst#getParameterDesc <em>Parameter Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Desc</em>' attribute.
	 * @see #getParameterDesc()
	 * @generated
	 */
	void setParameterDesc(String value);

	/**
	 * Returns the value of the '<em><b>Uom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uom</em>' attribute.
	 * @see #setUom(String)
	 * @generated
	 */
	String getUom();

	/**
	 * Sets the value of the '{@link cclms.ParameterMst#getUom <em>Uom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom</em>' attribute.
	 * @see #getUom()
	 * @generated
	 */
	void setUom(String value);

	/**
	 * Returns the value of the '<em><b>Global Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Value</em>' attribute.
	 * @see #isSetGlobalValue()
	 * @see #unsetGlobalValue()
	 * @see #setGlobalValue(double)
	 * @generated
	 */
	double getGlobalValue();

	/**
	 * Sets the value of the '{@link cclms.ParameterMst#getGlobalValue <em>Global Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Value</em>' attribute.
	 * @see #isSetGlobalValue()
	 * @see #unsetGlobalValue()
	 * @see #getGlobalValue()
	 * @generated
	 */
	void setGlobalValue(double value);

	/**
	 * Unsets the value of the '{@link cclms.ParameterMst#getGlobalValue <em>Global Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGlobalValue()
	 * @see #getGlobalValue()
	 * @see #setGlobalValue(double)
	 * @generated
	 */
	void unsetGlobalValue();

	/**
	 * Returns whether the value of the '{@link cclms.ParameterMst#getGlobalValue <em>Global Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Global Value</em>' attribute is set.
	 * @see #unsetGlobalValue()
	 * @see #getGlobalValue()
	 * @see #setGlobalValue(double)
	 * @generated
	 */
	boolean isSetGlobalValue();

	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #isSetMinValue()
	 * @see #unsetMinValue()
	 * @see #setMinValue(double)
	 * @generated
	 */
	double getMinValue();

	/**
	 * Sets the value of the '{@link cclms.ParameterMst#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #isSetMinValue()
	 * @see #unsetMinValue()
	 * @see #getMinValue()
	 * @generated
	 */
	void setMinValue(double value);

	/**
	 * Unsets the value of the '{@link cclms.ParameterMst#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinValue()
	 * @see #getMinValue()
	 * @see #setMinValue(double)
	 * @generated
	 */
	void unsetMinValue();

	/**
	 * Returns whether the value of the '{@link cclms.ParameterMst#getMinValue <em>Min Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Value</em>' attribute is set.
	 * @see #unsetMinValue()
	 * @see #getMinValue()
	 * @see #setMinValue(double)
	 * @generated
	 */
	boolean isSetMinValue();

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #isSetMaxValue()
	 * @see #unsetMaxValue()
	 * @see #setMaxValue(double)
	 * @generated
	 */
	double getMaxValue();

	/**
	 * Sets the value of the '{@link cclms.ParameterMst#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #isSetMaxValue()
	 * @see #unsetMaxValue()
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(double value);

	/**
	 * Unsets the value of the '{@link cclms.ParameterMst#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxValue()
	 * @see #getMaxValue()
	 * @see #setMaxValue(double)
	 * @generated
	 */
	void unsetMaxValue();

	/**
	 * Returns whether the value of the '{@link cclms.ParameterMst#getMaxValue <em>Max Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Value</em>' attribute is set.
	 * @see #unsetMaxValue()
	 * @see #getMaxValue()
	 * @see #setMaxValue(double)
	 * @generated
	 */
	boolean isSetMaxValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	List<ParameterValue> getParameterValueParameterId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CclmsCollector getCollector();

} // ParameterMst
