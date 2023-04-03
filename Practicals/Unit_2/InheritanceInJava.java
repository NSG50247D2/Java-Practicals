//extends keyword is used for inheritance in Java
package Unit_2;

public class InheritanceInJava 
{

	public static void main(String[] args)
	{
		Three g = new Three();
		g.methodOne();
		g.methodTwo();
		g.methodOne();
		g.methodThree();
		
		Two two = new Two(1,2,2);
		D obj = new D(2);
		obj.methodFour();
	}

}

class One
{
	int a;
	One()
	{
		System.out.println("One constructor with 1P!");
	}
	One(int y,int z)
	{
		System.out.println("One Constructor with 2P!");
	}
	public void methodOne()
	{
		System.out.println("First Method from class One!");
	}
}

class Two extends One
{
	int b;
	Two(int x,int y,int z)
	{
//		super();
//		super(1,2);
		b = x;
		System.out.println("Two!");
	}
	public void methodTwo()
	{
		 System.out.println("SecondMethod!");
	}
}

class Three extends Two
{
	int c;
	Three()
	{
		super(1,2,3); 
		// error if above is not used: Implicit super constructor Two() is undefined. Must explicitly invoke another constructor
		System.out.println("Constructor Three!");
	}
	Three(int x,int y,int z)
	{
//		super();
		super(x,y,z);
		c = x;
		System.out.println("Three");
	}
	public void methodThree()
	{
		System.out.println("SecondMethod!");
	}
}
//class A
//{
//	int a;
//	A(int a1)
//	{
//		a = a1;
//	}
//	
//	public void methodOne()
//	{
//		System.out.println(a);
//	}
//}
//class B extends A
//{
//	int b;
//	B(int x)
//	{
//		super(10);
//		b = x;
//	}
//	
//	public void methodTwo()
//	{
//		System.out.println(b);
//	}
//}
//class C extends A
//{
//	int c;
//	C(int x)
//	{
//		super(10);
//		c = 10;
//	}
//	
//	public void methodThree()
//	{
//		System.out.println(c);
//	}
//}
//class D extends A
//{
//	int d;
//	D(int d1)
//	{
//		super(d1);
//		d = d1;
//	}
//	
//	public void methodFour()
//	{
//		System.out.println(d);
//	}
//}