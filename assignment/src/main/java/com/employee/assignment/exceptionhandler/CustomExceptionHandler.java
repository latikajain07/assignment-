package com.employee.assignment.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
	public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

	
	    @ExceptionHandler(Exception.class)
	    public ResponseEntity<Object> handleExceptions(Exception ex) 
	    {
	        String message = "An error occurred: " + ex.getMessage();
	        return new ResponseEntity<>(message, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}



