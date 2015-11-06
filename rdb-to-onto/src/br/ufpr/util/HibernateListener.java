package br.ufpr.util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import br.ufpr.util.HibernateUtil;

public class HibernateListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		try {
			HibernateUtil.initialize();
			System.out.println("Initializing hibernate...");
		} catch (Throwable ex) {
			System.err.println("Error initializing hibernate :" + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

}
