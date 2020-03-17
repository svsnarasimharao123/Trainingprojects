package Strings_Demo;

public class PlayerDetails
{     
	                         
		int age,cent,hcent;
		String name,dob;
		
		PlayerDetails() 
		{
			this.age=23;
			this.name="Narasimha";
			this.cent=5;
			this.hcent=10;
			this.dob="20-12-2000";
			
		}
		PlayerDetails(String n,String b,int a,int c,int h)
		{
			this.age=a;
			this.name=n;
			this.cent=c;
			this.hcent=h;
			this.dob=b;
			
			
		}
		public static void main(String[] args)          
		{                                                                                        //Parameterization constructor//
			PlayerDetails obj1=new PlayerDetails();
			PlayerDetails obj2=new PlayerDetails("Narasimha","20-12-2000",20,5,10); 
			System.out.println(obj1.name+"\n "+obj1.age+" \n"+obj1.cent+"\n "+obj1.hcent+"\n "+obj1.dob);    
		}
		
		}
	