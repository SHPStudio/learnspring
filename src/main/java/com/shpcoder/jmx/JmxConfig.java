package com.shpcoder.jmx;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jmx.export.MBeanExporter;
import org.springframework.jmx.export.annotation.AnnotationMBeanExporter;

/**
 * Jmx
 * 能够改变正在运行的应用的配置的一项技术
 * Jmx管理应用的核心是托管bean MBean
 * 并且有一个Jmx服务器 还有一个图形化界面去管理这些托管的bean 在jdkbin的jconsole就可以
 * 然后我们可以直接修改属性
 * <p>
 * 我们可以看到被托管的bean所有public域都被显示出来了 这可能并不是我们想要的
 * 所以我们可以做些更细粒度的控制
 * 1. 通过名称来生命需要暴露或忽略的bean方法
 * 2. 通过为bean增加接口来选择要暴露的方法
 * 3. 通过注解标准bean来标识托管的属性和操作
 * User: sunhaipeng
 * Date: 2018/3/6
 * Time: 12:36
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@ComponentScan
public class JmxConfig {

    /**
     * 把现有的bean让jmx托管
     *
     * @param myShapeJmxController
     * @return
     */

//    @Bean
//    public MBeanExporter mbeanExporter(MyShapeJmxController myShapeJmxController, InterfaceBasedMBeanInfoAssembler assembler) {
//        /**
//         * 配置最简单的方式就是为jmxexporter配置一个map集合
//         */
//        MBeanExporter exporter = new MBeanExporter();
//        Map<String, Object> beans = new HashMap<>();
//        beans.put("shape:name=MyShapeJmxController", myShapeJmxController);
//        exporter.setBeans(beans);
//        // 为了将装配器能够生效 我们把它装配进Exporter中
//        exporter.setAssembler(assembler);
//        return exporter;
//    }
//
//    /**
//     * 通过名称暴露方法
//     * 还有一种是反操作MethodExlusionMBeanInfoAssembler 指定了不需要暴露的方法名称列表
//     */
////    @Bean
////    public MethodNameBasedMBeanInfoAssembler assembler() {
////        MethodNameBasedMBeanInfoAssembler assembler = new MethodNameBasedMBeanInfoAssembler();
////        assembler.setManagedMethods(new String[]{"getSpittlesPerPage"});
////        return assembler;
////    }
//
//    /**
//     * 如果导出多个bean的话那么通过方法名字去指定需不需要暴露可能就很麻烦了
//     * 我们第二个方法就是通过使用接口装配器 让只有实现接口的方法才可以暴露
//     */
//    @Bean
//    public InterfaceBasedMBeanInfoAssembler assembler() {
//        InterfaceBasedMBeanInfoAssembler assembler = new InterfaceBasedMBeanInfoAssembler();
//        assembler.setManagedInterfaces(new Class<?>[] { IShapeRead.class});
//        return assembler;
//    }

    /**
     * 第三中是通过注解的方式
     * 这种需要配置注解驱动
     */
    @Bean
    public MBeanExporter mbeanExporter() {
        /**
         * 处理冲突 如果有名字一样的托管bean怎么办
         * 默认MBeanExporter会抛出已经存在的异常 但是还有两种处理的策略
         * 一种忽略冲突 同时也不注册新的
         * 另一种是用新的覆盖旧的
         */
        return new AnnotationMBeanExporter();
    }


}
