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

public class AnalyticsCounter {
	/**
	 * Analyzes the collected data
	 * 
	 */

	public static void main(String args[]) throws Exception {
		/**
		 * read File text and analyze a data
		 * 
		 * create a new file with analyze
		 */
		
			
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile(
				"D:\\sauvegardeGit\\Projet-2-biotech\\Project02Eclipse\\src\\symptoms.txt");
		
		
		
		List<String> symptomList = reader.GetSymptoms();
		CountOccurrence countData = new CountOccurrence();
		Map<String,Integer> mapCount = countData.getAnalytics(symptomList);
		afficheMap(mapCount);
		Alphabetical mapSort =  new Alphabetical();
		Map<String,Integer> result= mapSort.sortAlpha(mapCount);
		afficheMap(result);
		WriterDataInFile writeFile = new WriterDataInFile(
				"D:\\sauvegardeGit\\Projet-2-biotech\\Project02Eclipse\\src\\result.out");
		writeFile.SetData(result);

	}
	
	
	public static void afficheMap(Map<String, Integer> map) {

		map.forEach((symptom, compteur) -> System.out.println(symptom + " " + compteur));

	}

}
