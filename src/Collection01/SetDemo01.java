package Collection01;

import java.util.HashSet;
import java.util.Iterator;
import Throw01.Account;

public class SetDemo01 {

	public static void main(String[] args) {
		/*
		 * Hash 雜湊演算法
		 * set 有集合的功能 ， 不可重複，不會依照放入的順序排序
		 */
		
		HashSet set = new HashSet();
		set.add("LCC");
		set.add("Java");
		set.add("python");
		set.add("Apple");
		set.add("LCC"); // 試著放入重複字串
		set.add(new Account("7777558",1000)); // 地址值
		set.add(new Account("6677189",1000)); // 地址值
		set.add(new Integer(100));  // 在JAVA 9+ 會棄用
		set.add(100);
		
		System.out.println(set);
		
		System.out.println();
		Iterator it = set.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
		
	}
	
}
