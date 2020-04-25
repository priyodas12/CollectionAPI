package set.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*	Implements Set Interface.
	Underlying data structure for HashSet is hashtable.
	As it implements the Set Interface, duplicate values are not allowed.
	Objects that you insert in HashSet are not guaranteed to be inserted in same order. Objects are inserted based on their hash code.
	NULL elements are allowed in HashSet.
	HashSet also implements Searlizable and Cloneable interfaces.
*/
public class HashsetImpl {

	public static void main(String[] args) {
		Set s=new HashSet();
		
		s.add(100);
		s.add('a');
		s.add(true);
		s.add(100.12);
		s.add("abc");
		s.add(true);
		s.add(null);
		
		//s.stream().forEach(x->System.out.print(x+","));
		
		Iterator itr=s.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
