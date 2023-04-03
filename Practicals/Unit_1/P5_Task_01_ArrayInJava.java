package Unit_1;

import java.util.*;
import java.util.Arrays;

public class P5_Task_01_ArrayInJava {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Duplicate du=new Duplicate();
        int n=10;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter "+(i+1)+" element: ");
            arr[i]=in.nextInt();
        }
        du.duplicates(arr,n);
        in.close();
	}

}

class Duplicate{
    void duplicates(int arr[],int n)
    {
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                System.out.println("Duplicate element "+arr[i]+" ");
                while(arr[i+1]==arr[i]){
                    ++i;
                }
            }
        }
    }
}
