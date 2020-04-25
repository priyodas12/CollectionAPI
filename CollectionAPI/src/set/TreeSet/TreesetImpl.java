package set.TreeSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*	TreeSet implements the SortedSet interface so duplicate values are not allowed.
	Objects in a TreeSet are stored in a sorted and ascending order.
	TreeSet does not preserve the insertion order of elements but elements are sorted by keys.
	TreeSet does not allow to insert Heterogeneous objects. It will throw classCastException at Runtime if trying to add hetrogeneous objects.
	TreeSet serves as an excellent choice for storing large amounts of sorted information which are supposed to be accessed quickly because of its faster access and retrieval time.
	TreeSet is basically implementation of a self-balancing binary search tree like Red-Black Tree. 
	Therefore operations like add, remove and search take O(Log n) time. And operations like printing n elements in sorted order takes O(n) time.
*/

public class TreesetImpl {

	public static void main(String[] args) {
		
		Set s=new TreeSet();
		
		s.add(100);
		s.add(99);
		s.add(91);
		s.add(100);
		s.add(120);
		s.add(101);
		s.add(72);
		
		Iterator itr=s.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
