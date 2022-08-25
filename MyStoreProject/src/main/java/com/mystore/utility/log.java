package com.mystore.utility;

//import java.util.logging.Logger;
import org.apache.log4j.Logger;

import com.aventstack.extentreports.model.Log;


public class log {

	
	//initialise log4j logs
	
	public static Logger log = Logger.getLogger(Log.class.getName());
	
	public static void startTestCase(String sTestCaseName) {
		log.info("============="+sTestCaseName+" Test Start===============");
	}
	
	public static void endTestCase(String sTestCaseName) {
		log.info("============="+sTestCaseName+" Test end===============");
	}
	
	public static void info(String message) {
		log.info(message);
	}
	public static void warn(String message) { 
		log.warn(message);
	}
	
	public static void fatal(String message) {
		log.fatal(message);
	}
	
}
