package Unit_1;

import java.util.*;

public class P5_Task_02_ArrayInJava {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LeftRotation lr=new LeftRotation();
        int arr[]=new int[10];
        for(int i=0;i<10;i++)
        {
             System.out.print("Enter "+(i+1)+" element: ");
             arr[i]=in.nextInt();
        }
        lr.rotateLeft(arr);
        for(int i=0;i<10;i++)
        {
            System.out.print(arr[i]+" ");
        }
        in.close();
	}

}

class LeftRotation{
    void rotateLeft(int arr[])
    {
        for(int i=0;i<2;i++)
        {
            int t=arr[0],j;
            for(j=0;j<9;j++)
            {
                arr[j]=arr[j+1];
            }
            arr[j]=t;
        }
    }
}
