package list.Vector;

import java.util.List;
import java.util.Vector;

public class VectorImpl {

	public static void main(String[] args) {
		Vector v=new Vector();
		
		v.add(100);
		v.add('a');
		v.add(true);
		v.add(100.12);
		v.add("abc");
		
		v.stream().forEach(x->System.out.print(x+","));
		
	}

}
