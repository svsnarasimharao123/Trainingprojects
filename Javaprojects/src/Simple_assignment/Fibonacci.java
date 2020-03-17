package Simple_assignment;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		
	int i,n;
	int a=0;
	int b=1;
	int c=0;
	Scanner input=new Scanner(System.in);
	n=input.nextInt();
	input.close();
	{
	for( i=0;i<=n;i++)
		
	{
		System.out.println(c);
		a=b;
		b=c;
		c=a+b;
	}
	
	
}
	}}