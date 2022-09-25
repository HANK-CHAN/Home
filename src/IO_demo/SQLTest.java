package IO_demo;

import java.sql.*;
public class SQLTest {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/javademo";
		String user = "root"; // 這式mysql最高權限
		String password = "123456789"; // 登入密碼
		
		try(Connection conn = DriverManager.getConnection(url,user,password) ) {
			
			if(conn != null && !conn.isClosed()) {
				System.out.println("SQL連線測試成功");
				conn.close();
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
			
		}
		
		
	}

