package list.Stack;

import java.util.List;
import java.util.Stack;

public class StackImpl {

	public static void main(String[] args) {
		List s=new Stack();
		
		s.add(100);
		s.add('a');
		s.add(true);
		s.add(100.12);
		s.add("abc");
		
		s.stream().forEach(x->System.out.print(x+","));

	}

}
