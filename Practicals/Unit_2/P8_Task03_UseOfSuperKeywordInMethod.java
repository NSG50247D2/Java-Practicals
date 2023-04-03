package Unit_2;

public class P8_Task03_UseOfSuperKeywordInMethod {

	public static void main(String[] args) {
		ABC2 obj= new ABC2();

	}

}

class ABC1
{
	int a;
	ABC1()
	{
		a=1;
		System.out.println("Default constructor ABC1 class.");
	}
}

class ABC2 extends ABC1
{
	int a;
	ABC2()
	{
		super();
		a=1;
		System.out.println("Default constructor ABC1 class.");
	}
	
	void display()
	{
//		error: Constructor call must be the first statement in a constructor
//		super();
		System.out.println("This is method area!");
	}
}
