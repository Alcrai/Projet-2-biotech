package com.hemebiotech.analytics;

import java.io.IOException;

/**
 * 
 * Read a symptom list, count occurrence of symptom, sort a result in order alphabetical and write a file result
 *
 */

public interface IExecuteCount {
	
	/**
	 * 
	 * Read a symptom list, count occurrence of symptom, sort a result in order alphabetical and write a file result
	 * @throws IOException 
	 *
	 */
	void execute() throws IOException;

}
