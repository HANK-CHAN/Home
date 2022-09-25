package IO_demo;
import java.sql.*;
public class InsertData {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/javademo";
		String user = "root"; // 這式mysql最高權限
		String password = "123456789"; // 登入密碼
		
		try(Connection conn = DriverManager.getConnection(url,user,password) ) {
			
			if(conn != null && !conn.isClosed()) {
				// 執行sql語句時，需取得 Statement 實作物件，它式sql陳述的代表物件
				Statement stmt = conn.createStatement();
				String sql = "insert into product(name,price,cost,info) values('iPhone14',35000,25000,'這是2022年最新款的iPhone手機')"; 
				
				stmt.execute(sql); // 執行sql語法
				
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
			
		}
		
}

