package list.ArrayList;

import java.util.ArrayList;
import java.util.List;

/*
 * Underlying DataStructure: Dynamic array
 * Implements: RandomAccess,Cloneable,Serializable
 * Initial Capacity: 10 increased capacity:(10*3/2)+1
 * Insertion order: indexed, same as inserted.
 * Time complexity: size, isEmpty, get, set, iterator, and listIterator  O(1),adding ,removing n elements O(n) time. All of the other operations run in linear time (roughly speaking).
 * Space complexity: O(n)
 */

public class ArrayListImpl {

	public static void main(String[] args) {
		List l=new ArrayList<Integer>();
		l.add(10);
		l.add(21);
		l.add(23);
		l.add(32);
		
		l.remove(2);
		
		l.stream().forEach(x->System.out.println(x));

	}

}
