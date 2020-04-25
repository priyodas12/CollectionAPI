package list.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingInArrayList {

	public static void main(String[] args) {
		Integer [] a= {12,3,14,52,31};
		List <Integer> l=new ArrayList<Integer>();
		l=Arrays.asList(a);
		System.out.println("Ascending order");
		Collections.sort(l);
		l.stream().forEach(System.out::println);
		System.out.println("Descending order");
		Collections.sort(l, Collections.reverseOrder());
		l.stream().forEach(System.out::println);
	}

}
