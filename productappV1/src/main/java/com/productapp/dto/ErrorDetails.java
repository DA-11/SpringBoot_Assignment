package com.productapp.dto;

import java.time.LocalDateTime;
import java.util.Date;

public class ErrorDetails {
	
	private String name;
	private String message;
	private String details;
	private LocalDateTime date;
	
	public ErrorDetails() {
		
	}

	public ErrorDetails(String message, String details, String name, LocalDateTime date) {
		
		this.message = message;
		this.details = details;
		this.name = name;
		this.date = date;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	
	
	
	
}