package com.shpcoder.javaweb;

/**
 * Spring Security是通过Servlet的Filter保护web请求和限制URL级别的访问
 * 他有11个模块
 * 1.ACL 支持通过访问控制列表 为域对象提供安全性
 * 2.切面
 * 3.CAS客户端 提供你那个与Jasig的中心认证服务
 * 4.核心
 * 5.加密 提供加密和密码编码的功能
 * 6.LDAP 支持基于LDAP进行认证
 * 7.支持使用OpenID进行集中式认证
 * 8.提供Spring Remoting的支持
 * 9.标签库 Spring Security的JSP标签库
 * 10.Web 提供了Spring Securtiy基于Filter的Web安全性支持
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/2/26
 * Time: 11:00
 * To change this template use File | Settings | File Templates.
 */

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * 既然他是使用Filter来提供各种的安全功能 那么我们是不是需要配置很多的Filter
 * 其实我们就配置一个Filter就可以了 他会把逻辑委托给spring应用
 * 这个filter就是DelagatingFilterProxy
 * 我们可以继承AbstractSecurityWebApplicationInitalizer 他会被spring发现并在web容器里账户侧DelegatingFilterProxy
 * 并且还可以使用他去加入一些自己的Filter
 */
public class SecurityWebInitializer extends AbstractSecurityWebApplicationInitializer{
}
