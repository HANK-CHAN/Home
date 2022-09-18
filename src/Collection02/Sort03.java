package Collection02;
import java.util.*;

public class Sort03 {

	public static void main(String[] args) {
		List Student = Arrays.asList(
				new Student2("陳有四",15,"中文系"),
				new Student2("紹自一",21,"外文系"),
				new Student2("李大方",24,"醫學系") );
				
		Collections.sort(Student);
		System.out.println(Student);
		
	}
	
}
class Student2 implements Comparable<Student2>{
	private String name;
	private int number;
	private String dep;
	
	public Student2(String name ,int number,String dep){
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
	public int compareTo(Student2 stu) {
		return this.number - stu.number; // 整數運算
				// 本身的物件 number 去減 其他物件的 number 來做比較
	}
}