package com.email;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int defaultPasswordLength = 10;
	private int mailBoxCapacity = 500;
	private String alternateEmail;
	private String companySuffix = "mycompany.com";

	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED :" + firstName + " " + lastName);
		this.department = setDepartment();
		System.out.println("Department is : " + this.department);
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Password is : " + this.password);
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@"
				+ department + "." + companySuffix;
		System.out.println(email);
	}

	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}

	private String setDepartment() {
		System.out
				.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter the Department :");
		Scanner scan = new Scanner(System.in);
		int deptChoice = scan.nextInt();
		if (deptChoice == 1) {
			return "Sales";
		} else if (deptChoice == 2) {
			return "Development";
		} else if (deptChoice == 1) {
			return "Accounting";
		} else {
			return " ";
		}

	}

	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}

	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}

	public void changePassword(String Password) {
		this.password = password;
	}

	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}

	public String setAlternateEmail() {
		return alternateEmail;
	}

	public String getPassword() {
		return password;
	}

	public String showInfo() {
		return "DISPLAY NAME " + firstName + " " + lastName + " EMAIL" + email
				+ " MAILBOXCAPACITY" + mailBoxCapacity + "mb";
	}
}
