package com.cognizant.tdd.SLF4JDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLogging {
	private static final Logger log  = LoggerFactory.getLogger(ParameterizedLogging.class);
	public static void main(String[] args) {
		String name = "Mohan";
		String dept = "CSE";
		log.debug("Found {} from department of {} " , name, dept);
		String skills = null;
		log.debug("Skillsets include : {} " , skills); // handles Null values without throwing Null Pointer exception
		// In order to print the curly braces in our application use \\ before curly braces
		log.debug("Kindly use \\{} for paramterised logs to prevent TC of String Concatenation");
	}
}
