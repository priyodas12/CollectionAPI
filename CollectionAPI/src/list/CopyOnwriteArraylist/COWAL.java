package list.CopyOnwriteArraylist;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class COWAL {

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
