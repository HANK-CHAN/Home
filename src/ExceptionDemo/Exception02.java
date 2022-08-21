package ExceptionDemo;

public class Exception02 {
	
	public static void main(String[] args) {
		// 多重捕捉不同的例外事件，不同的處理方式
		try {
//			String msg = args[0];
			
			for (int i = 3 ; i >= -1 ; i--) {
				System.out.println("計算結果:" + 10/i);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace(); // 發生原因
			System.out.println("索引值錯誤");
			
		}catch(ArithmeticException e) {
			e.printStackTrace(); // 發生原因
			System.out.println("數值有誤，除數不可為 0");
		}
		
		System.out.println("程式執行完畢");
	}
	// 垂直捕獲，子類類別時，子類別一定要在父類別之前
	

}
