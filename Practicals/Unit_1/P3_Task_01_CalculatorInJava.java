package Unit_1;

public class P3_Task_01_CalculatorInJava {

	public static void main(String[] args) {
		
		Calculator obj=new Calculator();
		System.out.println("Addition "+obj.add(2, 3));
		System.out.println("Subtraction "+obj.minus(10,5));
		System.out.println("Multiplication  "+obj.multi(5, 4));
		System.out.println("Division  "+obj.division(20,5));
		
	}
}

class Calculator {
	
	//Addition
	int add(int a, int b)
	{	
		return (a+b);
	}
	
	//Subtraction
	int minus(int a,int b)
	{
		return (a-b);
	}
	
	//Multiplication
	int multi(int a,int b) {
		return (a*b);
		
	}
	
	//Division
	int division(int a,int b)
	{
		return (a/b);
	}
}