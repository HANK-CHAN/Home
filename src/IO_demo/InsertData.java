package IO_demo;
import java.sql.*;
public class InsertData {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/javademo";
//		String user = "root"; // 這式mysql最高權限
		String user = "javauser";
		String password = "123456"; // 登入密碼
		
		try(Connection conn = DriverManager.getConnection(url,user,password) ) {
			
			if(conn != null && !conn.isClosed()) {
				// 執行sql語句時，需取得 Statement 實作物件，它式sql陳述的代表物件
				Statement stmt = conn.createStatement();
				String sql = "insert into product(name,price,cost,info) values('日立冷氣',65000,35000,'壓縮機來自於日本')"; 
				// insert  into  資料表名稱(欄位名稱1,欄位名稱2,欄位名稱3)   values('值1','值2','值3')
				stmt.execute(sql); // 執行sql語法
				
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
			
		}
		
}

