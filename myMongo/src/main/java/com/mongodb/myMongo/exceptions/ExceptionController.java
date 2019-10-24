package com.mongodb.myMongo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {
	@ExceptionHandler(NoIDFoundException.class)
	public ResponseEntity<Object> handleIDNotFoundException() {
		return new ResponseEntity<>("Resource Not Found", HttpStatus.NOT_FOUND);
	}
}
