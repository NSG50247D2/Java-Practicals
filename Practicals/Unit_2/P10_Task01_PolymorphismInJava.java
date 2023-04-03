package Unit_2;

public class P10_Task01_PolymorphismInJava {
	public static void main(String []args)
	{
		ABC abc=new ABC();
		System.out.println(abc.add(1, 2));
		System.out.println(abc.add(1,2,3));
		
		CBA cba = new CBA();
		
		System.out.println(cba.add(1, 2));
		System.out.println(cba.add(1, 2, 3));
	}
}

class ABC{
	int add(int n1,int n2)
	{
		return (n1+n2);
	}
	
//	Overloading within the same class
	int add(int n1,int n2,int n3)
	{
		return (n1+n2+n3);
	}
}

class CBA extends ABC{
//	Overriding in child class
	int add(int n1,int n2)
	{
		return (n1+n2+10);
	}
	
	int add(int n1,int n2,int n3)
	{
		return (n1+n2+n3+10);
	}
	
}
