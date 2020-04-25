package set.LinkedHashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
/*
 * Contains unique elements only like HashSet. 
 * It extends HashSet class and implements Set interface.Maintains insertion order.
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
