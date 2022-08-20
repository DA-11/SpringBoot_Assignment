package com.productapp.exceptions;

public class ProductNotFoundException extends RuntimeException{
	
	private static Long serial = 10L;
	
	public ProductNotFoundException(String message) {
		super(message);
	}
}
