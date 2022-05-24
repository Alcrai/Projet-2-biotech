package com.hemebiotech.analytics;

/**
 * If file is empty return the message
 *
 */
public class EmptyFileException extends Exception{
	
	public EmptyFileException (String error){
		super("File Empty");
	}

}
