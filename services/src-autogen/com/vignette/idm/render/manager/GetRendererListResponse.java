
package com.vignette.idm.render.manager;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ppList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CRendererInfo" type="{urn:RenderManagerService}CRendererInfo" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="resultMsg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public class GetRendererListResponse {

    protected int _return;
    protected GetRendererListResponse.PpList ppList;
    protected String resultMsg;

    /**
     * Gets the value of the return property.
     * 
     */
    public int getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     */
    public void setReturn(int value) {
        this._return = value;
    }

    /**
     * Gets the value of the ppList property.
     * 
     * @return
     *     possible object is
     *     {@link GetRendererListResponse.PpList }
     *     
     */
    public GetRendererListResponse.PpList getPpList() {
        return ppList;
    }

    /**
     * Sets the value of the ppList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRendererListResponse.PpList }
     *     
     */
    public void setPpList(GetRendererListResponse.PpList value) {
        this.ppList = value;
    }

    /**
     * Gets the value of the resultMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultMsg() {
        return resultMsg;
    }

    /**
     * Sets the value of the resultMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultMsg(String value) {
        this.resultMsg = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CRendererInfo" type="{urn:RenderManagerService}CRendererInfo" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    
    public static class PpList {

        protected List<CRendererInfo> cRendererInfo;

        /**
         * Gets the value of the cRendererInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cRendererInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCRendererInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CRendererInfo }
         * 
         * 
         */
        public List<CRendererInfo> getCRendererInfo() {
            if (cRendererInfo == null) {
                cRendererInfo = new ArrayList<CRendererInfo>();
            }
            return this.cRendererInfo;
        }

    }

}
