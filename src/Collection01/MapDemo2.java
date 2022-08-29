package Collection01;
import java.util.*;
public class MapDemo2 {

	public static void main(String[] args) {
		// 宣告 key 跟 value 都是字串
		HashMap<String,String> map = new HashMap<>();
		
		System.out.println("HashMap 是否為空" + map.isEmpty());
		
		map.put("Bill", "李員警");
		map.put("Mary", "陳有望");
		map.put("Skill", "林四方");
		
		
		System.out.println("HashMap 是否為空" + map.isEmpty());
		System.out.println("HashMap 的長度" + map.size());
		
		System.out.println("內容物");
		System.out.println(map);
		
		// 找 key 跟 value
		
		System.out.println("Bill 這個 key 是否存在?" + map.containsKey("Bill"));
		System.out.println("林四方這個值是否存在?" + map.containsValue("林四方"));
		
		System.out.println("抓取 key 是 Mary 的 :" + map.get("Mary"));
		
		// HashMap 傳換為 : Set 及 Collection 物件
		
		Set<String> keys = map.keySet();
		Collection<String> values = map.values();		
		
		System.out.println("Keys 的內容: " + keys);
		System.out.println("values 的內容: " + values);
		
		map.remove("Mary");
		
		System.out.println(map);
		
		// 整個清除
		map.clear();
		
		System.out.println(map);
		
		
	}
	
	
}
