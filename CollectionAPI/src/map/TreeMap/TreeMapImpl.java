package map.TreeMap;

import java.util.TreeMap;

/*
 * Underlying DataStructure: Red Black tree
 * Implements: Cloneable,Serializable
 * Initial Capacity: 11, load-factor=.75
 * Thread safe: NO
 * Duplicate key allowed: No
 * Null  allowed as key:No
 * Null Allowed as value: Yes
 * Insertion order: sorted order as mentioned in constructor or natural order of sorting
 * Content type: Heterogeneous
 * Time complexity: Search O(log n) ,Insertion O(log n) ,Deletion O(log n)
 * Space complexity: O(n) 
*/
public class TreeMapImpl {

	public static void main(String[] args) {
		TreeMap t =new TreeMap<Integer,String>();
		
		t.put(109,"abc");
		t.put(101,"abcd");
		t.put(100,"abj");
		t.put(101,"akc");
		t.put(107,"mgc");
		t.put(102,null);
		//t.put(null,"abcfd");

		
		//t.keySet().forEach(x->System.out.println(x));
		
		t.entrySet().forEach(x->System.out.println(x));
	}

}
