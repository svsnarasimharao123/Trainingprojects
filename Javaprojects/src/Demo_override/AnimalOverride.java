package Demo_override;

public class AnimalOverride {
	public static void main(String[] args)
	{
		Lion obj1=new Lion();
		obj1.Eating();
		
		Lion obj2=new Tiger();
		obj2.Eating();
		
	}

}
class Lion{
	void Eating() {
		System.out.println("Eats's Animals");
	}
}
class Tiger  extends Lion{
	void Eating() {
		System.out.println("Shows Cruel");
	}
}