package com.app;

import java.util.Scanner;

abstract public class Loan {
		
	int loanAmt;
	float interestRate;
	int timePeriod;
	float minIncome;
	int minAge;
	int maxAge;
	float amtRepaid;
	String name;
	int age;
	float salary;
	
	
	public Loan() {
		loanAmt = 10000;
		interestRate = 7.5f;
		timePeriod = 2;
		minIncome = 15000;
		minAge = 21;
		maxAge = 60;
	}


	public Loan(int loanAmt, float interestRate, int timePeriod, float minIncome, int minAge, int maxAge) {
		this.loanAmt = loanAmt;
		this.interestRate = interestRate;
		this.timePeriod = timePeriod;
		this.minIncome = minIncome;
		this.minAge = minAge;
		this.maxAge = maxAge;
	}
	
	public void inputDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Dear Customer Please Enter Your Personal Details  "); 
		System.out.print(" Name : ");
		name = sc.nextLine();
		System.out.print(" Age : ");
		age = sc.nextInt();
		System.out.print(" Enter your Montly Income : ");
		salary = sc.nextFloat();
	}
	
	abstract public boolean checkCondition();
	abstract public float computeLoan();
	abstract public void displayLoan();

	
}
