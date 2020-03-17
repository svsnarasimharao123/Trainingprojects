package General_Array;

class employee {
	

		
		public int emp_id;
		public String emp_name;
		
		employee(int emp_id,String emp_name)
		{
			this.emp_id=emp_id;
			this.emp_name=emp_name;
		}		
		
			public static void main(String args[]) {
				employee[] employeeArray;
				employeeArray=new employee[6];
				employeeArray[0]=new employee(1,"JOHN");
				employeeArray[1]=new employee(2,"JAMES");
				employeeArray[2]=new employee(3,"JOSEPH");
				employeeArray[3]=new employee(4,"JOYEL");
			    employeeArray[4]=new employee(5,"JEVAN");
		  	    employeeArray[5]=new employee(6,"JoNY");
			
			
		for(int i=0; i < employeeArray.length;i++)
		{
			System.out.println("Element at "+i+":"+employeeArray[i].emp_id+""+employeeArray[i].emp_name);}}
		

		}
		

 



