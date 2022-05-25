package com.hemebiotech.analytics;

import java.util.Map;

/**
 * @author Alexandra Craipain
 * 
 *Write the analyze data in all source
 */
public interface IDataWriter {
	
	/**
	 * If no data is available, return an empty map
	 * 
	 * a raw map of all symptom data and occurrence obtained from a data source
	 * @param Map
	 */
	void setData(Map<String, Integer> map);

}

