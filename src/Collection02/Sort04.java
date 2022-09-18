package Collection02;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort04 {

	public static void main(String[] args) {
		List Student = Arrays.asList(
				new Student3("Chan",25,"中文系"),
				new Student3("Sall",20,"外文系"),
				new Student3("liee",30,"醫學系") );
				
		Collections.sort(Student);
		System.out.println(Student);
		
	}
	
}
class Student3 implements Comparable<Student3>{
	private String name;
	private int number;
	private String dep;
	
	public Student3(String name ,int number,String dep){
		this.name = name ;
		this.number = number;
		this.dep = dep ;
	}
	
	public String toString() {
		return String.format("學生:(%s,%s,%s)",name,number,dep);
	}

	
	//compareTo 會回傳整數
	// 回傳值大於 0 前者 > 後者
	// 回傳值等於 0 前者 = 後者
	// 回傳值小於 0 前者 < 後者
	public int compareTo(Student3 other) {
		int value = this.name.compareTo(other.name); // 字串
		return value;
//		return this.number - other.number; // 整數運算
				// 本身的物件 number 去減 其他物件的 number 來做比較
	}
}
