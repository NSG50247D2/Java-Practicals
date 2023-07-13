package Unit_4_CollectionFramework;

import java.util.ArrayList;
import java.util.List;

/*
 * Don't need to give size of the array at start no index out of bound exception if used properly
 * 
 * Duplicates are allowed
 * Multiple NULL values are allowed
 * Preserve Insertion Order
 */
public class P17_Task_01_ListUsingArrayList {
	public static void main(String []args) {
		//Creating a list
		List<Integer> l1= new ArrayList<Integer>();
		l1.add(0,1); //adds 1 to 0 index
		l1.add(1,2); // adds 2 to index 1
		l1.add(2,2);
		l1.add(3,null);
		l1.add(null);
		System.out.println(l1);
		
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(3);
		l2.add(4);
		l2.add(5);
		System.out.println(l2);
		
//		will add l2 from index 5
		l1.addAll(5,l2);
		System.out.println(l1);
		
//		add 2 at index 5th
		l1.add(5,2);
		System.out.println(l1);
		
//		remove index from l1
		l1.remove(2);
		System.out.println(l1);
		
//		print element at index 3
		System.out.println(l1.get(3));

//		Replace 1st index element with 7
		l1.set(1, 7);
		System.out.println(l1);
				
	}
	
}
