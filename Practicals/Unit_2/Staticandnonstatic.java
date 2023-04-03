package Unit_2;

public class Staticandnonstatic {

	public static void main(String[] args) {
		ABCD obj = new ABCD();
		System.out.println(obj.a);
		
//		static variable access
		System.out.println(ABCD.b);
		
//		static variable access
		obj.m2(); // The static method m2() from the type ABCD shoud be accessed in a static i way
		ABCD.m2();
		
//		non-static method access
		obj.m1();
	}

}


class ABCD{
	int a =11;   // instance variable
	static int b;  // class variable
	
	//static block used to give values to a static variable according to a condition
	static {
		b=12;
	}

	void m1()
	{
		System.out.println(a+b);
	}
	
	static void m2()
	{
		System.out.println(b);
	}
}