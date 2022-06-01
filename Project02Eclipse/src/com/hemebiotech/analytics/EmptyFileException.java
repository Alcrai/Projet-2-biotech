package com.hemebiotech.analytics;

public class EmptyFileException extends Exception{
	
	public EmptyFileException (String error){
		super("File Empty");
	}

}
