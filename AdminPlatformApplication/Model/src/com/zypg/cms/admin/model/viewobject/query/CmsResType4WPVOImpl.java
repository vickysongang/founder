package com.zypg.cms.admin.model.viewobject.query;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Apr 16 18:13:10 CST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CmsResType4WPVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public CmsResType4WPVOImpl() {
    }

    /**
     * Returns the bind variable value for bvLibCode.
     * @return bind variable value for bvLibCode
     */
    public String getbvLibCode() {
        return (String)getNamedWhereClauseParam("bvLibCode");
    }

    /**
     * Sets <code>value</code> for bind variable bvLibCode.
     * @param value value to bind as bvLibCode
     */
    public void setbvLibCode(String value) {
        setNamedWhereClauseParam("bvLibCode", value);
    }
}