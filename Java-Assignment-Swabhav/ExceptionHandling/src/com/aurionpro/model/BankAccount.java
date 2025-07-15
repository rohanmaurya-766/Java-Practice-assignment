package com.aurionpro.model;

import com.aurionpro.exception.InsufficentBalanceException;
import com.aurionpro.exception.InvalidAmountException;

public class BankAccount {

	private String name;
	private int id;
	private double balance;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", id=" + id + ", balance=" + balance + "]";
	}

	public BankAccount(String name, int id, double balance) {
		super();
		this.name = name;
		this.id = id;
		this.balance = balance;
	}

	public double deposit(double amount) throws InvalidAmountException {
		if (amount < 0) {
			throw new InvalidAmountException("Please enter correct value");
		} else {
			return balance += amount;
		}
	}

	public double withdraw(double amount) throws InsufficentBalanceException {
		if (balance < amount) {
			throw new InsufficentBalanceException("Amount cannot exceed the balance");
		} else {
			return balance -= amount;
		}
	}



}
