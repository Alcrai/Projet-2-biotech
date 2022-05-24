package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * Analyze data list and return a Map with result
 * 
 *@param List of data
 *@return result in a map
 */
public interface AnalyticsData {
	
	Map<String,Integer> getAnalytics(List<String> list);
	
}
