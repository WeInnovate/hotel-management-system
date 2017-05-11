package com.hms.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class MyHMSListener
 *
 */
@WebListener
public class MyHMSListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public MyHMSListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	ServletContext ctx = sce.getServletContext();
    	String createTables = ctx.getInitParameter("createTables");
    	
    	if("YES".equalsIgnoreCase(createTables)){
    		System.out.println("Creating tables.");
    	}
    }
	
}
