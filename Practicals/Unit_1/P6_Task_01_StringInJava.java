package Unit_1;
import java.util.*;

public class P6_Task_01_StringInJava {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		Palindrome pd=new Palindrome();
		System.out.print("Enter the string: ");
        String str=in.nextLine();
        pd.display(str);
        in.close();
	}
}

class Palindrome{
    void display(String s)
    {
        int f=1;
        for(int i=0,j=(s.length()-1);i<j;i++,j--)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                f=0;
                System.out.println("No it is not a Palindrome.");
                break;
            }
        }
        if(f==1)
        {
            System.out.println("Yes it is a palindrome");
        }
    }
}