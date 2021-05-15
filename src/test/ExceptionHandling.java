package test;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int a=10;
			int b=0;
			
			try {
				int result=a/b;
				
			} catch(ArithmeticException e) {
				System.out.println("Arithmetic Exception!");
				
			}
			catch (Exception e) {
				// for all other 
				System.out.println("Exception Handled");
			} finally {
				System.out.println("Try Catch executed successfully");
			}
			
			
			int myarray[] = {2,34,56,78};
			
			try {
				System.out.println("7th Value in Array: " + myarray[6]);
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array Index out of bounds!");
			}
			
			
			
			System.out.println("After error");
			System.out.println("Heloo..looks ok");
		
	}

}
