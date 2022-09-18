package Collection02;

import java.util.*;

public class Sort02 {

	public static void main(String[] args) {
		List Student = Arrays.asList(
				new Student("陳有四",15,"中文系"),
				new Student("紹自一",21,"外文系"),
				new Student("李大方",24,"醫學系") );
				
		Collections.sort(Student);
		System.out.println(Student);
		
	}
	
}
class Student{
	private String name;
	private int number;
	private String dep;
	
	public Student(String name ,int number,String dep){
		this.name = name ;
		this.number = number;
		this.dep = dep ;
	}
	
	public String toString() {
		return String.format("學生:(%s,%s,%s)",name,number,dep);
	}
}