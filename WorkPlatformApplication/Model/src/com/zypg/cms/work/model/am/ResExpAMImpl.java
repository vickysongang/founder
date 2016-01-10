package com.zypg.cms.work.model.am;


import com.honythink.applicationframework.hadf.CustomApplicationModuleImpl;

import com.zypg.cms.work.model.viewobject.common.query.CmsCompVOImpl;
import com.zypg.cms.work.model.viewobject.resexp.CmsResExpApplyHTVOImpl;
import com.zypg.cms.work.model.viewobject.resexp.CmsResExpApplyHTVORowImpl;
import com.zypg.cms.work.model.viewobject.resexp.CmsResExpApplyLTVOImpl;
import com.zypg.cms.work.model.viewobject.resexp.CmsResExpApplyLTVORowImpl;
import com.zypg.cms.work.model.viewobject.resexp.CmsResTempShelfTVOImpl;
import com.zypg.cms.work.model.viewobject.resexp.CmsResTempShelfTVORowImpl;
import com.zypg.cms.work.model.viewobject.resexp.CmsResTemplateRelTVOImpl;
import com.zypg.cms.work.model.viewobject.resexp.CmsResTemplateRelTVORowImpl;
import com.zypg.cms.work.model.viewobject.resexp.CmsResTemplateTVOImpl;
import com.zypg.cms.work.model.viewobject.resexp.CmsResTemplateTVORowImpl;
import com.zypg.cms.work.model.viewobject.resexp.query.CmsFirstLevelExpResVOImpl;
import com.zypg.cms.work.model.viewobject.resexp.query.CmsFirstLevelExpResVORowImpl;
import com.zypg.cms.work.model.viewobject.resexp.query.CmsLib4TempShelfVOImpl;
import com.zypg.cms.work.model.viewobject.resexp.query.CmsLib4TempShelfVORowImpl;
import com.zypg.cms.work.model.viewobject.resexp.query.CmsResAttachExpVOImpl;
import com.zypg.cms.work.model.viewobject.resexp.query.CmsResCommonInfoVOImpl;
import com.zypg.cms.work.model.viewobject.resexp.query.CmsResCommonInfoVORowImpl;
import com.zypg.cms.work.model.viewobject.resexp.query.CmsResExpApplyHVOImpl;
import com.zypg.cms.work.model.viewobject.resexp.query.CmsResExpApplyHVVOImpl;
import com.zypg.cms.work.model.viewobject.resexp.query.CmsResExpApplyHVVORowImpl;
import com.zypg.cms.work.model.viewobject.resexp.query.CmsResExpApplyLVVOImpl;
import com.zypg.cms.work.model.viewobject.resexp.query.CmsResExpTemplateVOImpl;
import com.zypg.cms.work.model.viewobject.resexp.query.CmsResMetadataExpVOImpl;
import com.zypg.cms.work.model.viewobject.resexp.query.CmsResTempShelfVOImpl;
import com.zypg.cms.work.model.viewobject.resexp.query.CmsResTempShelfVORowImpl;
import com.zypg.cms.work.model.viewobject.resexp.query.CmsResTemplateVOImpl;
import com.zypg.cms.work.model.viewobject.resexp.query.CmsResTemplateVORowImpl;
import com.zypg.cms.work.model.viewobject.resexp.query.CmsSearchExportQueryVOImpl;
import com.zypg.cms.work.model.viewobject.resexp.query.CmsSearchExportQueryVORowImpl;
import com.zypg.cms.work.model.viewobject.resexp.query.CmsSearchExportVOImpl;
import com.zypg.cms.work.model.viewobject.resexp.query.CmsSearchExportVORowImpl;
import com.zypg.cms.work.model.viewobject.resexp.query.CmsSecondLevelExpResVOImpl;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewCriteriaRow;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ComponentObjectImpl;
import oracle.jbo.server.RowQualifier;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;


// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon May 19 14:03:30 CST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ResExpAMImpl extends CustomApplicationModuleImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public ResExpAMImpl() {
    }

    public Number getUserID() {
        return this.getCustomDBTransaction().getUserId();
    }


    public boolean checkSelectField(String selectName, String selectCode) {
        ViewObject vo = this.getCmsSelectedExportFieldTVO1();
        ViewCriteria vc = vo.createViewCriteria();
        ViewCriteriaRow vr = vc.createViewCriteriaRow();
        vr.setAttribute("FieldName", selectName);
        vr.setAttribute("FieldCode", selectCode);
        vc.add(vr);
        vo.applyViewCriteria(vc);
        vo.executeQuery();
        if (vo.getRowCount() > 0) {
            return true;
        }
        return false;
    }

    public boolean checkBookExportHtml(String docID) {
        ViewObject vo = this.getCmsSelectedExportFieldTVO1();
        ViewCriteria vc = vo.createViewCriteria();
        ViewCriteriaRow vr = vc.createViewCriteriaRow();
        vr.setAttribute("DocId", docID);
        vc.add(vr);
        vo.applyViewCriteria(vc);
        vo.executeQuery();
        if (vo.getRowCount() > 0) {
            return true;
        }
        return false;
    }

    /**
     *为每个docid创建选择字段
     * @param rows
     * @param docids
     */
    public void createCmsSelectedExportField(Row[] rows, List<Number> docids) {
        ViewObject vo = this.getCmsSelectedExportFieldTVO1();
        for (Number docid : docids) {
            for (Row row : rows) {
                Row newRow = vo.createRow();
                newRow.setAttribute("DocId", docid);
                newRow.setAttribute("FieldCode", row.getAttribute("FieldCode"));
                newRow.setAttribute("FieldName", row.getAttribute("FieldName"));
                vo.insertRow(newRow);
            }
        }
    }

    /**
     * 导出提交创建行
     * @param docid
     * @param theme
     * @param level
     * @param reason
     * @param remarks
     */

    public Number createRowExportBookHtml(Number docid, String theme, String level, String reason, String remarks) {
        Number exportId = new Number(0);
        ViewObject vo = this.getCmsBookExportHtmlTVO1();
        Row newRow = vo.createRow();
        vo.insertRow(newRow);
        newRow.setAttribute("DocId", docid);
        newRow.setAttribute("ExportTheme", theme);
        newRow.setAttribute("CategoryLevel", level);
        newRow.setAttribute("ExportReason", reason);
        newRow.setAttribute("Remarks", remarks);
        Object id = newRow.getAttribute("ExportId");
        if (id != null) {
            exportId = (Number)newRow.getAttribute("ExportId");
        }
        return exportId;
    }


    public void setCmsSelectedExportDefauleField() {
        ViewObject vo = this.getCmsSelectedExportFieldTVO1();
        Row[] row = vo.getFilteredRows("DefaultFlag", "Y");
        for (Row r : row) {
            r.setAttribute("DefaultFlag", "N");
        }
    }

    /**
     * 提导出
     * @param shelfDocIdList
     * @param applyName
     * @param remarks
     * @param compCode
     * @return
     */
    public String submitExportBooKHtml(List<Number> shelfIdList, String theme, String remarks, String level,
                                       String compCode, String reason, String exportId) {
        CmsResExpApplyHTVOImpl resExpApplyHTVO = this.getCmsResExpApplyHTVO();
        //2、申请单行信息 根据shelfDocIdList遍历得到
        CmsResExpApplyLTVOImpl lineVo = this.getCmsResExpApplyLTVO();
        //3、修改暂存架上的行状态
        CmsResTempShelfTVOImpl shelfVo = this.getCmsResTempShelfTVO();
        CmsResExpApplyHTVORowImpl headerRw = (CmsResExpApplyHTVORowImpl)resExpApplyHTVO.createRow();
        resExpApplyHTVO.insertRow(headerRw);
        //   headerRw.setTemplateId(templateID);
        headerRw.setUserId(this.getCustomDBTransaction().getUserId());
        headerRw.setApplyName(theme);
        headerRw.setRemarks(remarks);
        headerRw.setCompCode(compCode);
        headerRw.setAttribute1(reason); //导出原因
        headerRw.setAttribute2("HTML"); //根据自定义模版来下载
        headerRw.setStatus("TO_FIRST_TRIAL_APPLY");
        Number templateID = new Number(0);
        for (Number shelfId : shelfIdList) {
            shelfVo.setbvShelfId(shelfId);
            shelfVo.executeQuery();
            Row row = shelfVo.first();
            if (row != null) {
                CmsResTempShelfTVORowImpl shelfRw = (CmsResTempShelfTVORowImpl)row;
                if (shelfId.equals(shelfIdList.get(0))) {
                    if (exportId != null && exportId.length() > 0) {
                        templateID = new Number(Integer.parseInt(exportId.trim()));
                    }
                } else {
                    templateID = this.createRowExportBookHtml(shelfRw.getDocId(), theme, level, reason, remarks);
                }
                CmsResExpApplyLTVORowImpl lineRw = (CmsResExpApplyLTVORowImpl)lineVo.createRow();
                lineRw.setShelfId(shelfRw.getShelfId());
                lineRw.setHeadId(headerRw.getApplyId());
                lineRw.setAttribute1(templateID + "");
                lineVo.insertRow(lineRw);
                shelfRw.setApplySubmitFlag("Y");
            }
            this.getDBTransaction().commit();
        }
        try {
            Map<String, String> result = submitResExpApply(headerRw.getApplyId(), headerRw.getUserId());
            if ("S".equals(result.get("returnCode"))) {
                this.getDBTransaction().commit();
                return "S";
            } else {
                this.getDBTransaction().rollback();
                return result.get("returnMsg");
            }
        } catch (Exception e) {
            return e.getMessage();
        }
    }


    public void deleteChild(Object obj) {
        this.removeChild((ComponentObjectImpl)obj);
    }

    public String findSecondLevelLib(String compCode) throws SQLException {
        CmsLib4TempShelfVOImpl libVO = this.getCmsLib4TempShelfVO();
        libVO.setbvCompCode(compCode);
        libVO.setbvUserId(this.getCustomDBTransaction().getUserId());
        libVO.executeQuery();
        libVO.setRangeSize(-1);
        CmsLib4TempShelfVORowImpl secondLevelLibRow = (CmsLib4TempShelfVORowImpl)libVO.getRowAtRangeIndex(0);
        if (secondLevelLibRow != null) {
            return secondLevelLibRow.getLibCode();
        }
        return null;
    }

    public void findResTempShelf(String categoryCode, String deleteFlag, String compCode) {
        CmsResTempShelfVOImpl resTempShelfVO = this.getCmsResTempShelfVO();
        resTempShelfVO.setbvCategoryCode(categoryCode);
        resTempShelfVO.setbvUserId(this.getCustomDBTransaction().getUserId());
        resTempShelfVO.setbvDeleteFlag(deleteFlag);
        resTempShelfVO.setbvCompCode(compCode);
        resTempShelfVO.executeQuery();
        resTempShelfVO.setRangeSize(-1);
    }

    public void initResTemplate(String categoryCode, String compCode) {
        CmsResTemplateVOImpl resTemplateVO = this.getCmsResTemplateVO();
        resTemplateVO.setbvUserId(this.getCustomDBTransaction().getUserId());
        resTemplateVO.setbvCategoryCode(categoryCode);
        resTemplateVO.setbvCompCode(compCode);
        resTemplateVO.executeQuery();
    }


    /**
     * 提交申请单
     * @param shelfDocIdList
     * @param applyName
     * @param remarks
     * @param compCode
     * @return
     */
    public String submitApplyDoc(List<Number> shelfDocIdList, String applyName, String remarks, String compCode,
                                 String exportReason) {
        CmsResExpApplyHTVOImpl resExpApplyHTVO = this.getCmsResExpApplyHTVO();
        CmsResExpApplyHTVORowImpl headerRw = (CmsResExpApplyHTVORowImpl)resExpApplyHTVO.createRow();
        resExpApplyHTVO.insertRow(headerRw);
        //1、申请单名（已保存），2、templateID 3、userId
        CmsResTemplateVOImpl vo = this.getCmsResTemplateVO();
        Row[] rws = vo.getFilteredRows("Checked", true);
        if (rws != null && rws.length > 0) {
            CmsResTemplateVORowImpl templateRow = (CmsResTemplateVORowImpl)rws[0];
            headerRw.setTemplateId(templateRow.getTemplateId());
            headerRw.setUserId(this.getCustomDBTransaction().getUserId());
            headerRw.setBatchCode(templateRow.getLastBatchCode());
            headerRw.setApplyName(applyName);
            headerRw.setRemarks(remarks);
            headerRw.setCompCode(compCode);
            headerRw.setAttribute1(exportReason); //导出原因
            headerRw.setAttribute2("TEMPLATE"); //根据自定义模版来下载
            headerRw.setStatus("TO_FIRST_TRIAL_APPLY");
            //2、申请单行信息 根据shelfDocIdList遍历得到
            CmsResExpApplyLTVOImpl lineVo = this.getCmsResExpApplyLTVO();
            //3、修改暂存架上的行状态
            CmsResTempShelfTVOImpl shelfVo = this.getCmsResTempShelfTVO();
            for (Number shelfId : shelfDocIdList) {
                shelfVo.setbvShelfId(shelfId);
                shelfVo.executeQuery();
                Row row = shelfVo.first();
                if (row != null) {
                    CmsResTempShelfTVORowImpl shelfRw = (CmsResTempShelfTVORowImpl)row;
                    CmsResExpApplyLTVORowImpl lineRw = (CmsResExpApplyLTVORowImpl)lineVo.createRow();
                    lineRw.setShelfId(shelfRw.getShelfId());
                    lineRw.setHeadId(headerRw.getApplyId());
                    lineVo.insertRow(lineRw);
                    shelfRw.setApplySubmitFlag("Y");
                }
            }
            this.getDBTransaction().commit();
            try {
                Map<String, String> result = submitResExpApply(headerRw.getApplyId(), headerRw.getUserId());
                if ("S".equals(result.get("returnCode"))) {
                    this.getDBTransaction().commit();
                    return "S";
                } else {
                    this.getDBTransaction().rollback();
                    return result.get("returnMsg");
                }
            } catch (Exception e) {
                return e.getMessage();
            }
        } else {
            return "请选择一个模板！";
        }
    }

    private Map<String, String> submitResExpApply(Number applyId, Number proposerId) {
        Map<String, String> result = new HashMap<String, String>();
        CallableStatement st = null;
        try {
            st =
 this.getDBTransaction().createCallableStatement("begin cms_common_pkg.res_exp_download_apply_submit(?,?,?,?,?); end;",
                                                 this.getDBTransaction().DEFAULT);
            st.setObject(1, applyId);
            st.setObject(2, proposerId);
            st.setString(3, "EXP");
            st.registerOutParameter(4, Types.VARCHAR);
            st.registerOutParameter(5, Types.VARCHAR);
            st.execute();
            result.put("returnCode", st.getString(4));
            result.put("returnMsg", st.getString(5));
        } catch (SQLException e) {
            result.put("returnCode", "E");
            result.put("returnMsg", e.toString());
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException e) {
                    result.put("returnCode", "E");
                    result.put("returnMsg", e.toString());
                }
            }
        }
        return result;
    }

    public Object[] preResTemplateEdit(String mode, Number templateId, String categoryCode, String compCode) {
        Number retTemplateId = templateId;
        String retTempName = "";
        CmsFirstLevelExpResVOImpl firstLevelExpResVO = this.getCmsFirstLevelExpResVO();
        firstLevelExpResVO.setbvCategoryCode(categoryCode);
        CmsResTemplateTVOImpl resTemplateTVO = this.getCmsResTemplateTVO();
        if ("CREATE".equalsIgnoreCase(mode)) {
            CmsResTemplateTVORowImpl resTemplateNewRow = (CmsResTemplateTVORowImpl)resTemplateTVO.createRow();
            resTemplateNewRow.setCategoryCode(categoryCode);
            resTemplateNewRow.setAttribute1(compCode);
            resTemplateTVO.insertRow(resTemplateNewRow);
            retTemplateId = resTemplateNewRow.getTemplateId();
            firstLevelExpResVO.setbvTemplateId(null);
        } else {
            CmsResTemplateTVORowImpl resTemplateNewRow =
                (CmsResTemplateTVORowImpl)resTemplateTVO.getRow(new Key(new Object[] { templateId }));
            resTemplateTVO.setCurrentRow(resTemplateNewRow);
            retTempName = resTemplateNewRow.getTemplateName();
            firstLevelExpResVO.setbvTemplateId(templateId);
        }
        firstLevelExpResVO.executeQuery();
        return new Object[] { retTemplateId, retTempName };
    }

    public void saveResTemplate(Number templateId, String templateName) {
        CmsResTemplateTVOImpl templateVo = this.getCmsResTemplateTVO();
        CmsResTemplateTVORowImpl templateRow =
            (CmsResTemplateTVORowImpl)templateVo.getRow(new Key(new Object[] { templateId }));
        if (templateRow != null) {
            templateRow.setLastBatchCode(System.currentTimeMillis() + "");
            templateRow.setTemplateName(templateName);
            templateRow.setUserId(this.getCustomDBTransaction().getUserId());
            CmsResTemplateRelTVOImpl resTemplateRelTVO = this.getCmsResTemplateRelTVO();

            //再新增
            CmsFirstLevelExpResVOImpl firstLevelExpResVO = this.getCmsFirstLevelExpResVO();
            firstLevelExpResVO.setRangeSize(-1);
            for (Row row : firstLevelExpResVO.getAllRowsInRange()) {
                CmsFirstLevelExpResVORowImpl firstLevelExpResRow = (CmsFirstLevelExpResVORowImpl)row;
                for (Row r : firstLevelExpResRow.getCmsSecondLevelExpResVO().getAllRowsInRange()) {
                    if ((Boolean)r.getAttribute("Checked")) {
                        CmsResTemplateRelTVORowImpl resTemplateRelNewRow =
                            (CmsResTemplateRelTVORowImpl)resTemplateRelTVO.createRow();
                        resTemplateRelNewRow.setResCode((String)r.getAttribute("ResCode"));
                        resTemplateRelNewRow.setResTypeCode((String)r.getAttribute("ResTypeCode"));
                        resTemplateRelNewRow.setTemplateId(templateId);
                        resTemplateRelNewRow.setBatchCode(templateRow.getLastBatchCode());
                        resTemplateRelTVO.insertRow(resTemplateRelNewRow);
                    }
                }
            }
            this.getDBTransaction().commit();
        }
    }

    public String deleteTemplate(Number templateId) {
        String result = "0";
        CmsResTemplateTVOImpl resTemplateTVO = this.getCmsResTemplateTVO();
        Row[] rows = resTemplateTVO.getFilteredRows("TemplateId", templateId);
        if (rows.length > 0) {
            rows[0].setAttribute("DeleteFlag", "Y");
            this.getDBTransaction().commit();
        } else {
            return "未成功删除，请检查!";
        }
        return result;
    }

    /**
     * 检验资源是否已经在暂存架中存在
     * @param docId
     * @return
     */
    private String checkResExsitInShelf(String docId) {
        String resName = null;
        CallableStatement st = null;
        try {
            st =
 this.getDBTransaction().createCallableStatement("begin ? := cms_work_platform_pkg.check_res_exsit_in_shelf(?,?); end;",
                                                 this.getDBTransaction().DEFAULT);
            st.registerOutParameter(1, Types.VARCHAR);
            st.setObject(2, docId);
            st.setObject(3, this.getCustomDBTransaction().getUserId());
            st.execute();
            resName = st.getString(1);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return resName;
    }

    /**
     * 校验资源是否已经在暂存架中存在
     * @param docIds
     * @return
     */
    public String checkeAddTempshelf(String docIds) {
        String resNames = "";
        if (docIds != null && docIds.length() > 0) {
            for (String docId : docIds.substring(0, docIds.length() - 1).split(",")) {
                String resName = this.checkResExsitInShelf(docId);
                if (resName != null) {
                    resNames = resNames + "," + resName;
                }
            }
        }
        if (resNames != null && resNames.length() > 0) {
            return resNames.substring(1, resNames.length());
        }
        return null;
    }

    public String addToTempShelf(String docIds) {
        if (docIds.length() == 0) {
            return "1";
        }
        CmsResTempShelfTVOImpl resTempShelfVO = this.getCmsResTempShelfTVO();
        String docIdStr = docIds.substring(0, docIds.length() - 1);
        try {
            for (String docId : docIdStr.split(",")) {
                CmsResTempShelfTVORowImpl resTempShelfVONewRow = (CmsResTempShelfTVORowImpl)resTempShelfVO.createRow();
                resTempShelfVONewRow.setDocId(new Number(docId));
                resTempShelfVONewRow.setUserId(this.getCustomDBTransaction().getUserId());
                resTempShelfVO.insertRow(resTempShelfVONewRow);
            }
            this.getDBTransaction().commit();
        } catch (SQLException e) {
            this.getDBTransaction().rollback();
            e.printStackTrace();
            return "1";
        }
        return "0";
    }

    /**
     * 删除暂存架资源
     * @param docIds,此处的docId实际上是表里的主键ShelfId
     * @return
     */
    public String deleteTempShelf(String docIds) {
        String result = "S";
        try {
            CmsResTempShelfTVOImpl resTempShelfVO = this.getCmsResTempShelfTVO();
            if (docIds != null && docIds.length() > 0) {
                for (String docId : docIds.split(",")) {
                    resTempShelfVO.setbvShelfId(new Number(docId));
                    resTempShelfVO.executeQuery();
                    Row row = resTempShelfVO.first();
                    if (row != null) {
                        row.setAttribute("DeleteFlag", "Y");
                    }
                }
            }
            this.getDBTransaction().commit();
        } catch (Exception e) {
            result = "E," + e.toString();
        }
        return result;
    }

    /**
     * 还原暂存架资源
     * @param docIds,此处的docId实际上是表里的主键ShelfId
     * @return
     */
    public String recoverTempShelf(String docIds) {
        String result = "S";
        try {
            CmsResTempShelfTVOImpl resTempShelfVO = this.getCmsResTempShelfTVO();
            if (docIds != null && docIds.length() > 0) {
                for (String docId : docIds.split(",")) {
                    resTempShelfVO.setbvShelfId(new Number(docId));
                    resTempShelfVO.executeQuery();
                    Row row = resTempShelfVO.first();
                    if (row != null) {
                        row.setAttribute("DeleteFlag", "N");
                    }
                }
            }
            this.getDBTransaction().commit();
        } catch (Exception e) {
            result = "E," + e.toString();
        }
        return result;
    }

    /**
     * 彻底删除暂存架资源
     * @param docIds,此处的docId实际上是表里的主键ShelfId
     * @return
     */
    public String destroyTempShelf(String docIds) {
        String result = "S";
        try {
            System.out.println("docIds:" + docIds);
            CmsResTempShelfTVOImpl resTempShelfVO = this.getCmsResTempShelfTVO();
            if (docIds != null && docIds.length() > 0) {
                for (String docId : docIds.split(",")) {
                    resTempShelfVO.setbvShelfId(new Number(docId));
                    resTempShelfVO.executeQuery();
                    Row row = resTempShelfVO.first();
                    if (row != null) {
                        row.remove();
                    }
                }
            }
            this.getDBTransaction().commit();
        } catch (Exception e) {
            result = "E," + e.toString();
        }
        return result;
    }

    public List<Number> getAllTempShelfRow(String deleteFlag, String categoryCode) {
        List<Number> list = new ArrayList<Number>();
        CmsResTempShelfVOImpl vo = this.getCmsResTempShelfVO4Query();
        vo.setbvDeleteFlag(deleteFlag);
        vo.setbvCategoryCode(categoryCode);
        vo.setbvUserId(this.getCustomDBTransaction().getUserId());
        vo.executeQuery();
        vo.setRangeSize(-1);
        for (Row row : vo.getAllRowsInRange()) {
            CmsResTempShelfVORowImpl shelfRow = (CmsResTempShelfVORowImpl)row;
            list.add(shelfRow.getDocId());
        }
        return list;
    }

    public String getApplyName(Number applyId) {
        String applyName = null;
        CmsResExpApplyHVVOImpl applyHVVO = this.getCmsResExpApplyHVVO();
        applyHVVO.setbvApplyId(applyId);
        applyHVVO.executeQuery();
        applyHVVO.setRangeSize(-1);
        Row row = applyHVVO.first();
        if (row != null) {
            CmsResExpApplyHVVORowImpl applyRow = (CmsResExpApplyHVVORowImpl)row;
            applyName = applyRow.getApplyName();
        }
        return applyName;
    }

    /**
     * 初始化检查导出页面的查询面板VO
     */
    public void initSearchExportQuery() {
        CmsSearchExportQueryVOImpl queryVO = this.getCmsSearchExportQueryVO();
        queryVO.executeQuery();
        queryVO.setCurrentRow(queryVO.first());
    }

    public String getGroupFlagByCompCode(String compCode) {
        String result = "N";
        CmsCompVOImpl vo = this.getCmsCompVO4Query();
        vo.setbvCompCode(compCode);
        vo.executeQuery();
        Row row = vo.first();
        if (row != null) {
            result = (String)row.getAttribute("GroupFlag");
        }
        return result;
    }

    public void query4SearchExport(String actionName, String compCode) {
        if ("reset".equals(actionName)) {
            initSearchExportQuery();
        }
        String groupFlag = this.getGroupFlagByCompCode(compCode); //判断是否为集团
        CmsSearchExportQueryVOImpl queryVO = this.getCmsSearchExportQueryVO();
        CmsSearchExportQueryVORowImpl queryRow = (CmsSearchExportQueryVORowImpl)queryVO.getCurrentRow();
        CmsSearchExportVOImpl vo = this.getCmsSearchExportVO();
        vo.setWhereClause(null);
        vo.setbvBookName(queryRow.getBookName());
        vo.setbvNetworkFlag(queryRow.getNetworkCopyrightFlag());
        vo.setbvAuthor(queryRow.getAuthor());
        vo.setbvEditor(queryRow.getEditor());
        vo.setbvPaperFlag(queryRow.getPaperMediumCopyrightFlag());
        vo.setbvSeries(queryRow.getSeries());
        vo.setbvStatus(queryRow.getStatus());
        System.out.println("groupFlag:" + groupFlag + "  " + queryRow.getCompCode());
        vo.setbvCompCode("Y".equals(groupFlag) ? queryRow.getCompCode() : compCode);
        vo.setbvCategoryName(queryRow.getCategoryName());
        Object paperflag = queryRow.getPaperMediumCopyrightFlag();
        Object netflag = queryRow.getNetworkCopyrightFlag();
        String whereClause = "";
        System.out.println(queryRow.getPublishDateFrom() + "  " + queryRow.getPublishDateTo());
        Date startDate = queryRow.getPublishDateFrom();
        Date endDate = queryRow.getPublishDateTo();
        if (startDate != null && endDate != null) {
            whereClause =
                    "(trunc(pub_time, 'dd') BETWEEN  to_date('" + startDate + "','yyyy/mm/dd')  AND to_date('" + endDate +
                    "','yyyy/mm/dd') )";
        } else if (startDate == null && endDate != null) {
            whereClause = "(trunc(pub_time, 'dd')   <  to_date('" + endDate + "','yyyy/mm/dd'))";
        } else if (startDate != null && endDate == null) {
            whereClause = "(trunc(pub_time, 'dd')  >  to_date('" + startDate + "','yyyy/mm/dd'))";
        }
        if ("YOU".equals(paperflag + "")) {
            if (whereClause != null && !"".equals(whereClause)) {
                whereClause = whereClause + " and ";
            }
            whereClause =
                    whereClause + " (sysdate between paper_medium_start_time and nvl(paper_medium_end_time,sysdate+1))";
        }
        if ("YOU".equals(netflag + "")) {
            if (whereClause != null && !"".equals(whereClause)) {
                whereClause = whereClause + " and ";
            }
            whereClause = whereClause + " (sysdate between network_start_time and nvl(network_end_time,sysdate+1))";
        }
        if (whereClause != null && !"".equals(whereClause)) {
            vo.setWhereClause(whereClause);
        }
        vo.executeQuery();
    }


    public String selectResExpAllAction(String flag) {
        if ("true".equals(flag)) {
            CmsSearchExportVOImpl vo = this.getCmsSearchExportVO();
            if (vo.getRowCount() > 0) {
                CmsSearchExportVORowImpl row = (CmsSearchExportVORowImpl)vo.first();
                row.setChecked(true);
                while (vo.hasNext()) {
                    row = (CmsSearchExportVORowImpl)vo.next();
                    row.setChecked(true);
                }
            }
        } else if ("false".equals(flag)) {
            CmsSearchExportVOImpl vo = this.getCmsSearchExportVO();
            if (vo.getRowCount() > 0) {
                CmsSearchExportVORowImpl row = (CmsSearchExportVORowImpl)vo.first();
                row.setChecked(false);
                while (vo.hasNext()) {
                    row = (CmsSearchExportVORowImpl)vo.next();
                    row.setChecked(false);
                }
            }
        }
        return null;
    }


    /**
     * Container's getter for CmsResTempShelfVO1.
     * @return CmsResTempShelfVO1
     */
    public CmsResTempShelfVOImpl getCmsResTempShelfVO() {
        return (CmsResTempShelfVOImpl)findViewObject("CmsResTempShelfVO");
    }


    /**
     * Container's getter for CmsLib4TempShelfVO1.
     * @return CmsLib4TempShelfVO1
     */
    public CmsLib4TempShelfVOImpl getCmsLib4TempShelfVO() {
        return (CmsLib4TempShelfVOImpl)findViewObject("CmsLib4TempShelfVO");
    }

    /**
     * Container's getter for CmsResExpApplyHTVO1.
     * @return CmsResExpApplyHTVO1
     */
    public CmsResExpApplyHTVOImpl getCmsResExpApplyHTVO() {
        return (CmsResExpApplyHTVOImpl)findViewObject("CmsResExpApplyHTVO");
    }

    /**
     * Container's getter for CmsResExpApplyLTVO1.
     * @return CmsResExpApplyLTVO1
     */
    public CmsResExpApplyLTVOImpl getCmsResExpApplyLTVO() {
        return (CmsResExpApplyLTVOImpl)findViewObject("CmsResExpApplyLTVO");
    }

    /**
     * Container's getter for CmsResExpApplyVL1.
     * @return CmsResExpApplyVL1
     */
    public ViewLinkImpl getCmsResExpApplyVL1() {
        return (ViewLinkImpl)findViewLink("CmsResExpApplyVL1");
    }

    /**
     * Container's getter for CmsResTemplateVO1.
     * @return CmsResTemplateVO1
     */
    public CmsResTemplateVOImpl getCmsResTemplateVO() {
        return (CmsResTemplateVOImpl)findViewObject("CmsResTemplateVO");
    }

    /**
     * Container's getter for CmsResTemplateTVO1.
     * @return CmsResTemplateTVO1
     */
    public CmsResTemplateTVOImpl getCmsResTemplateTVO() {
        return (CmsResTemplateTVOImpl)findViewObject("CmsResTemplateTVO");
    }

    /**
     * Container's getter for CmsFirstLevelExpResVO1.
     * @return CmsFirstLevelExpResVO1
     */
    public CmsFirstLevelExpResVOImpl getCmsFirstLevelExpResVO() {
        return (CmsFirstLevelExpResVOImpl)findViewObject("CmsFirstLevelExpResVO");
    }

    /**
     * Container's getter for CmsSecondLevelExpResVO1.
     * @return CmsSecondLevelExpResVO1
     */
    public CmsSecondLevelExpResVOImpl getCmsSecondLevelExpResVO() {
        return (CmsSecondLevelExpResVOImpl)findViewObject("CmsSecondLevelExpResVO");
    }

    /**
     * Container's getter for CmsExpResLevelVL1.
     * @return CmsExpResLevelVL1
     */
    public ViewLinkImpl getCmsExpResLevelVL1() {
        return (ViewLinkImpl)findViewLink("CmsExpResLevelVL1");
    }

    /**
     * Container's getter for CmsResTemplateRelTVO1.
     * @return CmsResTemplateRelTVO1
     */
    public CmsResTemplateRelTVOImpl getCmsResTemplateRelTVO() {
        return (CmsResTemplateRelTVOImpl)findViewObject("CmsResTemplateRelTVO");
    }

    /**
     * Container's getter for CmsResTempShelfTVO.
     * @return CmsResTempShelfTVO
     */
    public CmsResTempShelfTVOImpl getCmsResTempShelfTVO() {
        return (CmsResTempShelfTVOImpl)findViewObject("CmsResTempShelfTVO");
    }

    /**
     * Container's getter for CmsResAttachExpVO.
     * @return CmsResAttachExpVO
     */
    public CmsResAttachExpVOImpl getCmsResAttachExpVO() {
        return (CmsResAttachExpVOImpl)findViewObject("CmsResAttachExpVO");
    }

    /**
     * Container's getter for CmsResExpApplyLVVO.
     * @return CmsResExpApplyLVVO
     */
    public CmsResExpApplyLVVOImpl getCmsResExpApplyLVVO() {
        return (CmsResExpApplyLVVOImpl)findViewObject("CmsResExpApplyLVVO");
    }

    /**
     * Container's getter for CmsResMetadataExpVO.
     * @return CmsResMetadataExpVO
     */
    public CmsResMetadataExpVOImpl getCmsResMetadataExpVO() {
        return (CmsResMetadataExpVOImpl)findViewObject("CmsResMetadataExpVO");
    }

    /**
     * Container's getter for CmsResExpApplyHVO1.
     * @return CmsResExpApplyHVO1
     */
    public CmsResExpApplyHVOImpl getCmsResExpApplyHVO() {
        return (CmsResExpApplyHVOImpl)findViewObject("CmsResExpApplyHVO");
    }

    /**
     * Container's getter for CmsResCommonInfoVO1.
     * @return CmsResCommonInfoVO1
     */
    public CmsResCommonInfoVOImpl getCmsResCommonInfoVO() {
        return (CmsResCommonInfoVOImpl)findViewObject("CmsResCommonInfoVO");
    }

    /**
     * Container's getter for CmsResTempShelfVO4Query.
     * @return CmsResTempShelfVO4Query
     */
    public CmsResTempShelfVOImpl getCmsResTempShelfVO4Query() {
        return (CmsResTempShelfVOImpl)findViewObject("CmsResTempShelfVO4Query");
    }

    /**
     * Container's getter for CmsSelectedExportFieldTVO1.
     * @return CmsSelectedExportFieldTVO1
     */
    public ViewObjectImpl getCmsSelectedExportFieldTVO1() {
        return (ViewObjectImpl)findViewObject("CmsSelectedExportFieldTVO1");
    }

    /**
     * Container's getter for CmsBookExportHtmlTVO1.
     * @return CmsBookExportHtmlTVO1
     */
    public ViewObjectImpl getCmsBookExportHtmlTVO1() {
        return (ViewObjectImpl)findViewObject("CmsBookExportHtmlTVO1");
    }

    /**
     * Container's getter for CmsAllExportFieldVO1.
     * @return CmsAllExportFieldVO1
     */
    public ViewObjectImpl getCmsAllExportFieldVO1() {
        return (ViewObjectImpl)findViewObject("CmsAllExportFieldVO1");
    }

    /**
     * Container's getter for CmsSecondLevelExpResVO1.
     * @return CmsSecondLevelExpResVO1
     */
    public CmsSecondLevelExpResVOImpl getCmsSecondLevelExpResVO1() {
        return (CmsSecondLevelExpResVOImpl)findViewObject("CmsSecondLevelExpResVO1");
    }

    /**
     * Container's getter for CmsResExpTemplateVO.
     * @return CmsResExpTemplateVO
     */
    public CmsResExpTemplateVOImpl getCmsResExpTemplateVO() {
        return (CmsResExpTemplateVOImpl)findViewObject("CmsResExpTemplateVO");
    }

    /**
     * Container's getter for CmsResExpApplyHVVO.
     * @return CmsResExpApplyHVVO
     */
    public CmsResExpApplyHVVOImpl getCmsResExpApplyHVVO() {
        return (CmsResExpApplyHVVOImpl)findViewObject("CmsResExpApplyHVVO");
    }

    /**
     * Container's getter for CmsSearchExportQueryVO.
     * @return CmsSearchExportQueryVO
     */
    public CmsSearchExportQueryVOImpl getCmsSearchExportQueryVO() {
        return (CmsSearchExportQueryVOImpl)findViewObject("CmsSearchExportQueryVO");
    }

    /**
     * Container's getter for CmsSearchExportVO.
     * @return CmsSearchExportVO
     */
    public CmsSearchExportVOImpl getCmsSearchExportVO() {
        return (CmsSearchExportVOImpl)findViewObject("CmsSearchExportVO");
    }

    /**
     * Container's getter for CmsCompVO4Query.
     * @return CmsCompVO4Query
     */
    public CmsCompVOImpl getCmsCompVO4Query() {
        return (CmsCompVOImpl)findViewObject("CmsCompVO4Query");
    }
}