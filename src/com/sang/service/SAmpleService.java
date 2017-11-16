package com.sang.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sang.dao.SampleDAO;

public class SAmpleService {
	Logger logger = LogManager.getLogger(SAmpleService.class);
public String getName() {
	logger.info("inside SAmpleService..");
	SampleDAO sampleDAO = new SampleDAO();
	return sampleDAO.getName();
}
}
