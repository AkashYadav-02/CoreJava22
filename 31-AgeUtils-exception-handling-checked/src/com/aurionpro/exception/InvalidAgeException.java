package com.aurionpro.exception;

public class InvalidAgeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

	public InvalidAgeException(String message) {
		this.message=message;
	}
	@Override
	public String getMessage(){
		return this.getClass().getSimpleName()+" :"+message;
	}
	@Override
	public String toString() {
		return this.getClass().getSimpleName()+" :"+message;
	}
}