package com.zypg.cms.work.model.viewobject.common.query;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat May 09 14:38:53 CST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CmsDocStatus4CheckImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public CmsDocStatus4CheckImpl() {
    }

    /**
     * Returns the variable value for bvLibCode.
     * @return variable value for bvLibCode
     */
    public String getbvLibCode() {
        return (String)ensureVariableManager().getVariableValue("bvLibCode");
    }

    /**
     * Sets <code>value</code> for variable bvLibCode.
     * @param value value to bind as bvLibCode
     */
    public void setbvLibCode(String value) {
        ensureVariableManager().setVariableValue("bvLibCode", value);
    }
}