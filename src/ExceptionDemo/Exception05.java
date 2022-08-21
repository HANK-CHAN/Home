package ExceptionDemo;

public class Exception05 {
	
		static void A() {
			try {
				System.out.println(10/0);
			}catch(Exception e) {
				System.out.println("A方法處理的");
				System.out.println(e.getMessage());
			}
		}
		static void B() {
			A();
		}
		
		static void C() {
			B();
		}
	
	
	
	public static void main(String[] args) {
		C();
		System.out.println("程式執行完畢");
	}
	

}
