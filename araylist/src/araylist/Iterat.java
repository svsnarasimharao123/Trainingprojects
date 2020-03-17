package araylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iterat {
	public static void main(String args[]) {
		
	
	ArrayList<Integer> digits = new ArrayList<>(Arrays.asList(1,2,0,4,8,7,2,5));
	{
	Iterator<Integer> iterator = digits.iterator();
	 
	while(iterator.hasNext()) 
	{
	    System.out.println(iterator.next());
	}
	
	
	}
	}
}
