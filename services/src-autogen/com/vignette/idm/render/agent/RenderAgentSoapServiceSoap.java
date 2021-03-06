
package com.vignette.idm.render.agent;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.0
 * 
 */

public interface RenderAgentSoapServiceSoap {


    /**
     * 
     * @param pbstrErrMsg
     * @param ppParams0
     * @param plEndPage
     * @param ppPagesData
     * @param plBeginPage
     * @param bstrFileName
     * @param bstrRenderer
     * @param inData
     * @param pbstrImageType
     * @param ppParams
     * @return
     *     returns int
     */
   
    
    public int renderDocument(
        String bstrRenderer,
        byte[] inData,
        String bstrFileName,
        Integer plBeginPage,
        Integer plEndPage,
        String pbstrImageType,
        com.vignette.idm.render.agent.RenderDocument.PpParams ppParams,
        com.vignette.idm.render.agent.RenderDocumentResponse.PpParams ppParams0,
        com.vignette.idm.render.agent.RenderDocumentResponse.PpPagesData ppPagesData,
        String pbstrErrMsg);

}
