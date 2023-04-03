package Unit_1;
import java.util.*;

public class P4_Task_01_GenericMatricMultiplication {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		MatrixMultiplication mm=new MatrixMultiplication();
		int r1,c1,r2,c2;
		System.out.print("Enter first matrix row and column: ");
		r1=in.nextInt();
		c1=in.nextInt();
		System.out.print("Enter second matrix row and column: ");
		r2=in.nextInt();
		c2=in.nextInt();
		mm.matrixMultiplication(r1,c1,r2,c2);
		in.close();
	}

}

class MatrixMultiplication{
	
	void matrixMultiplication(int r1,int c1,int r2,int c2)
	{
		if(c1!=r2)
		{
			System.out.print("Matrix multiplication is not possible.");
		}
		else
		{
			Scanner in=new Scanner(System.in);
			int m1[][]=new int[r1][c1];
			int m2[][]=new int[r2][c2];
			int res[][]=new int[r1][c2];
			System.out.println("Enter element in first matrix");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					m1[i][j]=in.nextInt();
				}
			}
			System.out.println("Enter element in second matrix");
			for(int i=0;i<r2;i++)
			{
				for(int j=0;j<c2;j++)
				{
					m2[i][j]=in.nextInt();
				}
			}
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c2;j++)
				{
					res[i][j]=0;
					for(int k=0;k<c1;k++)
					{
						res[i][j]+=m1[i][k]*m2[k][j];
					}
				}
			}
			System.out.println("Resultant matrix:");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c2;j++)
				{
					System.out.print(res[i][j]+" ");
				}
				System.out.println();
			}
			in.close();
		}
	}
}
