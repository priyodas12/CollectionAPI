package map.LinkedHashMap;

import java.util.LinkedHashMap;


/*
 * Underlying DataStructure: Hashtable+LinkedList
 * Implements: Cloneable,Serializable
 * Initial Capacity: 11, load-factor=.75
 * Thread safe: NO
 * Duplicate allowed: NO
 * Null Allowed as key or value: No
 * Insertion order: preserve the insertion order.
 * Content type: Heterogeneous
 * Time complexity: Search O(1) ,Insertion O(1) ,Deletion O(1)
 * Space complexity: O(n) 
*/

public class LinkedHashmapImpl {
	
	public static void main(String[] args) {
		
		LinkedHashMap lhm=new LinkedHashMap<Integer,String>();
		
		lhm.put(101,"abc");
		lhm.put(102,"abcd");
		lhm.put(103,"abcdef");
		lhm.put(104,"abcdefg");
		lhm.put(null,"abcde");
		lhm.put(null,"ab");
		lhm.put(105,null);
		lhm.put(106,null);
		
		lhm.entrySet().stream().forEach(x->System.out.println(x));

		
	}

}
