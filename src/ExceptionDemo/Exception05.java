package ExceptionDemo;

/*
 * Call Stack 機制
 * 
 */
public class Exception05 {
	
		static void A() {
			try {
				System.out.println(10/0);
			}catch(Exception e) {
				System.out.println("A方法處理的");
				System.out.println(e.getMessage());
				
				// 將例外事件丟出去
				throw e;
			}
		}
		static void B() {
			A();
		}
		
		static void C() {
			B();
		}
	
		public static void main(String[] args) {
			try {
				C();
				
			}catch(Exception e){
				
				e.printStackTrace();
			}
			
			System.out.println("程式執行完畢");

			
		}

}
