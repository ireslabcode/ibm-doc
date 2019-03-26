/*
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cclms;

import ilog.odm.dom.IloDomObject;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @extends IloDomObject
 * @generated
 */
public interface KpiLinkEngine extends IloDomObject {
	/**
	 * Returns the value of the '<em><b>Kpi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kpi Id</em>' attribute.
	 * @see #isSetKpiId()
	 * @see #unsetKpiId()
	 * @see #setKpiId(int)
	 * @generated
	 */
	int getKpiId();

	/**
	 * Sets the value of the '{@link cclms.KpiLinkEngine#getKpiId <em>Kpi Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kpi Id</em>' attribute.
	 * @see #isSetKpiId()
	 * @see #unsetKpiId()
	 * @see #getKpiId()
	 * @generated
	 */
	void setKpiId(int value);

	/**
	 * Unsets the value of the '{@link cclms.KpiLinkEngine#getKpiId <em>Kpi Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKpiId()
	 * @see #getKpiId()
	 * @see #setKpiId(int)
	 * @generated
	 */
	void unsetKpiId();

	/**
	 * Returns whether the value of the '{@link cclms.KpiLinkEngine#getKpiId <em>Kpi Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kpi Id</em>' attribute is set.
	 * @see #unsetKpiId()
	 * @see #getKpiId()
	 * @see #setKpiId(int)
	 * @generated
	 */
	boolean isSetKpiId();

	/**
	 * Returns the value of the '<em><b>Kpi Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kpi Desc</em>' attribute.
	 * @see #setKpiDesc(String)
	 * @generated
	 */
	String getKpiDesc();

	/**
	 * Sets the value of the '{@link cclms.KpiLinkEngine#getKpiDesc <em>Kpi Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kpi Desc</em>' attribute.
	 * @see #getKpiDesc()
	 * @generated
	 */
	void setKpiDesc(String value);

	/**
	 * Returns the value of the '<em><b>Kpi Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kpi Value</em>' attribute.
	 * @see #isSetKpiValue()
	 * @see #unsetKpiValue()
	 * @see #setKpiValue(double)
	 * @generated
	 */
	double getKpiValue();

	/**
	 * Sets the value of the '{@link cclms.KpiLinkEngine#getKpiValue <em>Kpi Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kpi Value</em>' attribute.
	 * @see #isSetKpiValue()
	 * @see #unsetKpiValue()
	 * @see #getKpiValue()
	 * @generated
	 */
	void setKpiValue(double value);

	/**
	 * Unsets the value of the '{@link cclms.KpiLinkEngine#getKpiValue <em>Kpi Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKpiValue()
	 * @see #getKpiValue()
	 * @see #setKpiValue(double)
	 * @generated
	 */
	void unsetKpiValue();

	/**
	 * Returns whether the value of the '{@link cclms.KpiLinkEngine#getKpiValue <em>Kpi Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kpi Value</em>' attribute is set.
	 * @see #unsetKpiValue()
	 * @see #getKpiValue()
	 * @see #setKpiValue(double)
	 * @generated
	 */
	boolean isSetKpiValue();

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
	 * Sets the value of the '{@link cclms.KpiLinkEngine#getUom <em>Uom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom</em>' attribute.
	 * @see #getUom()
	 * @generated
	 */
	void setUom(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CclmsCollector getCollector();

} // KpiLinkEngine
