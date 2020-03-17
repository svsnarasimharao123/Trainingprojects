package Strings_Demo;

public class PersonDetails 
{

	int age;
	String name;
	PersonDetails() 
	{
		this.age=23;
		this.name="Narasimha";
		
	}
	PersonDetails(String n,int a)
	{
		this.age=a;
		this.name=n;
	}
	public static void main(String[] args) 
	{
		PersonDetails obj1=new PersonDetails();
		PersonDetails obj2=new PersonDetails("Narasimha",25);
		System.out.println(obj1.name+""+obj1.age);
		System.out.println(obj2.name+""+obj2.age);
	}
	
	}

