package set.LinkedHashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
/*
 * Underlying DataStructure: Hashtable+ LinkedList
 * Implements: Set,Cloneable,Serializable
 * Initial Capacity: 16, load-factor=.75
 * Thread safe: No
 * Duplicate allowed: NO
 * Null Allowed: 1 time
 * Insertion order: preserved insertion order.
 * Time complexity: Add O(1), Contains O(1) ,Insertion O(1) ,Deletion O(1)
 * Space complexity: O(n) 
*/

public class LinkedhashSetImpl {

	public static void main(String[] args) {
		
		Set s=new LinkedHashSet();
		
		s.add(100);
		s.add('a');
		s.add(true);
		s.add(100.12);
		s.add("abc");
		s.add(true);
		s.add(null);
		
		Iterator itr=s.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
