package com.hemebiotech.analytics;

/**
 * If file is empty return the message
 *
 */
public class EmptyFileException extends Exception{
	
	/**
	 * If file is empty return the message "File Empty"
	 *
	 */
	public EmptyFileException (){
		super("File Empty");
	}

}
