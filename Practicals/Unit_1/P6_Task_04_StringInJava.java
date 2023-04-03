package Unit_1;

import java.util.*;

public class P6_Task_04_StringInJava {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		IntegerToRoman itr = new IntegerToRoman();
		int n;
		System.out.print("Enter number to convert: ");
		n=in.nextInt();
		String res=itr.convert(n);
		System.out.println(res);
		in.close();

	}

}

class IntegerToRoman{
	
	String convert(int n)
	{
		if(n<1 || n>3999)
		{
			Scanner in=new Scanner(System.in);
			System.out.print("Please enter number in range of 1 - 3999: ");
			n=in.nextInt();
			in.close();
			return convert(n);
		}
		String res="";
		String symbols[]= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int range[]= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		for(int i=0;n>0;i++)
		{
			while(n>=range[i])
			{
				res+=symbols[i];
				n=n-range[i];
			}
		}
		return res;
	}
}
