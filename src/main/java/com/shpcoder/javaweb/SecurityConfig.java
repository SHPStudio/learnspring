package com.shpcoder.javaweb;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 我们配置了代理Filter 我们还需要进行一些安全性的配置
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/2/26
 * Time: 11:24
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        /**
         * 这段配置了所有的请求都要验证包括表单登录还有httpBasic方式的验证
         * 因为我们没有重载configure(AuthemticationManagerBuilder)没有用户存储支撑认证过程
         * 所以没有人能狗登录成功
         */
        /**
         * 我们还需要一些功能 需要添加配置
         * 1. 配置用户存储
         * 2. 指定哪些请求需要认证，哪些不需要认证，以及所需要的权限
         * 3. 提供一个自定义的登录页面
         * 4. 基于安全限制 有选择性的在Web视图上显示指定的内容
         */
//        http.authorizeRequests().anyRequest().authenticated().and()
//                .formLogin().and().httpBasic();
        /**
         * 我们还可以对请求做更细粒度的控制
         * 我们还可以使用通配符正则表达式还有对用户组等等的认证
         * formLogin()提供了默认的登录页
         * 并且我们还可以设置我们的自定义登录页
         * 还有基于httpBasic的认证 就是弹出一个模态对话框让你输入用户名密码等
         */
//        http.formLogin().and()
//                .authorizeRequests().antMatchers("/findPage").authenticated()
//                .antMatchers(HttpMethod.POST, "/find").authenticated().anyRequest().permitAll();
        /**
         * 注意post请求 security默认开启csrf防护，也就是默认post请求都会被拦截
         * 所以我们需要对csrf做一些处理或者直接禁用
         * 处理办法就是所有的post请求表单需要在一个——csrf域中提交token并且这个token需要和服务器上的一致
         * 如果使用themleaf的话只要在action上使用themleaf的前缀就可以自动的添加——csrf域了
         * 还有就是禁用这个功能 通常不是一个好办法
         * 使用.csrf().disable()去禁用csrf防护功能
         */
        /**
         * Remember-me 这个意思就是在一段时间内 登录一次就可以
         * 直接调用.rememberMe().tokenValiditySeconds(2419200).key("spittrKey")
         * 就可以 设置超时时间 还有MD5加密的秘钥key
         */
        /**
         * 还有退出 退出之后应该清空所有Remenmber-me信息并且重新跳到登录页面
         * 我们可以调用.logout().logoutSuccessUrl("/")
         * logoutSuccessUrl("")可以重定向到一个我们定义好的路径
         */
    }

    /**
     * 配置用户存储
     *
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        /**
         * 基于内存的用户存储
         * 配置用户详细信息的方法
         * 1. accountExpired(boolean) 定义账号是否已经过期
         * 2. accountLocked(boolean) 定义账号是否已经锁定
         * 3. and() 链接配置
         * 4. authorities(GrantedAuthority...) 授权某个用户一项或者多项权限
         * 5. credentialsExpired(boolean)定义凭证是否过期
         * 6. disable(boolean) 定义账号是否被禁用
         * 7.password(string) 定义用户的密码
         * 8.roles(string...) 授权某个用户一项或多项角色
         */
        /**
         * 我们还可以使用数据库的用户存储还有LDAP服务器的用户存储
         */
//        auth.inMemoryAuthentication()
//                .withUser("user").password("password").roles("USER").and()
//                .withUser("admin").password("password").roles("USER", "ADMIN");
    }
}
