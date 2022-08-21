package ExceptionDemo;

public class Exception01 {
	
	public static void main(String[] args) {
		
		int score[] = {100,8,56,87,95};
		try {
			System.out.println(score[1]);
			System.out.print(score[100]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e.getMessage());
			System.out.println("索引值有誤");
		}
		
		System.out.println("程式執行完畢");
		
	}
	

}

/**
 * 在 java 中用來處理錯誤(例外)的類別是Throwable 類別、Error類別、Exception類別
 *
 * Error 及 Exception 類別皆繼承於 Throwable 類別
 * 
 * 當程式發生錯誤時，JVM 處理的方式為將錯誤訊息一層一層得往上傳至 Throwable 類別
 * 只要Throwable 類別，程式就會中斷並顯示其錯誤訊息
 * 
 * Error  : 系統本身發出的錯誤訊息(記憶體不足，硬碟滿了)
 * 
 * Exception : 程式發出的不正常訊息 ， 工程師必須要處理的。
 * 
 */
