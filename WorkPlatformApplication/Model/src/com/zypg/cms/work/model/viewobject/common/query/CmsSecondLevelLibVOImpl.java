package com.zypg.cms.work.model.viewobject.common.query;

import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon May 26 21:04:43 CST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CmsSecondLevelLibVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public CmsSecondLevelLibVOImpl() {
    }

    /**
     * Returns the variable value for bvUserId.
     * @return variable value for bvUserId
     */
    public Number getbvUserId() {
        return (Number)ensureVariableManager().getVariableValue("bvUserId");
    }

    /**
     * Sets <code>value</code> for variable bvUserId.
     * @param value value to bind as bvUserId
     */
    public void setbvUserId(Number value) {
        ensureVariableManager().setVariableValue("bvUserId", value);
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
}