package com.zypg.cms.work.model.viewobject.video;

import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue May 06 17:24:58 CST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CmsVideoEditVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        SeriesName {
            public Object get(CmsVideoEditVORowImpl obj) {
                return obj.getSeriesName();
            }

            public void put(CmsVideoEditVORowImpl obj, Object value) {
                obj.setSeriesName((String)value);
            }
        }
        ,
        CarrierType {
            public Object get(CmsVideoEditVORowImpl obj) {
                return obj.getCarrierType();
            }

            public void put(CmsVideoEditVORowImpl obj, Object value) {
                obj.setCarrierType((String)value);
            }
        }
        ,
        Lang {
            public Object get(CmsVideoEditVORowImpl obj) {
                return obj.getLang();
            }

            public void put(CmsVideoEditVORowImpl obj, Object value) {
                obj.setLang((String)value);
            }
        }
        ,
        Editor {
            public Object get(CmsVideoEditVORowImpl obj) {
                return obj.getEditor();
            }

            public void put(CmsVideoEditVORowImpl obj, Object value) {
                obj.setEditor((String)value);
            }
        }
        ,
        TextEditor {
            public Object get(CmsVideoEditVORowImpl obj) {
                return obj.getTextEditor();
            }

            public void put(CmsVideoEditVORowImpl obj, Object value) {
                obj.setTextEditor((String)value);
            }
        }
        ,
        Producer {
            public Object get(CmsVideoEditVORowImpl obj) {
                return obj.getProducer();
            }

            public void put(CmsVideoEditVORowImpl obj, Object value) {
                obj.setProducer((String)value);
            }
        }
        ,
        PubTime {
            public Object get(CmsVideoEditVORowImpl obj) {
                return obj.getPubTime();
            }

            public void put(CmsVideoEditVORowImpl obj, Object value) {
                obj.setPubTime((Date)value);
            }
        }
        ,
        AssortBook {
            public Object get(CmsVideoEditVORowImpl obj) {
                return obj.getAssortBook();
            }

            public void put(CmsVideoEditVORowImpl obj, Object value) {
                obj.setAssortBook((String)value);
            }
        }
        ,
        CompCode {
            public Object get(CmsVideoEditVORowImpl obj) {
                return obj.getCompCode();
            }

            public void put(CmsVideoEditVORowImpl obj, Object value) {
                obj.setCompCode((String)value);
            }
        }
        ,
        Keyword {
            public Object get(CmsVideoEditVORowImpl obj) {
                return obj.getKeyword();
            }

            public void put(CmsVideoEditVORowImpl obj, Object value) {
                obj.setKeyword((String)value);
            }
        }
        ,
        ContentDesc {
            public Object get(CmsVideoEditVORowImpl obj) {
                return obj.getContentDesc();
            }

            public void put(CmsVideoEditVORowImpl obj, Object value) {
                obj.setContentDesc((String)value);
            }
        }
        ,
        Remarks {
            public Object get(CmsVideoEditVORowImpl obj) {
                return obj.getRemarks();
            }

            public void put(CmsVideoEditVORowImpl obj, Object value) {
                obj.setRemarks((String)value);
            }
        }
        ,
        CategoryId {
            public Object get(CmsVideoEditVORowImpl obj) {
                return obj.getCategoryId();
            }

            public void put(CmsVideoEditVORowImpl obj, Object value) {
                obj.setCategoryId((Number)value);
            }
        }
        ,
        CategoryName {
            public Object get(CmsVideoEditVORowImpl obj) {
                return obj.getCategoryName();
            }

            public void put(CmsVideoEditVORowImpl obj, Object value) {
                obj.setCategoryName((String)value);
            }
        }
        ,
        Lookup4CarrierType {
            public Object get(CmsVideoEditVORowImpl obj) {
                return obj.getLookup4CarrierType();
            }

            public void put(CmsVideoEditVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Lookup4Lang {
            public Object get(CmsVideoEditVORowImpl obj) {
                return obj.getLookup4Lang();
            }

            public void put(CmsVideoEditVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(CmsVideoEditVORowImpl object);

        public abstract void put(CmsVideoEditVORowImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int SERIESNAME = AttributesEnum.SeriesName.index();
    public static final int CARRIERTYPE = AttributesEnum.CarrierType.index();
    public static final int LANG = AttributesEnum.Lang.index();
    public static final int EDITOR = AttributesEnum.Editor.index();
    public static final int TEXTEDITOR = AttributesEnum.TextEditor.index();
    public static final int PRODUCER = AttributesEnum.Producer.index();
    public static final int PUBTIME = AttributesEnum.PubTime.index();
    public static final int ASSORTBOOK = AttributesEnum.AssortBook.index();
    public static final int COMPCODE = AttributesEnum.CompCode.index();
    public static final int KEYWORD = AttributesEnum.Keyword.index();
    public static final int CONTENTDESC = AttributesEnum.ContentDesc.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int CATEGORYID = AttributesEnum.CategoryId.index();
    public static final int CATEGORYNAME = AttributesEnum.CategoryName.index();
    public static final int LOOKUP4CARRIERTYPE = AttributesEnum.Lookup4CarrierType.index();
    public static final int LOOKUP4LANG = AttributesEnum.Lookup4Lang.index();

    /**
     * This is the default constructor (do not remove).
     */
    public CmsVideoEditVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute SeriesName.
     * @return the SeriesName
     */
    public String getSeriesName() {
        return (String) getAttributeInternal(SERIESNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SeriesName.
     * @param value value to set the  SeriesName
     */
    public void setSeriesName(String value) {
        setAttributeInternal(SERIESNAME, value);
    }


    /**
     * Gets the attribute value for the calculated attribute CarrierType.
     * @return the CarrierType
     */
    public String getCarrierType() {
        return (String) getAttributeInternal(CARRIERTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CarrierType.
     * @param value value to set the  CarrierType
     */
    public void setCarrierType(String value) {
        setAttributeInternal(CARRIERTYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Lang.
     * @return the Lang
     */
    public String getLang() {
        return (String) getAttributeInternal(LANG);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Lang.
     * @param value value to set the  Lang
     */
    public void setLang(String value) {
        setAttributeInternal(LANG, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Editor.
     * @return the Editor
     */
    public String getEditor() {
        return (String) getAttributeInternal(EDITOR);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Editor.
     * @param value value to set the  Editor
     */
    public void setEditor(String value) {
        setAttributeInternal(EDITOR, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TextEditor.
     * @return the TextEditor
     */
    public String getTextEditor() {
        return (String) getAttributeInternal(TEXTEDITOR);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TextEditor.
     * @param value value to set the  TextEditor
     */
    public void setTextEditor(String value) {
        setAttributeInternal(TEXTEDITOR, value);
    }


    /**
     * Gets the attribute value for the calculated attribute Producer.
     * @return the Producer
     */
    public String getProducer() {
        return (String) getAttributeInternal(PRODUCER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Producer.
     * @param value value to set the  Producer
     */
    public void setProducer(String value) {
        setAttributeInternal(PRODUCER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute PubTime.
     * @return the PubTime
     */
    public Date getPubTime() {
        return (Date) getAttributeInternal(PUBTIME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute PubTime.
     * @param value value to set the  PubTime
     */
    public void setPubTime(Date value) {
        setAttributeInternal(PUBTIME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute AssortBook.
     * @return the AssortBook
     */
    public String getAssortBook() {
        return (String) getAttributeInternal(ASSORTBOOK);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute AssortBook.
     * @param value value to set the  AssortBook
     */
    public void setAssortBook(String value) {
        setAttributeInternal(ASSORTBOOK, value);
    }


    /**
     * Gets the attribute value for the calculated attribute CompCode.
     * @return the CompCode
     */
    public String getCompCode() {
        return (String) getAttributeInternal(COMPCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CompCode.
     * @param value value to set the  CompCode
     */
    public void setCompCode(String value) {
        setAttributeInternal(COMPCODE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Keyword.
     * @return the Keyword
     */
    public String getKeyword() {
        return (String) getAttributeInternal(KEYWORD);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Keyword.
     * @param value value to set the  Keyword
     */
    public void setKeyword(String value) {
        setAttributeInternal(KEYWORD, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ContentDesc.
     * @return the ContentDesc
     */
    public String getContentDesc() {
        return (String) getAttributeInternal(CONTENTDESC);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ContentDesc.
     * @param value value to set the  ContentDesc
     */
    public void setContentDesc(String value) {
        setAttributeInternal(CONTENTDESC, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Remarks.
     * @return the Remarks
     */
    public String getRemarks() {
        return (String) getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Remarks.
     * @param value value to set the  Remarks
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CategoryId.
     * @return the CategoryId
     */
    public Number getCategoryId() {
        return (Number) getAttributeInternal(CATEGORYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CategoryId.
     * @param value value to set the  CategoryId
     */
    public void setCategoryId(Number value) {
        setAttributeInternal(CATEGORYID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CategoryName.
     * @return the CategoryName
     */
    public String getCategoryName() {
        return (String) getAttributeInternal(CATEGORYNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CategoryName.
     * @param value value to set the  CategoryName
     */
    public void setCategoryName(String value) {
        setAttributeInternal(CATEGORYNAME, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> Lookup4CarrierType.
     */
    public RowSet getLookup4CarrierType() {
        return (RowSet)getAttributeInternal(LOOKUP4CARRIERTYPE);
    }

    /**
     * Gets the view accessor <code>RowSet</code> Lookup4Lang.
     */
    public RowSet getLookup4Lang() {
        return (RowSet)getAttributeInternal(LOOKUP4LANG);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}