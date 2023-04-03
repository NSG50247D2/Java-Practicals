package Unit_1;

import java.util.*;
public class P6_Task_03_StringInJava {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str;
		System.out.print("Enter string: ");
		str=in.nextLine();
		ReverseAll ra = new ReverseAll();
		str=ra.reverseAll(str);
		System.out.print("Reversed string(words): ");
		System.out.print(str);
		in.close();
	}

}

class ReverseAll{
	
	String reverseAll(String str)
	{
		String s[];
		s=str.split(" ");
		String res="";
		for(int i=s.length-1;i>=0;i--)
		{
			res+=s[i];
			if(i!=0)
			{
				res+=" ";
			}
		}
		return res;
	}
}
