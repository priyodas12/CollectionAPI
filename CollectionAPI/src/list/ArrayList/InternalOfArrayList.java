package list.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class InternalOfArrayList {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(new Integer(20));
		l.add(new Integer(21));
		l.add(new Integer(22));
		l.add(new Integer(23));
		System.out.println(l.contains(24));
		System.out.println(l.parallelStream().toArray());

	}

}
