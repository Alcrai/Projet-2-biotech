package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Analyzes the collected data
 * 
 */
public class AnalyticsCounter {

	/**
	 * Read Symptom from file, Count the occurrence of symptom, Sort in alphabetical and create file of result in a same
	 * directory
	 */
	public static void main(String args[]) throws Exception {
		
		String filePath = "Project02Eclipse/src/";
		
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile(filePath + "symptoms.txt");
		List<String> symptomList = reader.getSymptoms();
		CountOccurrence countData = new CountOccurrence();
		Map<String, Integer> mapCount = countData.getAnalytics(symptomList);
		// afficheMap(mapCount);
		
		Alphabetical mapSort = new Alphabetical();
		Map<String, Integer> result = mapSort.sortAlpha(mapCount);
		// afficheMap(result);
		
		WriterDataInFile writeFile = new WriterDataInFile(filePath + "result.out");
		writeFile.SetData(result);
	}

//	public static void afficheMap(Map<String, Integer> map) {
//		map.forEach((symptom, compteur) -> System.out.println(symptom + " " + compteur));
//	}

}
