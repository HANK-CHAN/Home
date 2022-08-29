package Collection01;

import java.util.*;

public class SetDemo2 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		String name1 = "Tom";
		String name2 = "Mary";
		
		System.out.println("目前的 HashSet是否為空:" + set.isEmpty()); // boolean
		System.out.println("目前 HashSet 長度為:" + set.size());// int
		
		set.add(name1);
		set.add(name2);
		set.add("Mary");
		set.add("Bill");
		set.add(1);
		
		System.out.println("目前的 HashSet是否為空:" + set.isEmpty()); // boolean
		System.out.println("目前 HashSet 長度為:" + set.size());// int
		
		System.out.println("內容物有");
		System.out.println(set);
		
		// 找指定的值是否有在裡面
		
		System.out.println("Tom 有在 HashSet 裡面嗎?" + set.contains("Tom"));
		System.out.println("Mary 有在 HashSet 裡面嗎?" + set.contains("Mary"));
		
		// 移除物件
		set.remove(name2);
		
		// 清除所有物件
		set.clear();
		
		System.out.println("內容物有");
		System.out.println(set);
		
	}

}
