package Collection01;
import java.util.*;

import Throw01.Account;
public class MapDemo1 {

	public static void main(String[] args) {
		// Map 的特性 是 鍵(key) 對應到 值(value)
		// key 不可重複
		// 若是 key 重複，系統會抓取最後一個定義的為主
		HashMap map = new HashMap();
		
		map.put("A", "Apple");
		map.put("U", "Apple");
		map.put("A", "Dog");
		map.put(10, "十元");
		map.put("bank", new Account("22335578",100000));
		
		System.out.println(map.get("A"));
		System.out.println(map.get("U"));
		System.out.println(map.get("B"));
		System.out.println(map.get(10));
		Account ac = (Account) map.get("bank");
		
		System.out.println(ac.bouns);
		System.out.println(ac.number);
		
		
	}
	
	
}
