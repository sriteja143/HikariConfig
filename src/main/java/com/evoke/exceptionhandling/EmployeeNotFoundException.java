package com.evoke.exceptionhandling;

public class EmployeeNotFoundException extends RuntimeException{

	
	private static final long serialVersionUID = 1L;
	
	 public EmployeeNotFoundException(String exception) {
	        super(exception);
	    }

}
