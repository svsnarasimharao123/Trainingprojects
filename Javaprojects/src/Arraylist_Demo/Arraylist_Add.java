package Arraylist_Demo;

import java.util.ArrayList;
import java.util.List;

public class Arraylist_Add {
public static void main(String args[]) {
		
		List<String> names=new ArrayList<>();
		
		names.add("venkata");
		names.add("Siva");
		names.add("Sai");
		names.add("Narasimha");
		names.add("Rao");
		
		names.remove(0);
		System.out.println(names);
	}
}
