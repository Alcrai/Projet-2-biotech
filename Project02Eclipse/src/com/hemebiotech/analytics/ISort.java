package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Sort a Map in order alphabetical
 * 
 */

public interface ISort {
	
	/**
	 * Sort a Map in order alphabetical
	 * 
	 *@param Not order map
	 *@return Order Map
	 */
	Map<String,Integer> sortAlpha(Map<String,Integer> notOrder);
		
}
