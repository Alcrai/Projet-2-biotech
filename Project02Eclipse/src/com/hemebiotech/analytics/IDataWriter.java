package com.hemebiotech.analytics;

import java.util.Map;

/**
 * @author Alexandra Craipain
 * 
 *Write result in exit
 */
public interface IDataWriter {
	/**
	 * If no data is available, return an empty map
	 * 
	 * a raw map of all data and occurrence obtained from a data source
	 */
	public void SetData(Map<String, Integer> map);

}

