package ExceptionDemo;

public class Extends04 {

	public static void main(String[] args) {
		
		try {
//			String msg = "10A";
			String msg = "10";
			int value = Integer.parseInt(msg);
			System.out.println("轉換後的值:" + value);
		
		}catch(Exception e ) {
			System.out.println("例外類別 : "+ e.getClass());
			System.out.println("例外說明 : "+ e.getMessage());
			// 例外原因
			e.printStackTrace();
		}finally {// 一定會被執行，不管是否有例外發生。finally裡面的程式區段一定要執行
			System.out.println("finally 一定會被執行");
			// 若檔案開啟或資料庫連線，可以透過 finally 將其關閉，避免資源占用
		}
		
		System.out.println("程式執行完畢");
	}
	
	
}
