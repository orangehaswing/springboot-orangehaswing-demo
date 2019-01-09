package com.orangehaswing.filterandinterceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

@Component
public class TimeInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                             Object o) throws Exception{
        System.out.println("before interceptor");
        httpServletRequest.setAttribute("startTime",new Date().getTime());
        System.out.println(((HandlerMethod) o).getBean().getClass().getName());
        System.out.println(((HandlerMethod) o).getMethod().getName());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                           Object o, ModelAndView modelAndView)throws Exception{
        System.out.println("start interceptor");
        Long start = (Long) httpServletRequest.getAttribute("startTime");
        System.out.println("spend time" + (new Date().getTime()-start));
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse,
                                Object o,Exception e)throws Exception{
        System.out.println("after interceptor");
        Long start = (Long) httpServletRequest.getAttribute("startTime");
        System.out.println("spend time:" + (new Date().getTime()-start));
        System.out.println("exception" + e);
    }
}
