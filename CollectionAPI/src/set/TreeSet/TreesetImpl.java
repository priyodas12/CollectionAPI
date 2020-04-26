package set.TreeSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Underlying DataStructure: Red-black tree
 * Implements: Set,Cloneable,Serializable
 * Initial Capacity: 16, load-factor=.75
 * Thread safe: No
 * Duplicate allowed: NO
 * Null Allowed: No
 * Insertion order: Sorted.
 * Content type: Homogeneous
 * Time complexity: Add O(log n), Contains O(log n) ,Insertion O(log n) ,Deletion O(log n)
 * Space complexity: O(n) 
*/
public class TreesetImpl {

	public static void main(String[] args) {
		
		Set s=new TreeSet();
		
		s.add(100);
		s.add(99);
		s.add(91);
		//s.add(null);
		s.add(120);
		s.add(101);
		s.add(72);
		
		Iterator itr=s.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
