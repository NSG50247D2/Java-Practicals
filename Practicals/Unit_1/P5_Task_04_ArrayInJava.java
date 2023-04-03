package Unit_1;
import java.util.*;
public class P5_Task_04_ArrayInJava {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Second ls=new Second();
        int n;
        System.out.print("Enter size of array: ");
        n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+" element: ");
            arr[i]=in.nextInt();
        }
        int sl=ls.secondLargest(arr,n);
        int ss=ls.secondSmallest(arr,n);
        System.out.println("Second largest element is: "+sl);
        System.out.println("Second smallest element is: "+ss);
        in.close();
	}

}


class Second{
    int secondLargest(int arr[],int n)
    {
        int m1=arr[0],m2=arr[1];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>m1){
                m1=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<m1 && arr[i]>m2){
                m2=arr[i];
            }
        }
        return m2;
    }

    int secondSmallest(int arr[],int n){
        int m1=arr[0],m2=arr[1];
        for(int i=0;i<n;i++)
        {
            if(arr[i]<m1){
                m1=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>m1 && arr[i]<m2){
                m2=arr[i];
            }
        }
        return m2;
    }
}
