package com.nau.demo1;

import java.util.logging.Logger;

public class AverageFinder {

	private static final Logger logger = Logger.getLogger("AverageFinder.class");

	public double findAverage(String[] input) {
		logger.info("findAverage method entered");
		double result = 0;
		for (String s : input) {
			result += Integer.parseInt(s);
		}
		logger.info("findAverage method exited");
		return result ;
	}
}