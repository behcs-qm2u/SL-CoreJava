package test;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World");
		
		// ------- Data Types in Java ---
		
		int num1;
		int num2;
		
		num1=10;
		num2=11; 
		
		
		int sum = num1+num2;
		int mul = num1*num2;
		int div = num1/num2;
		
		
		System.out.println("Sum is:" + sum);
		System.out.println("Mutiplication:" + mul);
		System.out.println("Division: " + div);
		
		// String name = "BehCS";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter you name :");
		String name = scanner.next();
		
		System.out.println("Hello " + name);
		System.out.println("Lenght : " + name.length());
		System.out.println("Upper Case: " + name.toUpperCase());
		
		// ARRAY
		
		int myarray [] = {2,3,4,5,6,7};
		
		System.out.println("Third Value in Array:" + myarray[2]);
		
		
		
		

	}

}
