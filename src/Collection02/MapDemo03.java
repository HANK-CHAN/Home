package Collection02;

import java.util.TreeMap;

public class MapDemo03 {

	public static void main(String[] args) {
		
		// 排序 ，因為要排序，所以 key 的形態要統一
		TreeMap map = new TreeMap();
		
		map.put("Z", "Zoo");
		map.put("A", "Apple");
		map.put("C", "Car");
		map.put("B", "Banana");
//		map.put(100, "LCC");  型態還前面不一樣，會出錯
		
		System.out.println(map);
		
		
	}
	
	
	
}
