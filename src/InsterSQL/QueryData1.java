package InsterSQL;

import database.*;
import java.sql.*;

public class QueryData1 {

	public static void main(String[] args) {
		
		try(Connection conn = DriverManager.getConnection(MysqlDb.url,MysqlDb.user,MysqlDb.pwd)){
			
			Statement stmt = conn.createStatement();
			
			String sql = "select * from product";
			// 只要查詢，一定會有回傳資料集
			stmt.executeQuery(sql);
			
			ResultSet rs = stmt.getResultSet(); // 將查詢的資瞭回傳
			
			while(rs.next()) {
				String pname = rs.getString("name");
				String price = rs.getString("price");
				String info = rs.getString("info");
				
				System.out.println(pname + "-" + price+ "-" + info);
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
}
