package com.shpcoder.webserviceclient;

import com.shpcoder.javaweb.webservice.ShpWebService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/3/2
 * Time: 11:51
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = WebServiceClientConfig.class)
public class WebServiceClientConfigTest {

    @Autowired
    private ShpWebService spitterService;

    @Test
    public void testWebService() {
        System.out.println(spitterService.getEnity() + "从webservice中国区");

    }
}