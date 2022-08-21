package six;

public class Inner01 {
	
	
	public static void main(String[] args) {
		
		InnerClass01 in = new InnerClass01();
		in.mainMethod();
		
		// 呼叫內部類別的方法1
		InnerClass01.MyInner im = in.new MyInner();
		im.innerMethod();
		
		// 呼叫內部類別的方法2
		InnerClass01.MyInner im2 = new InnerClass01().new MyInner();
		im2.innerMethod();
		
		// 呼叫內部類別的方法3
		new InnerClass01().new MyInner().innerMethod();
		
		
	}
	 

}
