package Operators;
import java.util.Scanner;

public class Operators {

	public static void main(String[] args)
	{
		int num;
		System.out.println("Enter the no");
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
		input.close();
		System.out.println("The number of ones in: "+num+"("+Integer.toBinaryString(num)+")");
		int result=countOne(num);
		System.out.println("is :"+result);
		input.close();
		
	}
	
static int countOne(int n) {
	int count=0;
	while(n>0) {
		n=n&(n-1);
		count++;	
	}
	return count;
}

	
	
}
