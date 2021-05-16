package test;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age=15;
		try {
			if (age<18) {
				
				throw new ArithmeticException("not valid age");
				
			
			} else {
				
				System.out.println("Eligble for voting");
			}

		} catch(ArithmeticException e) {
			System.out.println("Exception Handled: "+e.getMessage());
		}
	}

}
