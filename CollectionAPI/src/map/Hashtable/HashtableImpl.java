package map.Hashtable;

import java.util.Hashtable;

/*
 * Underlying DataStructure: contains buckets in which it stores the key/value pairs.
 * Implements: Cloneable,Serializable
 * Initial Capacity: 11, load-factor=.75
 * Thread safe: Yes
 * Duplicate allowed: NO
 * Null Allowed: No
 * Insertion order: doesn't preserve the insertion order.
 * Content type: Heterogeneous
 * Time complexity: Search O(1) ,Insertion O(1) ,Deletion O(1)
 * Space complexity: O(n) 
*/

public class HashtableImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable hs=new Hashtable();
		
		hs.put(1, "a");
		hs.put(2, "b");
		hs.put(3, "c");
		hs.put(4, "d");
		
		for(Object i:hs.keySet()) {
			System.out.println(i+" => "+hs.get(i));
		}
		
	}

}
