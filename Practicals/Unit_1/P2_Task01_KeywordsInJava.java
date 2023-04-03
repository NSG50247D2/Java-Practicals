package Unit_1;

/*keywords can't be used as functions
 * keywords can't be used as objects
 * keywords can't be used as variable name
 * keywords can't be used as class
 * never make function inside the function
 */

public class P2_Task01_KeywordsInJava {

	public static void main(String [] args) {
		
		// Function name can not be a keyword 
		void double()
		{
			System.out.println("Function name can not be a keyword!");
		}
		
		// Object of a class can not be a keyword
		ABC int = new ABC();
		
		// Variable name can not be a keyword
		int float = 5;
		
		// Never make a function inside a function
		void func1()
		{
			void func2()
			{
				System.out.println("This is function 2!");
			}
		}
		
	}

}

// Class name can not be a keyword
class new{
	void display()
	{
		System.out.println("Java");
	}
}

class ABC{
	void display()
	{
		System.out.println("Hello");
	}
}