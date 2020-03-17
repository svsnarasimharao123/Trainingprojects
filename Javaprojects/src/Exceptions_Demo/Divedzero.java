package Exceptions_Demo;

public class Divedzero {
	public static void main(String args[]) {
	
		
		try {
			int i=0;
			int j=8;
			int k=j/i;
			
			System.out.println("the rsult is:"+k);
			
			}
			catch (ArithmeticException e)
			
			{
				System.out.println("Exception thrown :"+e);
			}
			
	finally {
		
	}
	System.out.println("Inside the finally block");

}
}