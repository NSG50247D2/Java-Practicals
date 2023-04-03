package Unit_1;

public class P2_Task02_ConstantsInJava {
	protected static final double PRICE=233.90;
	public static final double PRICE2=234.90;
	
	public static void main(String[] args) {
		final int a=10;
//		The final local variable a cannot be assigned. It must be blank and not using a compound assignment
		a=11;
		
		System.out.println(PRICE);
		
//		The final field P2_Task02_ConstantsInJava.PRICE cannot be assigned
		PRICE=12.34;
	}
}
