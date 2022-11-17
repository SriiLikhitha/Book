package com.book.exception;



public class InvalidBookException extends Exception {
	public InvalidBookException(String msg)
	{
		System.out.println("Exception is :\n"+msg);
	}

}
