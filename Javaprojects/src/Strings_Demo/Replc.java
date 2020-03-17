package Strings_Demo;

public class Replc {
	public static void main(String args[]) {
//trims the trailing and leading spaces
		String sentance2="  Narasinha has 4 shades  ";
		System.out.println(sentance2.trim());
		
		
		//using replace method 
		System.out.println("Replacing all the 'a' with 'e'");
		String s1="Finaly Naad Explanation indapth";
		 
		//replaces all occurrences of 'e' to 'a'
		String replaceString=s1.replace('a', 'e');
		System.out.println(replaceString);
	}

}
