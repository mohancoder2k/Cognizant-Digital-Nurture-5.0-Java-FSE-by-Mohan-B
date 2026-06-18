package com.cognizant.tdd.SLF4JDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppendersExample {
	private static final Logger log = LoggerFactory.getLogger(AppendersExample.class);
	 public static void main(String[] args) {
	        log.info("Application context initialized successfully.");
	        
	        try {
	            executeTask("mohan_smvec2344");
	        } catch (Exception e) {
	            log.error("Critical execution breakdown detected", e);
	        }
	    }
    private static void executeTask(String taskId) {
        
        log.debug("Preparing execution metadata pipeline context for task: {}", taskId);
        log.warn("Task execution profile is missing an optimized timeout threshold. Defaulting to 5000ms.");
        
        // Simulating logic execution block
        log.info("Task: {} finalized execution paths.", taskId);
    }
}