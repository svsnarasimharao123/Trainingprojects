package Operators;
import java.util.Scanner;
public class Logicalop {
	public static void main(String[] args) {
		
		String username="SVSS";
		String password="SVSS123";
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter username");
		String usid=obj.nextLine();
		System.out.println("Enter password");
		String uspw=obj.nextLine();
		obj.close();
		
		
	if((usid.equals(username))&&(uspw.equals(password)))
			{
		System.out.println("Welocme to Account");
			}
	else
	{
		System.out.println("Wrong ID or PW");
	}
	}
	
}
	
	


