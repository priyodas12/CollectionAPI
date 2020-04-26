package list.Stack;

import java.util.List;
import java.util.Stack;

/*
 * Underlying DataStructure: LIFO
 * Implements: RandomAccess,Cloneable,Serializable
 * Initial Capacity: 0,if not mentioned by constructor.
 * Insertion order: indexed, same as inserted.
 * Time complexity: Access O(n), Search O(n) ,Insertion O(1) ,Deletion O(1)
 * Space complexity: O(n)
 */

public class StackImpl {

	public static void main(String[] args) {
		Stack s=new Stack();
		
		s.push(100);
		s.push('a');
		s.push(true);
		s.push(100.12);
		s.push("abc");
		s.pop();
		System.out.println(s.peek());//last object
		
		s.stream().forEach(x->System.out.print(x+","));

	}

}
