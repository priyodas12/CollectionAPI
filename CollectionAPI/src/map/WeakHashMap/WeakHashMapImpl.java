package map.WeakHashMap;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapImpl {

	public static void main(String[] args) {
		WeakHashMap whm=new WeakHashMap<KeyPoint, Integer>();
		KeyPoint k1=new KeyPoint("101");
		whm.put(k1, 100);
		whm.entrySet().forEach(x->System.out.println(x));
		k1=null;
		System.gc();
		whm.entrySet().forEach(x->System.out.println(x));
		
		
		HashMap hm=new HashMap<KeyPoint, Integer>();
		KeyPoint k2=new KeyPoint("102");
		hm.put(k2, 100);
		hm.entrySet().forEach(x->System.out.println(x));
		k2=null;
		System.gc();
		hm.entrySet().forEach(x->System.out.println(x));
	}

}

