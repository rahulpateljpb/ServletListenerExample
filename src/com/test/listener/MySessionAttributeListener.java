package com.test.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * @author Rahul Patel
 *ServletContextAttributeListener listens to SessionContexAttributetEvent event which gives a notification when any
 *object is added, removed or replaced from servlet context. 
 * Attribute name and value  that has been added, removed or replaced  can be obtained from the getName() and getValue()
 * method of ServletContextAttributeEvent
 */
@WebListener

public class MySessionAttributeListener implements HttpSessionAttributeListener {

	@Override
	public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {
	    System.out.println("Attribute has been added");
	    String attributeName = httpSessionBindingEvent.getName();
	    Object attributeValue = httpSessionBindingEvent.getValue();
	    System.out.println("Attribute Name ::" + attributeName);
	    System.out.println("Attribute Value ::" + attributeValue.toString());
	}
	@Override
	public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {
	        System.out.println("Attribute has been removed");
	        String attributeName = httpSessionBindingEvent.getName();
	        Object attributeValue = httpSessionBindingEvent.getValue();
	        System.out.println("Attribute Name ::" + attributeName);
	            System.out.println("Attribute Value ::" + attributeValue.toString());
	}
	@Override
	public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {
	        System.out.println("Attribute has been replaced");
	        String attributeName = httpSessionBindingEvent.getName();
	        Object attributeValue = httpSessionBindingEvent.getValue();
	        System.out.println("Attribute Name ::" + attributeName);
	    System.out.println("Attribute Value ::" + attributeValue.toString());
	    }
	
}
