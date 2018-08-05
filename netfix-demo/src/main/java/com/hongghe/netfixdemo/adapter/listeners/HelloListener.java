package com.hongghe.netfixdemo.adapter.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * The listener
 *
 * @author hongghe 04/08/2018
 */
@WebListener
public class HelloListener implements ServletContextListener {


    private static final Logger LOGGER = LoggerFactory.getLogger(HelloListener.class);

    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
        LOGGER.info("HelloListener contextDestroyed.");
    }

    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        LOGGER.info("HelloListener contextInitialized.");
    }
}
