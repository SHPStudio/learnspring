package com.shpcoder.webserviceclient;

import com.shpcoder.javaweb.webservice.ShpWebService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/3/2
 * Time: 11:46
 * To change this template use File | Settings | File Templates.
 */
@Configuration
public class WebServiceClientConfig {

    @Bean
    public JaxWsPortProxyFactoryBean spitterService() throws MalformedURLException {
        JaxWsPortProxyFactoryBean proxy = new JaxWsPortProxyFactoryBean();
        proxy.setWsdlDocumentUrl(new URL("http://localhost:8888/services/ShpWebService?wsdl"));
        proxy.setServiceName("ShpWebService");
        proxy.setPortName("ShpWebServiceEndPointPort");
        proxy.setServiceInterface(ShpWebService.class);
        proxy.setNamespaceUri("http://webservice.javaweb.shpcoder.com/");
        return proxy;
    }
}
