package Arraylist_Demo;
import java.util.ArrayList;
import java.util.List;
public class Removexam {
	


	
	public static void main(String args[]) {
		
		List<String> names=new ArrayList<>();
		names.add("Venkata");
		names.add("Siva");
		names.add("Sai");
		names.add("Narasimha");
		System.out.println(names);
		
		
		System.out.println("\n After REMOVE\n");
		names.remove(2);
		System.out.println(names);
		
	}
	}


