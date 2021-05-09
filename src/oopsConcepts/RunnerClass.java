package oopsConcepts;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassA Emp1 = new ClassA();
		ClassA Emp2 = new ClassA(200, "SomeTwo", "Org2");
		
		Emp1.Name = "Someone";
		Emp1.Salary = 8888;
		Emp1.OrgName = "Happy Org";
		
		Emp1.Display();
		
		Emp2.Display();
		
		ClassB Emp0 = new ClassB();
		Emp0.Display();

	}

}
