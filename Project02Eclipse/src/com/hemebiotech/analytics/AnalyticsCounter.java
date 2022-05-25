package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Analyzes the collected data
 * 
 */
public class AnalyticsCounter {

	/**
	 * Read Symptom from file, Count the occurrence of symptom, Sort in alphabetical and create file of result in a same
	 * directory
	 * @throws IOException 
	 */
	public static void main(String args[]) throws IOException {
		
	 IExecuteCount execute = new ExecuteCount();
	 execute.setExecute();
	}


}
