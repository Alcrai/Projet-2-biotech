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
		
			
		ReadSymptomDataFromFile lecture = new ReadSymptomDataFromFile(
				"D:\\sauvegardeGit\\Projet-2-biotech\\Project02Eclipse\\src\\symptoms.txt");
		
		
		
		List<String> symptomList = lecture.GetSymptoms();
		Map<String, Integer> resultat = new HashMap<String, Integer>();

		resultat = countSymptom(symptomList);
		afficheMap(resultat);
		WriterDataInFile writeFile = new WriterDataInFile(
				"D:\\sauvegardeGit\\Projet-2-biotech\\Project02Eclipse\\src\\result.out");
		writeFile.SetData(resultat);

	}

	public static Map<String, Integer> countSymptom(List<String> symptom) {
		/**
		 * Create Map order with all symptom and this occurence
		 * 
		 * @return ordered map : Key is the symptom and Value is symptom count
		 */

		Map<String, Integer> symptomNombre = new TreeMap<String, Integer>();

		for (String s : symptom) {

			if (!symptomNombre.containsKey(s)) {
				symptomNombre.put(s, 1);
			} else {
				Integer value = symptomNombre.get(s) + 1;
				symptomNombre.replace(s, value);
			}
		}
		return symptomNombre;

	}

	public static void afficheMap(Map<String, Integer> map) {

		map.forEach((symptom, compteur) -> System.out.println(symptom + " " + compteur));

	}

}
