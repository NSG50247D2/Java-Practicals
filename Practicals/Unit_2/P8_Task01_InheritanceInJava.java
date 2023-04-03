package Unit_2;

public class P8_Task01_InheritanceInJava {

	public static void main(String[] args){
		Mammal obj=new Mammal();
		obj.display();
	}
}

class Animal
{
	void display()
	{
		System.out.println("This print is from Animal class");
	}
}

class Mammal extends Animal
{
	
//	display();  error:This method requires a body instead of a semicolon
//	To call a function from child class we need to call it inside a function
	void display2()
	{
		display();
		System.out.println("This print is from Mammal class");
	}
}