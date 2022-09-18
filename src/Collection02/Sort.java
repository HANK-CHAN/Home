package Collection02;
import java.util.*;
public class Sort {

	public static void main(String[] args) {
		
		// Vector 是 java 原始集合 ， 特性跟 ArrayList 相同
		// 在執行續上(Tread) 多工
		// 同步維護 tread-safe
		
		Vector v = new Vector();
		
		v.add("Z");
		v.add("L");
		v.add("A");
		v.add("D");
		
		System.out.println("排續前 : " + v.toString());
		
		//Collections 有提供 sort() 方法
		//但它要有索引值才能幫你進行排序。所以
		//Collections.sort() 只接受 List 實作
		
		Collections.sort(v);
		
		System.out.println("排序後 : " + v.toString() );
		
	}
	
	
}
