package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * implements IexecuteCount
 * 
 */
public class ExecuteCount implements IExecuteCount {
	
	/**
	 * read a symptom with ISymptomreader, create a map with Symptom data and this number of occurrence with Icount
	 * organize in order alphabetical the result with ISort and write a result with IdataWriter
	 * 
	 */
	@Override
	public void execute() throws IOException {
		
		String filePath = "Project02Eclipse/src/";
		
		ISymptomReader reader = new ReadSymptomDataFromFile(filePath + "symptoms.txt");
		List<String> symptomList = reader.getSymptoms();
		
		ICount countData = new CountOccurrence();
		Map<String, Integer> mapCount = countData.getCount(symptomList);
	
		ISort mapSort = new SortAlphabetical();
		Map<String, Integer> result = mapSort.sortAlpha(mapCount);
			
		IDataWriter writeFile = new WriterDataInFile(filePath + "result.out");
		writeFile.setData(result);
	}

}
