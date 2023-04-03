package Assignment;

import java.text.SimpleDateFormat;
import java.util.*;

public class Assignment_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Palindrome pd=new Palindrome();
//        String str;
//        str=in.nextLine();
//        pd.display(str);
//        ------------------------------------------------------------------------------------------
//        Compare co=new Compare();
//        String s1,s2;
//        s1=in.nextLine();
//        s2=in.nextLine();
//        co.compare(s1,s2);
//        --------------------------------------------------------------------------------------------
//        Duplicate du=new Duplicate();
//        int n=10;
//        int arr[]=new int[n];
//        for(int i=0;i<n;i++)
//        {
//            System.out.print("Enter "+(i+1)+" element: ");
//            arr[i]=in.nextInt();
//        }
//        du.duplicates(arr,n);
//        --------------------------------------------------------------------------------------------
//           LeftRotation lr=new LeftRotation();
//           int n=10,k=2;
//           int arr[]=new int[n];
//           for(int i=0;i<n;i++)
//           {
//                System.out.print("Enter "+(i+1)+" element: ");
//                arr[i]=in.nextInt();
//           }
//           lr.rotateLeft(arr,n,k);
//           for(int i=0;i<n;i++)
//           {
//               System.out.print(arr[i]+" ");
//           }
//        ------------------------------------------------------------------------------------------
//        RemoveElement re=new RemoveElement();
//        System.out.print("Enter size of array: ");
//        int n=in.nextInt();
//        int arr[]=new int[n];
//        for(int i=0;i<n;i++)
//        {
//            System.out.print("Enter "+(i+1)+" element: ");
//            arr[i]=in.nextInt();
//        }
//        System.out.print("Enter key to be delete: ");
//        int key=in.nextInt();
//        re.remove(arr,n,key);
//        for(int i=0;i<n;i++)
//        {
//            System.out.print(arr[i]+" ");
//        }
//        ------------------------------------------------------------------------------------------
//        Second ls=new Second();
//        int n=10;
//        int arr[]=new int[n];
//        for(int i=0;i<n;i++){
//            System.out.print("Enter "+(i+1)+" element: ");
//            arr[i]=in.nextInt();
//        }
//        int sl=ls.secondLargest(arr,n);
//        int ss=ls.secondSmallest(arr,n);
//        System.out.println("Second largest element is: "+sl);
//        System.out.println("Second smallest element is: "+ss);
//        --------------------------------------------------------------------------------------------
//        InsertSpecific is=new InsertSpecific();
//        int n=10;
//        int ni=4;
//        int key=5;
//        int arr[]=new int[n];
//        for(int i=0;i<n;i++)
//        {
//            System.out.print("Enter "+(i+1)+" element: ");
//            arr[i]=in.nextInt();
//        }
//        int arr2[]=is.insert(arr,n,ni,key);
//        for(int i=0;i<=n;i++)
//        {
//            System.out.print(arr2[i]+" ");
//        }
//        -------------------------------------------------------------------------------------------
        SwitchCase sc=new SwitchCase();
        int ch;
        System.out.print("Enter your choice\n 1.Current Year, 2. Current Month, 3. Current Date: ");
        ch=in.nextInt();
        sc.display(ch);
        
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

//class Duplicate{
//    void duplicates(int arr[],int n)
//    {
//        Arrays.sort(arr);
//        for(int i=0;i<n-1;i++)
//        {
//            if(arr[i]==arr[i+1])
//            {
//                System.out.println(arr[i]+" ");
//                while(arr[i+1]==arr[i]){
//                    ++i;
//                }
//            }
//        }
//    }
//}

//class LeftRotation{
//    void rotateLeft(int arr[],int n,int k)
//    {
//        for(int i=0;i<k;i++)
//        {
//            int t=arr[0],j;
//            for(j=0;j<n-1;j++)
//            {
//                arr[j]=arr[j+1];
//            }
//            arr[j]=t;
//        }
//    }
//}

//class RemoveElement{
//    void remove(int arr[],int n,int key)
//    {
//        int f=0;
//        for(int i=0;i<n;i++)
//        {
//            if(arr[i]==key)
//            {
//                int j;
//                f=1;
//                for(j=i;j<n-1;j++)
//                {
//                    arr[j]=arr[j+1];
//                }
//                arr[j]=0;
//            }
//            if(f==1)
//            {
//                break;
//            }
//        }
//        if(f==0)
//        {
//            System.out.println(key+" is not present ");
//        }
//    }
//}

//class Second{
//    int secondLargest(int arr[],int n)
//    {
//        int m1=arr[0],m2=arr[1];
//        for(int i=0;i<n;i++)
//        {
//            if(arr[i]>m1){
//                m1=arr[i];
//            }
//        }
//        for(int i=0;i<n;i++){
//            if(arr[i]<m1 && arr[i]>m2){
//                m2=arr[i];
//            }
//        }
//        return m2;
//    }
//
//    int secondSmallest(int arr[],int n){
//        int m1=arr[0],m2=arr[1];
//        for(int i=0;i<n;i++)
//        {
//            if(arr[i]<m1){
//                m1=arr[i];
//            }
//        }
//        for(int i=0;i<n;i++){
//            if(arr[i]>m1 && arr[i]<m2){
//                m2=arr[i];
//            }
//        }
//        return m2;
//    }
//}

//class InsertSpecific{
//    int []insert(int arr[],int n,int ni,int key)
//    {
//        int arr2[]=Arrays.copyOf(arr,n+1);
//        for(int i=0,j=0;i<=n;i++)
//        {
//            if(i==ni)
//            {
//                arr2[i]=key;
//                for(int k=i+1;k<n+1;k++)
//                {
//                    arr2[k]=arr[i];
//                    i++;
//                }
//            }
//            else{
//                arr2[i]=arr[j];
//                j++;
//            }
//
//        }
//        return arr2;
//    }
//}

//class SwitchCase{
//
//    void display(int ch)
//    {
//        switch(ch)
//        {
//            case 1: Date curr_yr=new Date();
//                SimpleDateFormat sdf=new SimpleDateFormat("YYYY");
//                System.out.println("Year "+sdf.format(curr_yr));
//                break;
//            case 2: Date curr_m=new Date();
//                sdf=new SimpleDateFormat("MM");
//                System.out.println("Month "+sdf.format(curr_m));
//                break;
//            case 3: Date curr_day=new Date();
//                sdf=new SimpleDateFormat("dd");
//                System.out.println("Day "+sdf.format(curr_day));
//                break;
//            case 4:
//                System.out.println("Not Applicable");
//                break;
//            default:
//                System.out.println("Invalid argument");
//        }
//    }
//}