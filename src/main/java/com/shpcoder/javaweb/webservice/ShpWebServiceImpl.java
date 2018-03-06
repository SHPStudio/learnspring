package com.shpcoder.javaweb.webservice;

import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/3/2
 * Time: 11:21
 * To change this template use File | Settings | File Templates.
 */
@Component("shp1")
public class ShpWebServiceImpl implements ShpWebService{

    @Override
    public ShpWSEntity getEnity() {
        return new ShpWSEntity("111", "SHP的服务");
    }
}
