package com.orangehaswing.filterandinterceptor;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

// configuration two: FilterRegistrationBean to register
@Configuration
public class WebConfig {

    @Bean
    public FilterRegistrationBean timeFilter(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        TimeFilter timeFilter = new TimeFilter();
        filterRegistrationBean.setFilter(timeFilter);

        List<String> urllist = new ArrayList<>();
        urllist.add("/*");

        filterRegistrationBean.setUrlPatterns(urllist);
        return filterRegistrationBean;
    }
}
