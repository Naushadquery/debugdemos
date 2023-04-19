package com.nau.demo1;

import java.util.logging.Logger;

public class Demo1 {
	
	private static final Logger logger = Logger.getLogger("Demo1.class");

	public static void main(String[] args) {
		logger.info("Entereing main method");
		AverageFinder averageFinder = new AverageFinder();
		double avg = averageFinder.findAverage(args);
		System.out.println("The average is " + avg);
		logger.info("Exiting main method");
	}
}
