package Collection01;
import java.util.*;
public class Sort {

	public static void main(String[] args) {
		
		/*
		 * 一般在收集物件後 ， 會對物件進行排序是一個很常見的動作
		 * java.util.Collections 有提供 sort 方法，但必須要有索引才能進行排序
		 * 故 Collections 的 sort() 方法接受 List 實作物件
		 */
		
		List numbers = Arrays.asList(100,45,77,82,93,5,83,64,11);
		Collections.sort(numbers);
		System.out.println(numbers);
		
		
	}
	
	
}
