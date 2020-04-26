package map.HashMap;

import java.util.HashMap;

/*
 * Underlying DataStructure: Hashtable.
 * Implements: Cloneable,Serializable
 * Initial Capacity: 16, load-factor=.75
 * Thread safe: NO
 * Duplicate allowed: Yes
 * Null Allowed as key: 1 time
 * Null Allowed as value: multiple
 * Insertion order: doesn't preserve the insertion order.
 * Content type: Heterogeneous if not generic mentioned.
 * ConcurrentModificationException: will not throw
 * Time complexity: Search O(1) ,Insertion O(1) ,Deletion O(1) worst case O(n)
 * Space complexity: O(n) 
*/
public class HashMapImpl {

	public static void main(String[] args) {
		HashMap hm=new HashMap<Integer,String>();
		
		hm.put(101,"abc");
		hm.put(102,"abcd");
		hm.put(103,"abcdef");
		hm.put(104,"abcdefg");
		hm.put(null,"abcde");
		hm.put(null,"ab");
		hm.put(105,null);
		hm.put(106,null);
		
		//hm.entrySet().stream().forEach(x->System.out.println(x));
		
		//java.util.ConcurrentModificationException
		hm.forEach((k,v)->{
			System.out.println("key: "+k+" value: "+v);
			hm.put(10012, "a1000");
			}
		);

	}

}
