package com.zypg.cms.work.model.am.client;

import com.zypg.cms.work.model.am.common.PeriodicalAM;

import oracle.jbo.client.remote.ApplicationModuleImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jun 11 20:40:29 CST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PeriodicalAMClient extends ApplicationModuleImpl implements PeriodicalAM {
    /**
     * This is the default constructor (do not remove).
     */
    public PeriodicalAMClient() {
    }

    public void initPeriodNum(oracle.jbo.domain.Number categoryId, String year) {
        Object _ret =
            this.riInvokeExportedMethod(this,"initPeriodNum",new String [] {"oracle.jbo.domain.Number","java.lang.String"},new Object[] {categoryId, year});
        return;
    }

    public void initYear(oracle.jbo.domain.Number categoryId) {
        Object _ret = this.riInvokeExportedMethod(this,"initYear",new String [] {"oracle.jbo.domain.Number"},new Object[] {categoryId});
        return;
    }
}