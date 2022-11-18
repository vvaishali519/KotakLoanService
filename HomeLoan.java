package com.app;

import java.util.Scanner;

public class HomeLoan extends Loan{
		
	 int noOfDocuments;
	 int cibilScore;
	 Scanner sc = new Scanner(System.in);

	public HomeLoan() {
		super();
	}

	public float computeLoan() {
		
		if(checkCondition())
		{
			if(noOfDocuments == 5 && cibilScore >= 750) {
				if(cibilScore >= 750 && cibilScore <= 800) {
					//Interest rate 7.5
					amtRepaid = (float) (loanAmt * 0.075 * timePeriod) ;
				}
				else if(cibilScore > 800){
					//Interest rate 8.0 
					amtRepaid = (float) (loanAmt * 0.08 * timePeriod);
				}
			}
		}
		return amtRepaid;
	}

	public void displayLoan() {
		float totalAmt = loanAmt+amtRepaid;
		System.out.println("Loan "+totalAmt+" to be paid after "+timePeriod+" years.");
	}

	public boolean checkCondition() {
        if(age > minAge && age <= maxAge && salary >= minIncome) {
        	System.out.println("You are eligible for Home Loan");
        	System.out.print("Enter the Loan Amount you want ? :");
        	loanAmt = sc.nextInt();
        	System.out.println("Enter the Time Period you want Loan for ? ");
        	timePeriod = sc.nextInt();
        	System.out.print("Enter your cibil Score :");
        	cibilScore = sc.nextInt();
        	return true;
        }else {
        	System.out.println("Sorry! You are not Eligible for Home Loan ");
        	return false;
        }
	}
	 
	 
	
}
