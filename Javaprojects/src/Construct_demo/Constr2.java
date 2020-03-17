package Construct_demo;


public class Constr2 
	{

		int age;
		String name;
	 
	 Constr2(String n,int a)
		{
			age=a;
			name=n;
		}
		public static void main(String[] args) 
		{
			 
			 Constr2  obj2=new Constr2 ("https://www.google.co.in/",25);
		
			System.out.println(obj2.name+""+obj2.age);
		}
		
		}



