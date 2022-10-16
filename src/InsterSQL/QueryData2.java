package InsterSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import database.MysqlDb;

import java.util.Scanner;

public class QueryData2 {

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		try(Connection conn = DriverManager.getConnection(MysqlDb.url,MysqlDb.user,MysqlDb.pwd)){
			
			System.out.println("請輸入產品名稱:");
			String search = scan.next();
			
			Statement stmt = conn.createStatement();
			
			String sql = "select * from product where name like '%"+ search +"%'";
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
