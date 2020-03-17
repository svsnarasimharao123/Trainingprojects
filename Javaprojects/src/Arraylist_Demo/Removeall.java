package Arraylist_Demo;
import java.util.ArrayList;
import java.util.List;
public class Removeall {
	

	

	
		public static void main(String args[]) {
			
			List<Integer> numlist1=new ArrayList<>();
			
			numlist1.add(1);
			numlist1.add(2);
			numlist1.add(3);
			numlist1.add(4);
		
			List<Integer> numlist2=new ArrayList<>();
			
			numlist2.add(5);
			numlist2.add(6);
			numlist2.add(7);
			numlist2.add(5);
		  
			
			numlist1.addAll(numlist2);
			System.out.println("Before Removing\n");
			System.out.println(" "+numlist1);
			System.out.println("");
			System.out.println("After removing\n");
		
			numlist1.removeAll(numlist2);
		
		
			System.out.println(" "+ numlist1);
			System.out.println("\nAdding at index\n");
		numlist1.addAll(2,numlist2);
		System.out.println(numlist1);
		
		
		}
		
		
		

	}


