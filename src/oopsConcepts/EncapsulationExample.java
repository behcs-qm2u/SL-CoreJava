package oopsConcepts;

public class EncapsulationExample {
	
	private int salary;
	private String Name;
	private String EmpId;
	
	
	
	// right-click-> Source -> generate 
	public int getSalary() {
		return salary;
	}
	
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmpId() {
		return EmpId;
	}
	public void setEmpId(String empId) {
		EmpId = empId;
	}
	
	

}
