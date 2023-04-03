package Unit_2;

public class P9_Task02_CountObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountObjects obj1=new CountObjects();
		CountObjects obj2=new CountObjects();
		CountObjects obj3=new CountObjects();
		CountObjects obj4=new CountObjects();
		CountObjects obj5=new CountObjects();
		System.out.println(CountObjects.count);
	}

}

class CountObjects
{
	static int count;
	
	static {
		count =0;
	}
	
	CountObjects()
	{
		count++;
	}
}
