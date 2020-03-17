package Simple_assignment;
import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		
		int n;
		int f;
		int t;
		System.out.println("Enter the number");
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		input.close();
		t=n;
		while(n!=0)
		{
			
			f=n%10;
			t=(f*10)+f;
			n=n/10;
			
		if(t==n)
		
			System.out.println("The no is Palindrome");
		
	else
		System.out.println("The no is not Palindrome");
		}
}
}