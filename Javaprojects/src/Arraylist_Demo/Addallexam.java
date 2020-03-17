package Arraylist_Demo;
import java.util.ArrayList;
import java.util.List;
public class Addallexam {
	

	
	
		public static void main(String args[]) {
			
			List<String> Chennai=new ArrayList<>();
			Chennai.add("OMR ROAD");
			Chennai.add("ASV");
			Chennai.add("SIPCON");
			Chennai.add("NAVULUR");
			
			List<String> Andhra=new ArrayList<>();
			Andhra.add("VIJAYWADA");
			Andhra.add("VIZAG");
			
			Chennai.addAll(Andhra);
			
			System.out.println(Chennai);
			
		}

	}



