package com.vedait.opps.constructors;

public class BankAccount {

	private String accountNumber;
	private String accountHolderName;
	private double balance; // instace variables

	// Default Constructor
	public BankAccount() {
		this.accountNumber = "000000";
		this.accountHolderName = "Unknown";
		this.balance = 0.0;
	}

	// Parameterized Constructor
	public BankAccount(String accountNumber, String accountHolderName, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	// Method to deposit money
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: $ " + amount);
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	// Method to withdraw money
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrew: $" + amount);
		} else {
			System.out.println("Invalid or insufficient funds for withdrawal.");
		}
	}

	// Method to check balance
	public double checkBalance() {
		return balance;
	}

	// Display Account Details
	public void displayAccountInfo() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Holder: " + accountHolderName);
		System.out.println("Balance: $" + balance);
	}

	public static void main(String[] args) {

		BankAccount bankAccount = new BankAccount("1000200202", "Chandra Y", 20000.00);
		bankAccount.deposit(2000.508);
		bankAccount.withdraw(1500.00);

		bankAccount.displayAccountInfo();
		double avilableBalance = bankAccount.checkBalance();
		System.out.println("Avilable Balance: " + avilableBalance);
	}

}
