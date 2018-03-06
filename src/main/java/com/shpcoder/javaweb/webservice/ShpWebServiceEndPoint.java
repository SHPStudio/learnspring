package com.shpcoder.javaweb.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/3/2
 * Time: 11:28
 * To change this template use File | Settings | File Templates.
 */
@Component
@WebService(serviceName = "ShpWebService")
public class ShpWebServiceEndPoint {

    @Autowired
    private ShpWebService shp1;

    @WebMethod
    public ShpWSEntity getEnity() {
       return shp1.getEnity();
    }
}
