package ExceptionDemo;

public class Extends03 {
	
	public static void main(String[] args) {
		
		
		try {
//			String msg = args[0];
			
			for (int i = 3 ; i >= -1 ; i--) {
				System.out.println("計算結果:" + 10/i);
			}
		}catch(ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println(e.getMessage());
			
		}
		// 水平捕獲，當例外發生時，要處理的動作一樣時，可以這樣來做
		// 注意: 若例外事件有父子關系時，就不能這樣處理
		
		System.out.println("程式執行完畢");
	}

}
