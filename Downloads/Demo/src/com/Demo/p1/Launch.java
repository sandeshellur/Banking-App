package com.Demo.p1;

import java.util.Scanner;

public class Launch {
	public static void main(String[] args) {
		BankAccount b=new BankAccount("Sandy","SA001");
		b.ShowMenu();
	}
}

class BankAccount {
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;

	BankAccount(String cname, String cid) {
		customerName = cname;
		customerId = cid;
	}

	public void deposit(int amount) {
		if (amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}

	public void withdraw(int amount) {
		if (amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}

	public void getPreviousTransaction() {
		if (previousTransaction > 0) {
			System.out.println("Deposited = " + previousTransaction);
		} else if (previousTransaction < 0) {
			System.out.println("Withdrawn = " + Math.abs(previousTransaction));
		} else {
			System.out.println("Transation not found");
		}

	}

	void ShowMenu() {
		char option = '\0';
		Scanner scan = new Scanner(System.in);
		System.out.println("WELCOME " + customerName);
		System.out.println("Your C.Id is : " + customerId);
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous Transaction");
		System.out.println("E. Exit");

		do {
			System.out.println("========================");
			System.out.println("Enter an option");
			System.out.println("========================");
			option = scan.next().charAt(0);

			switch (option) {
			case 'A':
				System.out.println("----------------------");
				System.out.println("balance = " + balance);
				System.out.println("----------------------");
				break;

			case 'B':
				System.out.println("--------------------------");
				System.out.println("Enter an amount to deposit");
				System.out.println("--------------------------");
				int amount = scan.nextInt();
				deposit(amount);
				break;

			case 'C':
				System.out.println("---------------------------");
				System.out.println("Enter an amount to withdraw");
				System.out.println("---------------------------");
				int amount2 = scan.nextInt();
				withdraw(amount2);
				break;

			case 'D':
				System.out.println("----------------------");
				getPreviousTransaction();
				System.out.println("----------------------");
				break;

			case 'E':
				System.out.println("*************************");
				break;

			default:
				System.out.println("Invalid option!!Try Again");
			}
		} while (option != 'E');
		System.out.println("Thank you for using our services");

	}
}