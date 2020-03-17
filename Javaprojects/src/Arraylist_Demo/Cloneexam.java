package Arraylist_Demo;
import java.util.ArrayList;
public class Cloneexam {


	
	 
	    @SuppressWarnings("unchecked")
		public static void main(String[] args) 
	    {
	    
	        ArrayList<String> arrayListObject = new ArrayList<>(); 
	         
	        arrayListObject.add("CTS");
	        arrayListObject.add("SELENIUM");
	        arrayListObject.add("TESTING");
	        arrayListObject.add("BATCH");
	         
	        System.out.println(arrayListObject);   
	         
	        ArrayList<String> arrayListClone =(ArrayList<String>) arrayListObject.clone();
	         
	        System.out.println(arrayListClone);   
	    }
	}


