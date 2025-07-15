package com.aurionpro.test;

import com.aurionpro.exception.InsufficentBalanceException;
import com.aurionpro.exception.InvalidAmountException;
import com.aurionpro.model.BankAccount;

public class BankTest {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("Raju", 101, 1000);

		try {
			acc1.deposit(2000);
		} catch (InvalidAmountException e) {
			e.printStackTrace();
		}
		try {
			acc1.withdraw(2999);
		} catch (InsufficentBalanceException e) {
			e.printStackTrace();
		}
		System.out.println("Amount Holder name"+acc1.getName());
		System.out.println("Amount Id"+acc1.getId());
		System.out.println("Amount balance:" + acc1.getBalance());

	}
}
