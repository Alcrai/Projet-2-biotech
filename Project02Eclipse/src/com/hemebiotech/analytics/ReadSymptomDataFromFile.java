package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;
	
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}
	
	@Override
	public List<String> GetSymptoms() throws IOException {
		ArrayList<String> result = new ArrayList<String>();
		
		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();
				
				if(line != null) {
				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				reader.close();
				} else {
					throw new EmptyFileException("");
				}
			} catch (FileNotFoundException e) {
				System.out.println("File not Found Exception");
			} catch (EmptyFileException e){
				System.out.println("File empty");
			}
		}
		
		return result;
	}

}
