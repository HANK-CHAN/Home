package Collection02;

import java.util.*;
public class CustomSet2 {

	public static void main(String[] args) {
		
		Vector<String> v1 = new Vector<>();
		v1.add("LCC");
		v1.add("Java");
		v1.add("Apple");
		
		Vector<Integer> v2 = new Vector<>();
		v2.add(100);
		v2.add(300);
		v2.add(500);
		
		Vector<Float> v3 = new Vector<>();
		v3.add(1.5f);
		v3.add(3.6f);
		v3.add(5.9f);
		
		printVector(v1);
		printVector(v2);
		printVector(v3);
		
		System.out.println("v2總和: " + sum(v2));
		System.out.println("v3總和: " + sum(v3));
//		System.out.println("v1總和: " + sum(v1)); 錯誤
	}
	
	// 泛型中 ? 表示接受任何型態的資料
	public static void printVector(Vector<?> v) {
		
		Iterator<?> it = v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next() + ",");
		}
		System.out.println();
	}
	
	// 限制型態
	public static<N extends Number> int sum(Vector<N> v) {
		int total = 0;
		Iterator<N> it = v.iterator();
		while(it.hasNext()) {
			total += it.next().intValue();
		}
		return total;
	}
	
}
