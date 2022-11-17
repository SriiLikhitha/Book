package com.book.exception;

@SupperssWarnings("serial")

public class InvalidBookException extends Exception {
	public InvalidBookException(String msg)
	{
		System.out.println("Exception is :\n"+msg);
	}

}
