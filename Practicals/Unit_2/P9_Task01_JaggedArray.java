package Unit_2;

import java.util.*;

public class P9_Task01_JaggedArray {

	public static void main(String[] args) {
		JaggedArray obj=new JaggedArray();
		obj.jaggedArray();
	}

}

class JaggedArray {
	
	void jaggedArray()
	{
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[3][];
		for (int i = 0; i < 3; i++) {
			System.out.print("Enter size of " + (i + 1) + " row");
			int n;
			n = in.nextInt();
			arr[i] = new int[n];
		}

		for (int i = 0; i < 3; i++) {
			System.out.println("Enter elements in " + (i + 1) + " row");
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = in.nextInt();
			}
		}

		System.out.println("Array output");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		in.close();
	}
}
