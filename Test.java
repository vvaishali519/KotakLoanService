package com.app;

import java.util.Scanner;

public class Test {
	
	public static int menu() {
		Scanner sc = new Scanner(System.in);
		int loanType;
		System.out.println("                                    Welcome to Kotak Loan Services                                                    ");
		System.out.println();
		System.out.println("                      * Home Loan *     * Education Loan *    * Personal Loan *     * Vehicle Loan *                  ");
		System.out.println();
		System.out.println("         Enter 1 to Get Home Loan  ,  Enter 2 to Get Education Loan ,  Enter 3 to Get Personal Loan ,  Enter 4 to Get Vehicle Loan          ");
		loanType = sc.nextInt();
		return loanType;
	}
	
//	public static void selectLoan(Loan ln) {
//		ln.inputDetails();
//		ln.checkCondition();
//		ln.computeLoan();
//		ln.displayLoan();
//	}

	public static void main(String[] args) {
		
		Test t = new Test();
		int loanType = t.menu();
//		HomeLoan hl = new HomeLoan();
//		t.selectLoan(hl);

	}

}
