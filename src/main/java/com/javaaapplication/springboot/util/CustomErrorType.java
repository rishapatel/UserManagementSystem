package com.javaaapplication.springboot.util;

/*
*A helper class to send errors [in-case any] from API in JSON format to string.
*/
public class CustomErrorType {
	
	private String errorMessage;
	 
    public CustomErrorType(String errorMessage){
        this.errorMessage = errorMessage;
    }
 
    public String getErrorMessage() {
        return errorMessage;
    }
 
}
