
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
 *         &lt;element name="pbstrDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pbstrConfigURI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resultMsg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public class GetRendererInfoResponse {

	protected int _return;
    protected String pbstrDescription;
    protected String pbstrConfigURI;
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
     * Gets the value of the pbstrDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPbstrDescription() {
        return pbstrDescription;
    }

    /**
     * Sets the value of the pbstrDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPbstrDescription(String value) {
        this.pbstrDescription = value;
    }

    /**
     * Gets the value of the pbstrConfigURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPbstrConfigURI() {
        return pbstrConfigURI;
    }

    /**
     * Sets the value of the pbstrConfigURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPbstrConfigURI(String value) {
        this.pbstrConfigURI = value;
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
