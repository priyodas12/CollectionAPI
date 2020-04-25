package list.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
		Integer [] a= {2,3,4,5};
		List <Integer> l=new ArrayList<Integer>();
		l=Arrays.asList(a);
		
		System.out.println("to print all element sequentially");
		
		Iterator it=l.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("by java 8");
		l.stream().forEach(System.out::println);
		//or
		//l.stream().forEach(x->System.out.println(x));
		
	}

}
