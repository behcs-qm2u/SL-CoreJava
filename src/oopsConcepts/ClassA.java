package oopsConcepts;

public class ClassA {
	
	public int Salary;
	public String Name;
	public String OrgName;
	
	public ClassA() {
		System.out.println("Inside Constructor");
	}
	
	//  (parameterized constructor)
	public ClassA(int val1, String val2, String val3) {
		System.out.println("Inside Constructor");
		
		Salary=val1;
		Name=val2;
		OrgName=val3;
	}

	
	public void Display() {
		
		System.out.println("Name of Emp: " + Name);
		System.out.println("Name of Org: " + OrgName);
		System.out.println("Salary of Emp: " + Salary);
	}
	

}
