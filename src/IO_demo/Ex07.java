package IO_demo;
import java.io.*;
public class Ex07 {

	public static void main(String[] args) {
		
		// BufferedReader(Reader)
		// Buffer 緩衝區
		
		FileReader fr = null;
		BufferedReader br = null;
		
		String fileName = "c:\\mylog\\log\\20220925.log";
		String data;
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			while( (data = br.readLine()) != null ) {
				System.out.println(data);
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		finally {
			try {
				// 誰去讀，就關閉誰
				br.close();
			}catch(IOException se) {
				se.printStackTrace();
			}
		}
		
	}
	
}
