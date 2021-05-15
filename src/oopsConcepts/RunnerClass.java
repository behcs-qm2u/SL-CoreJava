package oopsConcepts;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* -- 8May21
		 ClassA Emp1 = new ClassA();
		 
		ClassA Emp2 = new ClassA(200, "SomeTwo", "Org2");
		
		
		Emp1.Name = "Someone";
		Emp1.Salary = 8888;
		Emp1.OrgName = "Happy Org";
		
		Emp1.Display();
		
		Emp2.Display();
		
		ClassB Emp0 = new ClassB();
		Emp0.show();

		ClassC objC = new ClassC();
		objC.show();
		objC.run();
		
		*/
		
		MethodOverloading obj3 = new MethodOverloading();
		
		obj3.add(1, 2);
		obj3.add(1.8, 2.3);
		
		// MethodOverride
		
		MethodOverrideChild obj4 = new MethodOverrideChild();
		
		obj4.display();
		obj4.parentdisp();
		// obj4.show();
		MethodOverrideChild.show();
		
		
		// Abstraction
		
		AbstractChild obj5 = new AbstractChild();
		
		obj5.method1();
		obj5.method2();
		
		
		
		
		
	}

}
