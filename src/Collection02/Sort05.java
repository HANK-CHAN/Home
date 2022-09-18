package Collection02;
import java.util.*;

public class Sort05 {

	public static void main(String[] args) {
		List<String> key = Arrays.asList("Z","B","A","C","H");
		Collections.sort(key,new StringCompare()); // 可帶入自訂的排序字串
		System.out.println(key);
	}
	
}

class StringCompare implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
//		return o1.compareTo(o2);    由小到大排序    正
		return -o1.compareTo(o2);// 由大到小排序    反
		// 前 大 後小 大於0
		// 前 小 後大 小於0
	}
	
}
