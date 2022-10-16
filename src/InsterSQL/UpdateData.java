package InsterSQL;
import database.*;
import java.sql.*;
import java.util.Scanner;
public class UpdateData {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		try(Connection conn = DriverManager.getConnection(MysqlDb.url,MysqlDb.user,MysqlDb.pwd)){
			System.out.println("請輸入產品ID:");
			int pid = scan.nextInt();
			
			System.out.println("請輸入銷售價格:");
			int price = scan.nextInt();
			
			String sql = "update product set price="+price+" where id ="+pid;
			// update  資料表名稱    set    欄位名稱1 = 修改值1 ,  欄位名稱2 = 修改值2   where   條件式

			
			
			Statement stmt = conn.createStatement();
			
//			boolean res = stmt.execute(sql);
//			System.out.println("是否執行成功" + res);
			
			int rows = stmt.executeUpdate(sql);
			System.out.println("影響筆數: " + rows);
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
}
