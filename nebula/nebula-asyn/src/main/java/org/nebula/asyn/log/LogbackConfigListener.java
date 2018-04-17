package org.nebula.asyn.log;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author fugaoyang 
 * created at 2018年1月3日 下午5:11:21
 * 
 */
public class LogbackConfigListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent event) {
        LogbackWebConfigurer.initLogging(event.getServletContext());
    }

    public void contextDestroyed(ServletContextEvent event) {
        LogbackWebConfigurer.shutdownLogging(event.getServletContext());
    }

}
