
package com.vignette.idm.render.manager;

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
 *         &lt;element name="serverID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rendRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rendererProgID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resultMsg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class GetRendererRefResponse {

    protected int _return;
    protected String serverID;
    protected String rendRef;
    protected String rendererProgID;
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
     * Gets the value of the serverID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerID() {
        return serverID;
    }

    /**
     * Sets the value of the serverID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerID(String value) {
        this.serverID = value;
    }

    /**
     * Gets the value of the rendRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRendRef() {
        return rendRef;
    }

    /**
     * Sets the value of the rendRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRendRef(String value) {
        this.rendRef = value;
    }

    /**
     * Gets the value of the rendererProgID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRendererProgID() {
        return rendererProgID;
    }

    /**
     * Sets the value of the rendererProgID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRendererProgID(String value) {
        this.rendererProgID = value;
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

}
