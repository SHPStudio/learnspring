package com.shpcoder.rmiclient;

import com.shpcoder.rmi.SpittrService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/3/1
 * Time: 17:29
 * To change this template use File | Settings | File Templates.
 */
@Configuration
public class RmiClientConfig {

    /**
     * 使用RmiProxyFactoryBean去生成远程的代理 由这个代理对象去做远程访问等等
     * @return
     */

    @Bean
    public RmiProxyFactoryBean spitterService() {
        RmiProxyFactoryBean rmiProxyFactory = new RmiProxyFactoryBean();
        rmiProxyFactory.setServiceUrl("rmi://localhost/SpittrService");
        rmiProxyFactory.setServiceInterface(SpittrService.class);
        return rmiProxyFactory;
    }
}
