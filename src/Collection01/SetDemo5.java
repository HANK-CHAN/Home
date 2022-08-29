package Collection01;
import java.util.*;
public class SetDemo5 {

	public static void main(String[] args) {
		
		TreeSet<String> tree = new TreeSet<>();

		tree.add("Car");
		tree.add("Dog");
		tree.add("Cat");
		tree.add("Apple");
		tree.add("Zoo");
		tree.add("Car");
		
		System.out.println(tree);
		
	}
	
}
