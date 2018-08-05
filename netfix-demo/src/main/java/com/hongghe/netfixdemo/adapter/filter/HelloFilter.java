package com.hongghe.netfixdemo.adapter.filter;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 过滤器
 *
 * @author hongghe 04/08/2018
 */
@WebFilter(urlPatterns = "/*")
public class HelloFilter implements Filter {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
       LOGGER.info("The this is hello filter.");
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
