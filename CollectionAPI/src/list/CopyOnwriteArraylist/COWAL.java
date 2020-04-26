package list.CopyOnwriteArraylist;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class COWAL {
	/*
	 * Underlying DataStructure: Dynamic array
	 * Implements: RandomAccess,Cloneable,Serializable
	 * Working : CopyOnWriteArrayList creates a Cloned copy of underlying ArrayList, for every update operation at certain point both will be synchronized automatically ,which is taken care by JVM. Therefore there is no effect for threads which are performing read operation.
	 * Initial Capacity: 10 increased capacity:(10*3/2)+1
	 * Thread safe: Yes
	 * Insertion order: indexed, same as inserted.
	 * Time complexity: size, isEmpty, get, set, iterator, and listIterator operations run in constant time O(1),adding n elements requires O(n) time. All of the other operations run in linear time (roughly speaking).
	 * Space complexity: O(n)
	 */


	public static void main(String[] args) {
		
		CopyOnWriteArrayList cowal=new CopyOnWriteArrayList<Integer>();
		cowal.add(10);
		cowal.add(12);
		cowal.add(22);
		cowal.add(32);
		cowal.add(42);
		
		Iterator itr=cowal.iterator();//create snapshot
		while(itr.hasNext()) {
			cowal.add(20);//no concurrent modification error!but 20 will be added 5 times after last element 
			System.out.print(itr.next()+" ");
		}//10 12 22 32 42
		
		for(Object i:cowal) {
			System.out.print(i+" " );//10 12 22 32 42 20 20 20 20 20 
		}
		
	}

}
