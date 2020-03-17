package Exceptions_Demo;
import java.util.Scanner;
public class Example {
public static void main(String []args) {
	
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the no:");
	
	int a;
	try {
			 a=scn.nextInt();		
		}
		catch (Exception e)
		
		{
			System.out.println("Invalid number!");
			
			a=0;
		}
	System.out.println("the value of a:"+a);
}
}
