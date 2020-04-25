package list.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListImpl {

	public static void main(String[] args) {
		List l=new LinkedList<Integer>();
		
		
		l.add(100);
		l.add('a');
		l.add(true);
		l.add(100.12);
		l.add("abc");
		
		//add at middle
		l.add(2, 1010);
		
		//Iteration
		l.stream().forEach(a->System.out.print(a+","));
		
		l.remove(2);
		
		l.stream().forEach(a->System.out.print(a+","));
		

	}

}
