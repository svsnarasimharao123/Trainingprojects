package Simple_assignment;
import java.util.Scanner;

public class leapyear {
	
public static void main(String[] args) {
	
int i;
System.out.println("Enter the year");
Scanner sc=new Scanner(System.in);
i=sc.nextInt();
sc.close();


if(i%4==0)
{
	
	if (i%100==0)
	{
		
		if(i%400==0)
		{
			
		
	}}
		
		System.out.println("The Entered Year is LeapYear");


}
else
{
	System.out.println("The Entered Year is  not LeapYear");
}
}}