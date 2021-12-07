package com.evoke.exceptionhandling;

public enum ErrortypeLocal {
	EXCEPTION("EXCEPTION"),EMPLOYEENOTFOUND("EMPLOYEENOTFOUND");

	public final String exceptionLabel;

    private ErrortypeLocal(String exceptionLabel) {
        this.exceptionLabel = exceptionLabel;
    }
}
