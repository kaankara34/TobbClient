package com.aegon.tobbclient.config;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.ext.logging.LoggingInInterceptor;
import org.apache.cxf.ext.logging.LoggingOutInterceptor;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.message.Message;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.tempuri.SigSirketWS;
import org.tempuri.SigSirketWSSoap;

@Configuration
public class SoapConfig {

    @Value("${tobb.client.endpoint}")
    private String ENDPOINT;
    @Value("${tobb.client.reqTimeOut}")
    private String REQ_TIME_OUT;
    @Value("${tobb.client.conTimeOut}")
    private String CON_TIME_OUT;
    @Bean
    public SigSirketWSSoap getAcente() {
        SigSirketWS getAcenteBilgileri = new SigSirketWS();
        SigSirketWSSoap tobbService = getAcenteBilgileri.getSigSirketWSSoap();
        Client client = ClientProxy.getClient(tobbService);
        client.getRequestContext().put(Message.ENDPOINT_ADDRESS, ENDPOINT);
        Endpoint endpoint = client.getEndpoint();
        LoggingOutInterceptor outInterceptor = new LoggingOutInterceptor();
        LoggingInInterceptor inInterceptor = new LoggingInInterceptor();
        endpoint.getOutInterceptors().add(outInterceptor);
        endpoint.getInInterceptors().add(inInterceptor);
        HTTPConduit httpConduit = (HTTPConduit) client.getConduit();
        HTTPClientPolicy policy = httpConduit.getClient();
        //connectTimeout: 10000
        policy.setReceiveTimeout(Long.parseLong(REQ_TIME_OUT));
        policy.setConnectionTimeout(Long.parseLong(CON_TIME_OUT));
        return tobbService;
    }

}
