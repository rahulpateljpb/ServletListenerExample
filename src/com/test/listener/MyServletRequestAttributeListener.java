package com.test.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

/**
 * @author Rahul Patel
 *ServletRequestAttributeListener listens to ServletRequestAttributeEvent  event which gives a notification when any  object is added, 
 * removed or replaced from request
 */
public class MyServletRequestAttributeListener implements ServletRequestAttributeListener{

	/**
     * Default constructor. 
     */
    public MyServletRequestAttributeListener() {
    }
    /* (non-Javadoc)
     * @see javax.servlet.ServletRequestAttributeListener#attributeAdded(javax.servlet.ServletRequestAttributeEvent)
     * This method is called after the requested is generated and adding the new attribute.
     */
    public void attributeAdded(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        System.out.println("Attribute has been added");
        String attributeName = servletRequestAttributeEvent.getName();
        Object attributeValue = servletRequestAttributeEvent.getValue();
        System.out.println("Attribute Name ::" + attributeName);
        System.out.println("Attribute Value ::" + attributeValue.toString());
    }
    public void attributeRemoved(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        System.out.println("Attribute has been added");
        String attributeName = servletRequestAttributeEvent.getName();
        Object attributeValue = servletRequestAttributeEvent.getValue();
        System.out.println("Attribute Name ::" + attributeName);
        System.out.println("Attribute Value ::" + attributeValue.toString());
    }
    public void attributeReplaced(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        System.out.println("Attribute has been added");
        String attributeName = servletRequestAttributeEvent.getName();
        Object attributeValue = servletRequestAttributeEvent.getValue();
        System.out.println("Attribute Name ::" + attributeName);
        System.out.println("Attribute Value ::" + attributeValue.toString());
    }
}
