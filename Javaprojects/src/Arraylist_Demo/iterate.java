package Arraylist_Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class iterate {
	public static void main(String args[]) {
		
		ArrayList<String> namesList = new ArrayList<String>(Arrays.asList( "VENKAT", "SIVA", "SAI") );
        
		ListIterator<String> listItr = namesList.listIterator();
		 
		while(listItr.hasNext())
		{
		    System.out.println(listItr.next());
		}
	}

}
