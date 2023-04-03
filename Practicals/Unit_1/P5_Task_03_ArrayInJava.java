package Unit_1;

import java.util.*;

public class P5_Task_03_ArrayInJava {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		RemoveElement re=new RemoveElement();
        System.out.print("Enter size of array: ");
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter "+(i+1)+" element: ");
            arr[i]=in.nextInt();
        }
        System.out.print("Enter key to be delete: ");
        int key=in.nextInt();
        re.remove(arr,n,key);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
		in.close();

	}

}

class RemoveElement{
    void remove(int arr[],int n,int key)
    {
        int f=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==key)
            {
                int j;
                f=1;
                for(j=i;j<n-1;j++)
                {
                    arr[j]=arr[j+1];
                }
                arr[j]=0;
            }
            if(f==1)
            {
                break;
            }
        }
        if(f==0)
        {
            System.out.println(key+" is not present ");
        }
    }
}
