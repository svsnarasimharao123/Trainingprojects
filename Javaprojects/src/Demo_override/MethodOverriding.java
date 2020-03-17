package Demo_override;

public class MethodOverriding {
	public static void main(String[] args)
	{
		Parent obj1 = new Parent();
		obj1.methodofParentClass();
		
		Parent obj2 = new Child();
		obj2.methodofParentClass();
		
}
}
	class Parent {

		void methodofParentClass()
		{
			System.out.println("Parent's method()");
			
		}
	}
	class Child extends Parent{
		void methodofParentClass()
		{
			System.out.println("Child's method()");
			
		}
	}
	
