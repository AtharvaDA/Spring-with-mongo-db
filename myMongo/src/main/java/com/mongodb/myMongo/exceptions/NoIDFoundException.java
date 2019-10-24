package com.mongodb.myMongo.exceptions;

public class NoIDFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public NoIDFoundException(String msg) {
		super(msg);
	}

}
