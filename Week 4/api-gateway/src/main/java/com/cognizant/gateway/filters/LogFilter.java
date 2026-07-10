package com.cognizant.gateway.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
public class LogFilter implements Filter {
    Logger logger = LoggerFactory.getLogger(LogFilter.class);

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, jakarta.servlet.ServletException {
        if (request instanceof HttpServletRequest) {
            logger.info("====>Request URL {}", ((HttpServletRequest) request).getRequestURI());
        }
        chain.doFilter(request, response);
    }
}
