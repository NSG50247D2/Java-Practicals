package Unit_1;

import java.util.Arrays;
import java.util.*;

public class P5_Task_05_ArrayInJava {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		InsertSpecific is=new InsertSpecific();
		System.out.print("Enter array size: ");
        int n=in.nextInt();
        int ni,key;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter "+(i+1)+" element: ");
            arr[i]=in.nextInt();
        }
        System.out.print("Enter index and element to add in array: ");
        ni=in.nextInt();
        key=in.nextInt();
        int arr2[]=is.insert(arr,n,ni,key);
        for(int i=0;i<=n;i++)
        {
            System.out.print(arr2[i]+" ");
        }
        in.close();
	}

}

class InsertSpecific{
    int []insert(int arr[],int n,int ni,int key)
    {
        int arr2[]=Arrays.copyOf(arr,n+1);
        for(int i=0,j=0;i<=n;i++)
        {
            if(i==ni)
            {
                arr2[i]=key;
                for(int k=i+1;k<n+1;k++)
                {
                    arr2[k]=arr[i];
                    i++;
                }
            }
            else{
                arr2[i]=arr[j];
                j++;
            }

        }
        return arr2;
    }
}

