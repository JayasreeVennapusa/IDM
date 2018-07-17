
package com.vignette.idm.server;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.0
 * 
 */

public class CheckedOutException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private CheckedOutExceptionFaultDetail faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public CheckedOutException(String message, CheckedOutExceptionFaultDetail faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public CheckedOutException(String message, CheckedOutExceptionFaultDetail faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.vignette.idm.server.CheckedOutExceptionFaultDetail
     */
    public CheckedOutExceptionFaultDetail getFaultInfo() {
        return faultInfo;
    }

}
