package com.orangehaswing.filterandinterceptor;


import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.Date;

// configuration one:add annotation
//@Component
//@WebFilter(urlPatterns = {"/*"})
public class TimeFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init filter");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("start filter");
        Long start = new Date().getTime();
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("spend time: " + (new Date().getTime()-start));
        System.out.println("end filter");
    }

    @Override
    public void destroy() {
        System.out.println("destroy filter");
    }
}
