package com.test.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.test.db.DBConnectionManager;

/**
 * @author Rahul Patel
 *ServletContextListener listens to SessionContextEvent event which gives a notification 
 * when Servlet Context is initialized or destroyed.
 *This Interface has two methods.
 *Uses-We can use the “ServletContextListener “ listener for any activity that is required either at 
 *the application deployment time  or any clean up activity required  when application is destroyed. 
 *One of the practical example that I can think of is initializing database connections and clean up 
 *of database connections.
 */
@WebListener
public class AppContextListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent servletContextEvent) {
		ServletContext ctx = servletContextEvent.getServletContext();

		String url = ctx.getInitParameter("DBURL");
		String u = ctx.getInitParameter("DBUSER");
		String p = ctx.getInitParameter("DBPWD");

		//create database connection from init parameters and set it to context
		DBConnectionManager dbManager = new DBConnectionManager(url, u, p);
		ctx.setAttribute("DBManager", dbManager);
		System.out.println("Database connection initialized for Application.");
	}

	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		ServletContext ctx = servletContextEvent.getServletContext();
		DBConnectionManager dbManager = (DBConnectionManager) ctx.getAttribute("DBManager");
		dbManager.closeConnection();
		System.out.println("Database connection closed for Application.");

	}

}
