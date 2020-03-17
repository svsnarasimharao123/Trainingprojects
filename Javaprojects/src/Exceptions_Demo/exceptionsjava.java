package Exceptions_Demo;

public class exceptionsjava {
	public static void main(String []args) {
		
		try {
	
		int num[]=new int [10];
		
		System.out.println("Accessing element is"+num[7]);
		
		}
		catch (ArrayIndexOutOfBoundsException e)
		
		{
			System.out.println("Exception thrown :"+e);
		}
		
	System.out.println("Out of the block");
	

}}
