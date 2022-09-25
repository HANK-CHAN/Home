package IO_demo;
import java.io.*;

public class Ex10 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		BufferedReader br = null;
		String fileName = "c:\\mylog\\log\\20220925.log";
		
		try {
			fis = new FileInputStream(fileName);
			InputStreamReader reader = new InputStreamReader(fis,"UTF-8");
			br = new BufferedReader(reader);
			String data;
			while( (data = br.readLine()) != null   ) {
				System.out.println(data);
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		finally {
			try {
				br.close();
			}catch(IOException se) {
				se.printStackTrace();
			}
		}
		
	}
	
}
