package list.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {
		Integer [] arr=new Integer[]{1,2,3,4,5,6};
		
		//convert to ArrayList
		List<Integer> list=new ArrayList<Integer>();
		
		list=Arrays.asList(arr);
		
		//check list type
		System.out.println(list instanceof List);
		
		Object [] arr2=new Integer[list.size()];
		
		//convert to array type
		arr2=list.toArray(arr2);
		
		//check array type
		System.out.println(arr2.getClass().isArray());
		
		System.out.println(Arrays.toString(arr2));
		
	}

}
