package list.CopyOnwriteArraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExacptionImpl {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		
		Iterator itr=l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			l.add(80);
		}
	}

}
