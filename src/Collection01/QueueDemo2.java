package Collection01;
import java.util.*;
public class QueueDemo2 {
	
	public static void main(String[] args) {
		
		Queue<String> q = new LinkedList<>();
		
		q.offer("Orange");
		q.offer("Apple");
		q.offer("Banana");
		q.offer("Cherry");
		
		System.out.println(q);
		
		System.out.println(q.poll()); // 取出不放回
		System.out.println(q.peek()); // 取出放回(不移除)
		System.out.println(q);
		
		// 若要移除  
		System.out.println(q.remove()); // 取出後並刪除
		
		System.out.println("個數:" + q.size());
		System.out.println(q);
		
	}

}
