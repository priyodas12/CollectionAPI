package list.ArrayList;

import java.util.List;
import java.util.ArrayList;

public class TwoDimensionalArrayList {

	public static void main(String[] args) {
		List<ArrayList<Integer>> listOfList=new ArrayList<ArrayList<Integer>>();
		ArrayList a1=new ArrayList();
		a1.add(12);a1.add(22);a1.add(32);
		ArrayList a2=new ArrayList();
		a2.add(112);a2.add(212);a2.add(312);
		listOfList.add(a1);
		listOfList.add(a2);
		
		System.out.println(listOfList);
		
	}

}
