package Unit_4_CollectionFramework;

import java.util.LinkedHashSet;
import java.util.Set;

/*
 * {Set}
 * No Duplicates
 * at most one null element
 * 
 * {LinkedHashSet}
 * Inside, It uses doubly-linked list internally
 * Preserve Insertion Order
 */

public class P17_SetUsingLinkedHashset {

	public static void main(String[] args) {
		//Set Demonstration Using HashSet
		Set<String> hash_set = new LinkedHashSet<String>();
		
		hash_set.add("Sumit");
		hash_set.add("Chauhan");
		hash_set.add("Singh");
		hash_set.add("Set");
		hash_set.add("Sumit");
		hash_set.add("Sumit");
		hash_set.add("Sumit");
		hash_set.add(null);
		hash_set.add(null);
		
		System.out.println(hash_set);
		
		hash_set.remove(null);
		System.out.println(hash_set.isEmpty());
		System.out.println(hash_set);
		
	}

}
