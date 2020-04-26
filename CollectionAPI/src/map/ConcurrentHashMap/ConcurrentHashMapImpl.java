package map.ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

/*
 * Underlying DataStructure: Hashtable.
 * Implements: Cloneable,Serializable
 * Initial Capacity: 16, load-factor=.75
 * Thread safe: Yes,Bucket level lock
 * Duplicate allowed: Yes
 * Null Allowed as key: No
 * Null Allowed as value: No
 * Insertion order: doesn't preserve the insertion order.
 * Content type: Heterogeneous if not generic mentioned.
 * Time complexity: Search O(1) ,Insertion O(1) ,Deletion O(1) worst case O(n)
 * Space complexity: O(n) 
*/

public class ConcurrentHashMapImpl {

	public static void main(String[] args) {
		ConcurrentHashMap chm=new ConcurrentHashMap<Integer, String>();
		
		chm.put(1001, "a1001");
		chm.put(1005, "a1003");
		chm.put(1009, "a1002");
		chm.put(1002, "a1000");
		chm.put(1004, "a1007");
		
		chm.forEach((k,v)->{
			System.out.println("key: "+k+" value: "+v);
			chm.put(10012, "a1000");
			}
		);
		
		

	}

}
