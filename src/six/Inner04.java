package six;

public class Inner04 {
	
	
	public static void main(String[] args) {
		
		Flying f = new Flying(){
			public void fly() {
				System.out.println("實作 fly");
			}
			
			public void go() {
				System.out.println("實作 gO");
			}
		};
		
		f.fly();
		f.go();
		
		Object O =new Object();
		System.out.println(O.toString());
		
		Object O2 = new Object() {
			public String toString() {
				return "我要改寫物件中的方法";
			}
		};
		
		System.out.println(O2.toString());
	}
	 

}
