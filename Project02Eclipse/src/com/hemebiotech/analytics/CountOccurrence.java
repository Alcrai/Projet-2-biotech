package com.hemebiotech.analytics;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Implement AnalyticsData Count Occurrence of symptom
 * 
 */
public class CountOccurrence implements ICount {

	/**
	 * Count Occurrence of symptom
	 * 
	 * @param List of symptom
	 * @return Map the key is symptom and the value is occurrence of symptom
	 */
	@Override
	public Map<String, Integer> getCount(List<String> symptoms) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		if (symptoms != null) {
			for (String symptom : symptoms) {
				map.put(symptom, Collections.frequency(symptoms, symptom));
			}
		}
		return map;
	}

}
