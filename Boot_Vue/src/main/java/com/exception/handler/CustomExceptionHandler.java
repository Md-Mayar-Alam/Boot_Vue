package com.exception.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.exception.NoItemFoundException;
import com.exception.StudentNotFoundException;
import com.exception.model.ErrorDetails;

@ControllerAdvice
public class CustomExceptionHandler {
	
	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleStudentNotFoundException(StudentNotFoundException ex, WebRequest request){
		ErrorDetails errorDetails= new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<ErrorDetails>(errorDetails, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(NoItemFoundException.class)
	public ResponseEntity<ErrorDetails> handleNoItemFoundException(NoItemFoundException ex, WebRequest request){
		ErrorDetails errorDetails= new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(errorDetails, HttpStatus.NO_CONTENT);
	}
}
