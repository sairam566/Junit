package com.tsr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App 
{	
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
	
    public static void main( String[] args )
    {
    	LOGGER.trace("At TRACE Level");
    	LOGGER.debug("At DEBUG Level");
    	LOGGER.info("At INFO Level");
    	LOGGER.warn("At WARN Level");
    	LOGGER.error("At ERROR Level");
    }
}
