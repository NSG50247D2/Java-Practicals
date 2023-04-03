package Unit_2;

public class P8_Task02_ConstructorCallInMLI {

	public static void main(String[] args) {
		C obj=new C();
	}

}

class A
{
	int a;
	A()
	{
		a=2;
		System.out.println("Class A default constructor");
	}
	A(int x)
	{
		a=x;
		System.out.println("Class A parameterized constructor");
	}
	
}

class B extends A
{
	int a;
	B(int x)
	{
//		super();
		super(2);
		a=x;
		System.out.println("Class B parameterized constructor");
	}
}

class C extends B
{
	int a;
	C()
	{
		super(3);
		a=2;
		System.out.println("Class A default constructor");
	}
	C(int x)
	{
		super(4);
		a=x;
		System.out.println("Class A parameterized constructor");
	}
}
