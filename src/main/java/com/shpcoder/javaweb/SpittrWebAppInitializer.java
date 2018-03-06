package com.shpcoder.javaweb;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletRegistration;

/**
 * 可以使用java类的配置方式去替代配置web.xml
 * 使用AbstractAnnotationConfigDispatcherServletInitializer配置DispatcherServlet和ContetLoaderListener
 * 我们要求DispatcherServlet加载应用上下文的时候需要使用定义在WebConfig配置类中的bean
 * 然而另外的bean是由ContextLoaderListener去创建
 * 比如DispathcerServlet加载包含Web组件的bean比如控制器，视图解析器以及处理器映射等等
 * ContextLoaderListener去加载应用中其他的bean 通常是驱动应用后端的中间层和数据层组件
 * <p>
 * 作用：
 * 1. 配置映射路径
 * 2. 加载WebConfig配置类中bean
 * 3. 加载其他配置类中的bean
 * <p>
 * 注意：
 * 用AbstractAnnotationConfigDispatcherServletInitializer去代替web.xml方式配置的话需要Servlet容器支持Servlet3.0以上才可以
 * Tomcat7以上都可以支持 如果不支持那么只能通过web.xml去配置
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/2/7
 * Time: 9:51
 * To change this template use File | Settings | File Templates.
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * 这个方法将返回一个带有@Configuration注解的类，这个类定义由ContextLoaderListener加载的应用上下文的bean
     *
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    /**
     * 这个方法是返回一个带有@Configuration注解的类 这个类将定义由DispathcerServlet加载的应用上下文中的bean
     *
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }

    /**
     * 将返回一个字符串的数组 可以将一个或多个路径映射到DispacherServlet上
     *
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    /**
     * 这个方法是在DispatherServlet注册到Servlet之后就会调用并传入在Servlet注册后的Registration.Dynamic
     * 我们可以通过Dynamic对DispatherServlet进行额外的配置
     * @param registration
     */
    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        /**
         * 配置上传文件路径
         */
//        registration.setMultipartConfig(new MultipartConfigElement("/temp/spittr/uploads"));
    }
}
