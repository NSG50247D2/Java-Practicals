package Unit_1;

import java.util.*;
public class P6_Task_05_StringInJava {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Pangram pm=new Pangram();
		System.out.print("Enter string to check for pangram: ");
		String str=in.nextLine();
		boolean flag=pm.check(str);
		if(flag)
		{
			System.out.print("Given string is pangram");
		}
		else
		{
			System.out.print("Given string is not pangram");
		}
		in.close();
	}

}


class Pangram{
	
	boolean check(String str)
	{
		int alphabet[]= new int[26];
		for(int i=0;i<str.length();i++)
		{
			int idx;
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				idx=str.charAt(i)-65;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				idx=str.charAt(i)-97;
			}
			else {
				continue;
			}
			alphabet[idx]=1;
		}
		for(int i=0;i<26;i++)
		{
			if(alphabet[i]==0)
			{
				return false;
			}
		}
		return true;
	}
}