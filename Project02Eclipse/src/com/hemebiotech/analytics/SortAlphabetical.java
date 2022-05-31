package com.hemebiotech.analytics;

import java.util.Map;
import java.util.TreeMap;

/**
 * Class implement AlphabeticalSort interface
 * Organize a map in alphabetics order
 *
 */
public class SortAlphabetical implements ISort {
	
	/**
	 * Organize a map in alphabetics order
	 * 
	 *@param a Map not order
	 *@return a Map order
	 */
	@Override
	public Map<String,Integer> sortAlpha(Map<String,Integer> notOrder){
		
		Map<String, Integer> map = new TreeMap<String, Integer>();
		if (!notOrder.isEmpty()) {
			notOrder.forEach((value, key) -> map.put(value,key));
		}
		return map;
	
	}
}
	