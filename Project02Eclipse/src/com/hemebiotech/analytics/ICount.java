package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * Analyze data list and return a Map with result
 * 
 *
 */
public interface ICount {
	
	/**
	 * Analyze data list and return a Map with result
	 * 
	 *@param List of data
	 *@return result in a map
	 */
	Map<String,Integer> getCount(List<String> list);
	
}
