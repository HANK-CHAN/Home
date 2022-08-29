package Collection01;
import java.util.*;
public class StackDemo1 {

	public static void main(String[] args) {
		// 後進先出的方式
		Stack<String> stack = new Stack<>();
		// Stack  放入: push    抓取: pop
		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		//
		
	}
	
}
