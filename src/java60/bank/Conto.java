package java60.bank;

import java.util.Random;

public class Conto {

	private int accountNumber;
	private String user;
	private int balance;

//Constructor 
	public Conto(int accountNumber, String user) {

		this.user = user;
		this.accountNumber = accountNumber;

		this.balance = 0;

	}

//	Getter and Setters

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int accountNumber() {
		return accountNumber;
	}

	public int getBalance() {
		return balance;
	}

//	Methods 

	public int addMoney(int money) {

		return balance += money;
	}

	public boolean getMoney(int money) {

		if (balance > money) {

			balance -= money;

			return true;
		}else 

		return false;
}

@Override
	public String toString() {
		return "account number: " + accountNumber + "\nuser: " + user + "\nbalance: " + balance;
	}
}
