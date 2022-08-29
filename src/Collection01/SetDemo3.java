package Collection01;
import java.util.*;
public class SetDemo3 {

	
	public static void main(String[] args) {
		// HashSet 中帶入數字時，在1~15 之間的範圍，數字會排序
		HashSet numbers = new HashSet();
		int num = 0;
		while(numbers.size() != 6) {
			num = (int)(Math.random() * 49 + 1); // 產生亂數 1~49 ，他有可能重複
			numbers.add(num); // 因為number 是 HashSet 不會重複	
				
		}
		
		System.out.println(numbers);
		
		
	}
	
}
