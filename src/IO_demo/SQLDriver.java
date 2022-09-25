package IO_demo;
import java.sql.*;

public class SQLDriver {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("有MySQL程式項目");
		}catch(Exception ex) {
			System.out.println("驅動程式找不到" + ex.getMessage());
		}
		
	}
}
