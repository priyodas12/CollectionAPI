package list.CopyOnwriteArraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class DuplicateELementInArray {

	public static void main(String[] args) {
		Integer [] a= {9,7,5,10,12,3,5};
		List<Integer> l=Arrays.asList(a);
		CopyOnWriteArrayList<Integer> cowal=new CopyOnWriteArrayList<Integer>();
		for(int i=0;i<l.size();i++) {
			if(!cowal.addIfAbsent(l.get(i))) {
				System.out.println("deplicate element was"+l.get(i));
			}
		}
		
	}

}
