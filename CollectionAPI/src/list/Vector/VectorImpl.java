package list.Vector;

import java.util.List;
import java.util.Vector;
/*
 * Underlying DataStructure: growable array
 * Implements: RandomAccess,Cloneable,Serializable
 * Initial Capacity: 10, incresed size 10*2=20.
 * Thread safe: Yes
 * Insertion order: indexed, same as inserted.
 * Time complexity: Access O(1), Search O(1) ,Insertion O(n) ,Deletion O(n)
 * Space complexity: O(n)
 */
public class VectorImpl {

	public static void main(String[] args) {
		Vector v=new Vector();
		
		v.add(100);
		v.add('a');
		v.add(true);
		v.add(100.12);
		v.add("abc");
		
		v.stream().forEach(x->System.out.print(x+","));
		
	}

}
