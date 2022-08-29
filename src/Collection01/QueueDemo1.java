package Collection01;
import java.util.*;
public class QueueDemo1 {

	public static void main(String[] arg) {
		// 先進先出法
		Queue q = new LinkedList();
		
		q.offer("Java");
		q.offer("python");
		q.offer("C#");
		
		System.out.println(q.toString());
		
		// poll() 取出不放回
		
		Object o = null;
		while((o = q.poll()) != null) {
			System.out.println((Object)o);
		}	
		System.out.println(q.toString());
		
		
		
	}
	
	
}
