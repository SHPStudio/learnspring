package com.shpcoder.javaweb.webservice;

import javax.jws.WebService;

/**
 * 远程服务接口
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/3/2
 * Time: 11:16
 * To change this template use File | Settings | File Templates.
 */
@WebService(targetNamespace="http://webservice.javaweb.shpcoder.com/")
public interface ShpWebService {
    ShpWSEntity getEnity();
}
