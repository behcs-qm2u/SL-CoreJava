package test;

import java.util.Scanner;

public class PrimeNumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Get input from user & check if it is prime number

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please input a positive number greater than 1: ");
		int num = scan.nextInt();

		boolean np = false;		// non-prime?
		
	
	    for (int i = 2; i <= num / 2; ++i) {

	        if ( num % i == 0) {
				np = true;
				break;
	        }
	    }		

	    if (np == true)
	    	System.out.println("The number ["+num+"] is NOT Prime Number!");
	    else
	    	System.out.println("The number ["+num+"] is Prime Number!");

		scan.close();
		
	}
		

}
