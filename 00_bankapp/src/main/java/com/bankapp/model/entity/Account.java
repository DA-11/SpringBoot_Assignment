package com.bankapp.model.entity;


public class Account {
	
	private int id;
	private String name;
	private double balance;

	private String email;
	private String phone;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("HELLO FROM GIT");
		System.out.println("HELLO FROM GIT2");
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	public Account(String name, double balance, String email, String phone) {
		super();
		this.name = name;
		this.balance = balance;
		this.email = email;
		this.phone = phone;
	}

	
	public Account(int id, String name, double balance, String email, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.email = email;
		this.phone = phone;
	}

	public Account() {
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

}
