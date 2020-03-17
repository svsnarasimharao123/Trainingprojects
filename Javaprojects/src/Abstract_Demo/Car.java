package Abstract_Demo;

abstract class Car {
 abstract void start();//Abstract method must be implemented in subclass
}
 class Audi extends Car
 {
	void start()
	{
	System.out.println("CTS Training at BLT"); 
	}
	
 }
class BMW extends Car{
	
	void start()
	{
		System.out.println("BMW Car");
	}
}
	
class Drive{
	void drive(Car c) {
		c.start();
	}

}
 
 
 
 
 
 
 
 


