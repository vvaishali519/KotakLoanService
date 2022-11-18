package com.app;

import java.util.Scanner;

public class EducationLoan extends Loan{

	int courseDuration;
	Scanner sc = new Scanner(System.in);
	
	public EducationLoan() {
		super();
	}


	public float computeLoan() {
		if(checkCondition()) {
			amtRepaid = loanAmt * interestRate * timePeriod;
			return amtRepaid;
		}
		return amtRepaid;
	}


	public void displayLoan() {
		float totalAmt = loanAmt + amtRepaid;
		System.out.println("Loan "+totalAmt+" to be paid after "+timePeriod+" years.");
		
	}


	public boolean checkCondition() {
		if(age >= minAge && age <= maxAge)
		{
			System.out.print("Enter Course Duration :");
			courseDuration = sc.nextInt();
			if(courseDuration > 1) {
				System.out.println("You are eligible for Education Loan");
	        	System.out.print("Enter the Loan Amount you want ? :");
	        	loanAmt = sc.nextInt();
	        	System.out.println("Enter the Time Period you want Loan for ? ");
	        	timePeriod = sc.nextInt();
	        	return true;
			}else {
				System.out.println("You are not eligible for Education Loan");
				return false;
			}
		}else {
			System.out.println("You are not eligible for Education Loan");
			return false;
		}
	}


}
