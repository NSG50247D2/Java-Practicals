package Unit_1;

import java.util.*;

public class P6_Task_02_StringInJava {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
        Compare co=new Compare();
        String s1,s2;
        System.out.print("Enter first string: ");
        s1=in.nextLine();
        System.out.print("Enter second string: ");
        s2=in.nextLine();
        co.compare(s1,s2);
        in.close();
	}

}


class Compare{
    void compare(String s1,String s2)
    {
        System.out.println("Using equals() function");
        if(s1.equals(s2)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
        System.out.println("Using compare to function");
        int n=s1.compareTo(s2);
        if(n==0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
}
