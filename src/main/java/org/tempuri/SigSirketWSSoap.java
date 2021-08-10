package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.4.2
 * 2021-07-08T21:31:23.971+03:00
 * Generated source version: 3.4.2
 *
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "SigSirketWSSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface SigSirketWSSoap {

    @WebMethod(operationName = "GetEksper", action = "http://tempuri.org/GetEksper")
    @RequestWrapper(localName = "GetEksper", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetEksper")
    @ResponseWrapper(localName = "GetEksperResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetEksperResponse")
    @WebResult(name = "GetEksperResult", targetNamespace = "http://tempuri.org/")
    public org.tempuri.Eksper getEksper(

        @WebParam(name = "levhaNo", targetNamespace = "http://tempuri.org/")
        java.lang.String levhaNo,
        @WebParam(name = "user", targetNamespace = "http://tempuri.org/")
        java.lang.String user
    );

    @WebMethod(operationName = "FindAcente", action = "http://tempuri.org/FindAcente")
    @RequestWrapper(localName = "FindAcente", targetNamespace = "http://tempuri.org/", className = "org.tempuri.FindAcente")
    @ResponseWrapper(localName = "FindAcenteResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.FindAcenteResponse")
    @WebResult(name = "FindAcenteResult", targetNamespace = "http://tempuri.org/")
    public org.tempuri.ArrayOfAcente findAcente(

        @WebParam(name = "param", targetNamespace = "http://tempuri.org/")
        java.lang.String param,
        @WebParam(name = "user", targetNamespace = "http://tempuri.org/")
        java.lang.String user
    );

    @WebMethod(operationName = "GetAcente", action = "http://tempuri.org/GetAcente")
    @RequestWrapper(localName = "GetAcente", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetAcente")
    @ResponseWrapper(localName = "GetAcenteResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetAcenteResponse")
    @WebResult(name = "GetAcenteResult", targetNamespace = "http://tempuri.org/")
    public org.tempuri.Acente getAcente(

        @WebParam(name = "levhaNo", targetNamespace = "http://tempuri.org/")
        java.lang.String levhaNo,
        @WebParam(name = "user", targetNamespace = "http://tempuri.org/")
        java.lang.String user
    );

    @WebMethod(action = "http://tempuri.org/isTCKN")
    @RequestWrapper(localName = "isTCKN", targetNamespace = "http://tempuri.org/", className = "org.tempuri.IsTCKN")
    @ResponseWrapper(localName = "isTCKNResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.IsTCKNResponse")
    @WebResult(name = "isTCKNResult", targetNamespace = "http://tempuri.org/")
    public boolean isTCKN(

        @WebParam(name = "tckimlik", targetNamespace = "http://tempuri.org/")
        java.lang.String tckimlik,
        @WebParam(name = "user", targetNamespace = "http://tempuri.org/")
        java.lang.String user
    );

    @WebMethod(action = "http://tempuri.org/isTCKNAndLicenseNumber")
    @RequestWrapper(localName = "isTCKNAndLicenseNumber", targetNamespace = "http://tempuri.org/", className = "org.tempuri.IsTCKNAndLicenseNumber")
    @ResponseWrapper(localName = "isTCKNAndLicenseNumberResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.IsTCKNAndLicenseNumberResponse")
    @WebResult(name = "isTCKNAndLicenseNumberResult", targetNamespace = "http://tempuri.org/")
    public boolean isTCKNAndLicenseNumber(

        @WebParam(name = "tckimlik", targetNamespace = "http://tempuri.org/")
        java.lang.String tckimlik,
        @WebParam(name = "licenseNumber", targetNamespace = "http://tempuri.org/")
        java.lang.String licenseNumber,
        @WebParam(name = "user", targetNamespace = "http://tempuri.org/")
        java.lang.String user
    );
}