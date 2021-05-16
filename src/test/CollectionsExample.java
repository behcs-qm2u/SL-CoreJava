package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;


public class CollectionsExample {

	
	public static void main(String[] args) {
		
		ArrayList<String> mylist = new ArrayList<String>();
		
		mylist.add("Raj");
		mylist.add("Cherry");
		mylist.add("Marry");
		mylist.add("Alex");
		mylist.add("Kumar");
		mylist.add("Lee");

		
		System.out.println("Before Sorting");
		System.out.println(mylist);
		
		
		Collections.sort(mylist,Collections.reverseOrder());
		System.out.println("Desending Order Sorting");
		System.out.println(mylist);
		
		// -- stack example
		
		Stack<String> mystack = new Stack<String>();
		
		mystack.push("sugar");
		mystack.push("bun");
		mystack.pop();
		mystack.push("coffee");
		
		System.out.println(mystack);
		
	}
	
	
}
