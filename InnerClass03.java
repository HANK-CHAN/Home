package six;

public class InnerClass03 {
	
	static class StaticInner{
		public void AMethod() {
			System.out.println("Static Inner AMethod");
		}
		
		public static void BMethod() {
			System.out.println("Static inner static BMethod");
		}
	}
	
	public void myMethod() {
		System.out.println("InnerClass02 Method");
	}
	

}
