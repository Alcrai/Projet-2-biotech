package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Alexandra Craipain
 * 
 * Write the symptom data and this occurrence in file
 *
 */
public class WriterDataInFile implements IDataWriter {

	private String filepath;

	public WriterDataInFile(String filepath) {
		this.filepath = filepath;
	}

	@Override
	public void setData(Map<String, Integer> map) {
		if (filepath != null) {
			try {

				FileWriter writer = new FileWriter(filepath);
				map.forEach((symptom, compteur) -> {
					try {

						writer.write(symptom + " " + compteur + "\n");

					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});

				writer.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
