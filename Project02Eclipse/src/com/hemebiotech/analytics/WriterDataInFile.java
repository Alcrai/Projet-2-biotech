package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Write the symptom data and this occurrence in file
 * 
 *
 */
public class WriterDataInFile implements IDataWriter {

	private String filepath;

	public WriterDataInFile(String filepath) {
		this.filepath = filepath;
	}

	/**
	 * Write the symptom data and this occurrence in file
	 * 
	 *@param  a Map 
	 */
	@Override
	public void setData(Map<String, Integer> map) {
		if (filepath != null) {
			try {

				FileWriter writer = new FileWriter(filepath);
				map.forEach((symptom, compteur) -> {
					try {

						writer.write(symptom + " " + compteur + "\n");

					} catch (IOException e) {
						e.printStackTrace();
					}
				});

				writer.close();

			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
