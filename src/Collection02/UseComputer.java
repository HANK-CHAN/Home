package Collection02;

import java.util.Vector;

public class UseComputer {

	public static void main(String[] args) {
	
		Computer<Integer> c1 = new Computer<>();
		
		c1.add(100);
		c1.add(200);
		c1.add(300);
		
		System.out.println(c1.size());
		
		Computer<String> c2 = new Computer<>();
		c2.add("Java");
		c2.add("Apple");
		c2.add("LCC");
		
		System.out.println(c2.size());
		
	}
	
}
