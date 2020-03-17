package Arraylist_Demo;
import java.util.ArrayList;
public class Clearexam {
	
	
	
		
		
		    public static void main(String[] args)
		    {
		        ArrayList<String> arrayList = new ArrayList<>(); 
		         
		        arrayList.add("ABCD");
		        arrayList.add("CDDVD");
		        arrayList.add("IMAGE");
		        arrayList.add("MOVIE");
		        System.out.println("BEFORE CLEAR\n");
		        System.out.println(arrayList);   
		         
		        arrayList.clear();
		        System.out.println("AFTER CLEAR\n");
		        System.out.println(arrayList);   
		    }
		}



