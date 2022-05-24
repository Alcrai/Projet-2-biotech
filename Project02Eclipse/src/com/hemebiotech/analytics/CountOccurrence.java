package com.hemebiotech.analytics;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountOccurrence implements AnalyticsData{
	
	@Override
	public Map<String, Integer> getAnalytics(List<String> list) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		for (String l:list) {
			map.put(l, Collections.frequency(list, l));
		}
		return map;
	}
	
}
