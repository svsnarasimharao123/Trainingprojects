package Arraylist_Demo;

import java.util.ArrayList;

public class Democollect {
public static void main(String args[]) {
	
	ArrayList<String> list=new ArrayList<>();
list.add("Mahesh");
list.add("Mallesh");
list.add("Suresh");
list.add("Vignesh");

ArrayList<String> list1=new ArrayList<>();

list1.add("Mukesh");
list.addAll(list1);
System.out.println(list);


}




}
