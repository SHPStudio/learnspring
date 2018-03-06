package com.shpcoder.rmi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

/**
 * 远程调用配置
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/3/1
 * Time: 16:53
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@ComponentScan
public class RmiConfig {

    /**
     * Spring的RmiServiceExporter会帮助我们把我们的服务接口的实现类包装到一个适配器中 并默认向本地机器的1099端口的RMI注册表绑定信息
     * 如果想要绑定别的主机或者端口可以通过setRegistryHost和RegistryPort去更改
     * @return
     */
    @Bean
    public RmiServiceExporter rmiServiceExporter(SpittrService rect) {
        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
        rmiServiceExporter.setService(rect);
        rmiServiceExporter.setServiceName("SpittrService");
        rmiServiceExporter.setServiceInterface(SpittrService.class);
        return rmiServiceExporter;
    }


}
