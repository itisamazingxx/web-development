package com.itisamazing.servlet_example;

import javax.servlet.*;
import java.io.IOException;

/**
 * Servlet的生命周期管理
 * 通过http://localhost:8080/servlet/helloServlet会正确连接
 * 后台调用init method并打印
 */
public class HelloServlet implements Servlet {
    // 开发一个servlet必须要实现servlet接口

    /**
     * 初始化servlet
     * 当tomcat创建HelloServlet实例时, 会调用init方法
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

        // 该方法只会被调用一次
        System.out.println("init被调用");

    }

    /**
     * 返回Servlet的配置
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * Service方法处理浏览器的请求(包含get/post)
     * 当浏览器每次请求Servlet时 就会调用一次service
     * 当tomcat调用该方法时, 会将http的请求的数据封装成实现了ServletRequest接口的request对象
     * @param servletRequest 通过servletRequest对象, 可以得到用户提交的数据
     * @param servletResponse 对象可以用于返回数据给tomcat -> 浏览器
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    /**
     * 返回Servlet信息
     * @return
     */
    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 在Servlet销毁时被调用, 只会调用一次
     */
    @Override
    public void destroy() {

    }
}