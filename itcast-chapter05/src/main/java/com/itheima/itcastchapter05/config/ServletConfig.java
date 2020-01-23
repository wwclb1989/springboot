package com.itheima.itcastchapter05.config;

import com.itheima.itcastchapter05.servletComponent.MyFilter;
import com.itheima.itcastchapter05.servletComponent.MyListener;
import com.itheima.itcastchapter05.servletComponent.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * Filter与Listener都会自动注册
 * Servlet不会
 */
@Configuration
public class ServletConfig {

//    // 注册Servlet组件
//    @Bean
//    public ServletRegistrationBean getServlet(MyServlet myServlet) {
//        ServletRegistrationBean registrationBean = new ServletRegistrationBean(myServlet, "/myServlet");
//        return registrationBean;
//    }
//
//    // 注册Filter组件
//    @Bean
//    public FilterRegistrationBean getFilter(MyFilter filter) {
//        FilterRegistrationBean registrationBean = new FilterRegistrationBean(filter);
//        registrationBean.setUrlPatterns(Arrays.asList("/toLoginPage", "/myFilter"));
//        return registrationBean;
//    }
//
//    // 注册Listener组件
//    @Bean
//    public ServletListenerRegistrationBean getServletListener(MyListener myListener) {
//        ServletListenerRegistrationBean registrationBean = new ServletListenerRegistrationBean(myListener);
//        return registrationBean;
//    }
}
