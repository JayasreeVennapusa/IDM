
package com.vignette.idm.server;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.0
 * 
 */
public class QueueVariableUnknownException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private QueueVariableUnknownExceptionFaultDetail faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public QueueVariableUnknownException(String message, QueueVariableUnknownExceptionFaultDetail faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public QueueVariableUnknownException(String message, QueueVariableUnknownExceptionFaultDetail faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.vignette.idm.server.QueueVariableUnknownExceptionFaultDetail
     */
    public QueueVariableUnknownExceptionFaultDetail getFaultInfo() {
        return faultInfo;
    }

}
