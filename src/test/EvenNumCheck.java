package test;

import java.util.Scanner;

public class EvenNumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Problem statement:
		// Get input from user
		// check if number is even number
		
		int i=1; 
		
		Scanner scan = new Scanner(System.in);
		
		while (i != 0) {

			System.out.print("Please input a positive number, 0 to exit: ");
			i = scan.nextInt();


			
			if (i % 2 == 0) {
				System.out.println("The number ["+i+"] is even number!");
			}
			else {
				System.out.println("The number ["+i+"] is NOT even number!");
			}
		}
		
		System.out.println("Bye!");
		scan.close();
		
	}

}
