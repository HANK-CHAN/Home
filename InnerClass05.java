package six;

// 內部方法類別的變數存取
class MethodInnerClass {

	void  showData() {
		// 在方法中所定義的變數。只要被 方法內部內類別要存取時。
		// 在內部類別就會將它設定為 final
		int x = 99;
		final int fx = 66;
		class MyData{
			int y = 10;
			void show() {
				// 在方法內部類別存取方法內的變數，預設都是 final 
				// x = 100 ; 類型 final 不能修改
				System.out.println(y);
				y = 199 ;
				System.out.println(y);
				System.out.println("區域變數x="+x);
				System.out.println("final的fx="+ fx);
			}
		}
//		x = 100;
//		System.out.println(x);
		MyData md = new MyData();
		md.show();
	}
	
		
}

public class InnerClass05 {

public static void main(String[] args) {
	new MethodInnerClass().showData();
}



}



