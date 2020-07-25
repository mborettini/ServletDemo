package com.sda.note;

import org.apache.log4j.Logger;

import javax.servlet.*;
import java.io.IOException;

public class NoteFilter implements Filter {

    private static final Logger log = Logger.getLogger(NoteFilter.class);

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String remoteAddr = servletRequest.getRemoteAddr();
        log.info("Request for address: " + "" + " come frome IP: " + remoteAddr);
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
