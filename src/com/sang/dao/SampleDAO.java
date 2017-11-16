package com.sang.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SampleDAO {
	Logger logger = LogManager.getLogger(SampleDAO.class);
public String getName() {
	logger.debug("This is a debug message.");
    logger.info("This is an info message.");
    logger.warn("This is a warn message.");
    logger.error("This is an error message.");
    logger.fatal("This is a fatal message.");
	return "Sangeetha";
}
}
