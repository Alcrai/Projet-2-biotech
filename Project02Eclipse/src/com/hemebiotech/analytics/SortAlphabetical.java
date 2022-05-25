package com.hemebiotech.analytics;

import java.util.Map;
import java.util.TreeMap;

/**
 * Class implement AlphabeticalSort interface
 * Organize a map in alphabetics order
 *
 */
public class SortAlphabetical implements ISort {
	
	@Override
	public Map<String,Integer> sortAlpha(Map<String,Integer> notOrder){
		
		Map<String, Integer> map = new TreeMap<String, Integer>();
		if (!notOrder.isEmpty()) {
			notOrder.forEach((value, key) -> map.put(value,key));
		}
		return map;
	
	}
}
	