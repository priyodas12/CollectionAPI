package map.IdentityHashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapImpl {

	public static void main(String[] args) {
		HashMap hm=new HashMap<String,String>();
		hm.put("key1","101");
		hm.put(new String("key1"),"102");
		//will print only one value since put will compare by value
		hm.forEach((k,v)->System.out.println("Key: "+k+" Value: "+v));
		
		IdentityHashMap ihm=new IdentityHashMap<String, String>();
		ihm.put("key1","101");
		ihm.put(new String("key1"),"102");
		//will print both value since put here compare by reference
		ihm.forEach((k,v)->System.out.println("iKey: "+k+" Value: "+v));
	}

}
