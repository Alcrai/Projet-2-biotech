package com.hemebiotech.analytics;

import java.util.Map;
import java.util.TreeMap;

public class Alphabetical implements AlphabeticalSort{
	
	@Override
	public Map<String,Integer> sortAlpha( Map<String,Integer> notOrder){
		
		Map<String, Integer> map = new TreeMap<String, Integer>();
		if (! notOrder.isEmpty()) {
			notOrder.forEach((value, key) -> map.put(value,key));
		}
		return map;
	
	}
}
