package com.email;
//EMAIL APPLICATION
//THIS CONTAINS : 1. GENERATE AN EMAIL WITH THE SYNTAX firstname.lastname@department.company.com
//				  2. DETERMINE THE DEPARTMENTS(SALES, DEVELOPMENT, ACCOUNTING)IF NONE LEAVE BLANK
//				  3. GENERATE RANDOM STRING FOR A PASSWORD
//				  4. HAVE SET METHODS TO CHANGE THE PASSWORD, SET THE MAILBOX CAPACITY,AND DEFINE AN ALTERNATE EMAIL ADDRESS
//				  5. HAVE GET METHODS TO DISPLAY NAME, EMAIL AND MAILBOXCAPACITY
public class EmailApp {

	public static void main(String[] args) {
		Email em = new Email("JAVA", "APPLICATION");
		System.out.println(em.showInfo());
	}

}