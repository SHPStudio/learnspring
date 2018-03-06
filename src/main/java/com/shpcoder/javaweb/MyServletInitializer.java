package com.shpcoder.javaweb;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * 实现WebApplicationInitializer接口可以往ServletContext里再放入一些Servlet和filter
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/2/9
 * Time: 16:52
 * To change this template use File | Settings | File Templates.
 */
public class MyServletInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
//        /**
//         * 添加一个Servlet
//         */
//        ServletRegistration.Dynamic myServlet = servletContext.addServlet("myServlet", Servlet.class);
//        myServlet.addMapping("/custom/my");
//
        /**
         * 添加一个filter
         */
//        CharacterEncodingFilter filter = new CharacterEncodingFilter();
//        filter.setEncoding("UTF-8");
//        filter.setForceEncoding(true);
//        FilterRegistration.Dynamic myFilter = servletContext.addFilter("myFilter", filter);
//        myFilter.addMappingForUrlPatterns(null, false, "/*");
    }
}
