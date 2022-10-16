package InsterSQL;

import database.*;
import java.sql.*;
import java.util.Scanner;

public class DeleteData {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		try(Connection conn = DriverManager.getConnection(MysqlDb.url,MysqlDb.user,MysqlDb.pwd)){
			
			System.out.println("請輸入欲刪除的產品ID:");
			int pid = scan.nextInt();
			
			String sql = "delete from product where id =" + pid;
			
			Statement stem = conn.createStatement();
			
			int rows = stem.executeUpdate(sql);
			System.out.println("影響筆數: " + rows);
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	
}
