package Inheritance;

public class App {
public static void main(String[] args)
{
Machine obj1=new Machine();
	obj1.start();
	obj1.stop();
	
	Car obj2=new Car();
	
	obj2.start();
	obj2.wipewindshield();
	obj2.accelerate();
	obj2.stop();


}
}
