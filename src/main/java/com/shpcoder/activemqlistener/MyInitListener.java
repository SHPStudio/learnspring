package com.shpcoder.activemqlistener;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/3/5
 * Time: 12:26
 * To change this template use File | Settings | File Templates.
 */
@Component
public class MyInitListener implements InitializingBean{

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("项目启动");
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("当前时间" + System.currentTimeMillis());
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
