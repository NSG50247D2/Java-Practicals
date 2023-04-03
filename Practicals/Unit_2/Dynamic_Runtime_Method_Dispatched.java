package Unit_2;

public class Dynamic_Runtime_Method_Dispatched {

	public static void main(String[] args) {
		// m1 of B11 will be called
		B11 o1 = new B11();
		o1.m1();
//		m1 of A11 will be called 
		A11 o2 = new A11();
		o2.m1();
		
//		m1 of B11 is called
		A11 o3 = new B11();
		o3.m1();
		
		
		/*
		 * While creating an object if we are using parent class as a reference object and child class as actual object then at compile time the overridden method  call can't be resolved as compiler would find two methods having the same signature. It is the responsibility of dynamic method dispatch to figure out which method will be called at runtime. This approach is also called run time polymorphism. 
		 */
	}

}

class A11{
	
	void m1()
	{
		System.out.println("Inside M1 of A11");
	}
}


class B11 extends A11{
	
	void m1()
	{
		System.out.println("Inside M1 of B11");
	}
}

