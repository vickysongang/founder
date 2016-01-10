package com.zypg.cms.work.model.viewobject.resexp.query;

import oracle.jbo.domain.Date;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Dec 27 14:19:19 CST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CmsSearchExportVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public CmsSearchExportVOImpl() {
    }

    /**
     * Returns the variable value for bvBookName.
     * @return variable value for bvBookName
     */
    public String getbvBookName() {
        return (String)ensureVariableManager().getVariableValue("bvBookName");
    }

    /**
     * Sets <code>value</code> for variable bvBookName.
     * @param value value to bind as bvBookName
     */
    public void setbvBookName(String value) {
        ensureVariableManager().setVariableValue("bvBookName", value);
    }

    /**
     * Returns the variable value for bvPaperFlag.
     * @return variable value for bvPaperFlag
     */
    public String getbvPaperFlag() {
        return (String)ensureVariableManager().getVariableValue("bvPaperFlag");
    }

    /**
     * Sets <code>value</code> for variable bvPaperFlag.
     * @param value value to bind as bvPaperFlag
     */
    public void setbvPaperFlag(String value) {
        ensureVariableManager().setVariableValue("bvPaperFlag", value);
    }

    /**
     * Returns the variable value for bvEditor.
     * @return variable value for bvEditor
     */
    public String getbvEditor() {
        return (String)ensureVariableManager().getVariableValue("bvEditor");
    }

    /**
     * Sets <code>value</code> for variable bvEditor.
     * @param value value to bind as bvEditor
     */
    public void setbvEditor(String value) {
        ensureVariableManager().setVariableValue("bvEditor", value);
    }

    /**
     * Returns the variable value for bvSeries.
     * @return variable value for bvSeries
     */
    public String getbvSeries() {
        return (String)ensureVariableManager().getVariableValue("bvSeries");
    }

    /**
     * Sets <code>value</code> for variable bvSeries.
     * @param value value to bind as bvSeries
     */
    public void setbvSeries(String value) {
        ensureVariableManager().setVariableValue("bvSeries", value);
    }


    /**
     * Returns the variable value for bvNetworkFlag.
     * @return variable value for bvNetworkFlag
     */
    public String getbvNetworkFlag() {
        return (String)ensureVariableManager().getVariableValue("bvNetworkFlag");
    }

    /**
     * Sets <code>value</code> for variable bvNetworkFlag.
     * @param value value to bind as bvNetworkFlag
     */
    public void setbvNetworkFlag(String value) {
        ensureVariableManager().setVariableValue("bvNetworkFlag", value);
    }

    /**
     * Returns the variable value for bvAuthor.
     * @return variable value for bvAuthor
     */
    public String getbvAuthor() {
        return (String)ensureVariableManager().getVariableValue("bvAuthor");
    }

    /**
     * Sets <code>value</code> for variable bvAuthor.
     * @param value value to bind as bvAuthor
     */
    public void setbvAuthor(String value) {
        ensureVariableManager().setVariableValue("bvAuthor", value);
    }

    /**
     * Returns the variable value for bvCompCode.
     * @return variable value for bvCompCode
     */
    public String getbvCompCode() {
        return (String)ensureVariableManager().getVariableValue("bvCompCode");
    }

    /**
     * Sets <code>value</code> for variable bvCompCode.
     * @param value value to bind as bvCompCode
     */
    public void setbvCompCode(String value) {
        ensureVariableManager().setVariableValue("bvCompCode", value);
    }

    /**
     * Returns the variable value for bvCategoryName.
     * @return variable value for bvCategoryName
     */
    public String getbvCategoryName() {
        return (String)ensureVariableManager().getVariableValue("bvCategoryName");
    }

    /**
     * Sets <code>value</code> for variable bvCategoryName.
     * @param value value to bind as bvCategoryName
     */
    public void setbvCategoryName(String value) {
        ensureVariableManager().setVariableValue("bvCategoryName", value);
    }

    /**
     * Returns the bind variable value for bvPubTimeFrom.
     * @return bind variable value for bvPubTimeFrom
     */
    public Date getbvPubTimeFrom() {
        return (Date)getNamedWhereClauseParam("bvPubTimeFrom");
    }

    /**
     * Sets <code>value</code> for bind variable bvPubTimeFrom.
     * @param value value to bind as bvPubTimeFrom
     */
    public void setbvPubTimeFrom(Date value) {
        setNamedWhereClauseParam("bvPubTimeFrom", value);
    }

    /**
     * Returns the variable value for bvPubTimeTo.
     * @return variable value for bvPubTimeTo
     */
    public Date getbvPubTimeTo() {
        return (Date)ensureVariableManager().getVariableValue("bvPubTimeTo");
    }

    /**
     * Sets <code>value</code> for variable bvPubTimeTo.
     * @param value value to bind as bvPubTimeTo
     */
    public void setbvPubTimeTo(Date value) {
        ensureVariableManager().setVariableValue("bvPubTimeTo", value);
    }

    /**
     * Returns the variable value for bvStatus.
     * @return variable value for bvStatus
     */
    public String getbvStatus() {
        return (String)ensureVariableManager().getVariableValue("bvStatus");
    }

    /**
     * Sets <code>value</code> for variable bvStatus.
     * @param value value to bind as bvStatus
     */
    public void setbvStatus(String value) {
        ensureVariableManager().setVariableValue("bvStatus", value);
    }
}