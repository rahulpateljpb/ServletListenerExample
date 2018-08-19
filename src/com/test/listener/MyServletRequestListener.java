package com.test.listener;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * @author Rahul Patel
 *ServletRequestListener listens to ServletRequestEvent event which gives a notification 
 *when request is created or destroyed.
 *It will call When the request is initiated. 
 */
@WebListener
public class MyServletRequestListener implements ServletRequestListener {

    /* (non-Javadoc)
     * @see javax.servlet.ServletRequestListener#requestDestroyed(javax.servlet.ServletRequestEvent)
     * This is the first method that executed,when the request is created.
     */
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
    	ServletRequest servletRequest = servletRequestEvent.getServletRequest();
    	System.out.println("ServletRequest destroyed. Remote IP="+servletRequest.getRemoteAddr());
    }

    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
    	ServletRequest servletRequest = servletRequestEvent.getServletRequest();
    	System.out.println("ServletRequest initialized. Remote IP="+servletRequest.getRemoteAddr());
    }
	
}
