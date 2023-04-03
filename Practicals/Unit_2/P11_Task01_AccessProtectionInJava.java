package Unit_2;

public class P11_Task01_AccessProtectionInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass obj1=new ParentClass();
		System.out.println(obj1.a);   //default
		System.out.println(obj1.b);
		System.out.println(obj1.c);
//		System.out.println(obj1.d);
		
//		ChildClass obj=new ChildClass();
//		obj.showData();
//		obj.accessData();
//		System.out.println(obj.a);   //default
//		System.out.println(obj.b);
//		System.out.println(obj.c);
//		System.out.println(obj.d);
	}

}

class ParentClass{
	int a=10;				//Default Protection 
	public int b=20;		
	protected int c=30;
	private int d=40;
	
	void showData()
	{
		System.out.println("Inside ParentClass");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);
	}
}

class ChildClass extends ParentClass{
	
	void accessData()
	{
		System.out.println("Inside ChildClass");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
//		System.out.println("d = "+d);  // private in parent class can't be accessed here
	}
}