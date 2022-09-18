package Collection02;
// 排序靜態方法
import static java.util.Comparator.*;
import java.util.*;

public class Sort06 {

	public static void main(String[] args) {
			
		List key = Arrays.asList("Z","F","E","G","A","V","M","null");
		// nullsFirst 接受 Comparator 實作，定義順序上加上 null 值為優先排序
		// 若內容有 null 時，會將 null 自動放到最前面，再進行其他排序
		key.sort(nullsFirst(reverseOrder()));
		//reverseOrder 遞減排序
		System.out.println(key);
	}

	
	
}
