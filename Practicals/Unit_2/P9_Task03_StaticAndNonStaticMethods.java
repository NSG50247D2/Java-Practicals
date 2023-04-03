package Unit_2;

public class P9_Task03_StaticAndNonStaticMethods {
	
	static void display1()
	{
		System.out.println("Static method display function!");
	}
	
	void display2()
	{
		System.out.println("Non-static method display function!");
	}
	
	public static void main(String[] args)
	{
//		Only static method can be called inside a static method
		display1();
		
//		error: Cannot make a static reference to the non-static method display2() from the type P9_Task03_StaticAndNonStaticMethods
//		display2();
	}
}
