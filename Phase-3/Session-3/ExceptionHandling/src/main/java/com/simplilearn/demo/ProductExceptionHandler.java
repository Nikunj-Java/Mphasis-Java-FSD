package com.simplilearn.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductExceptionHandler {
	
	
	@ExceptionHandler(value= ProductNotFoundException.class)
	public ResponseEntity<Object> handleExceptionEntity (ProductNotFoundException e){
		return new ResponseEntity<Object>("Not Found"+e.getMessage(),HttpStatus.NOT_FOUND);
	}

}
