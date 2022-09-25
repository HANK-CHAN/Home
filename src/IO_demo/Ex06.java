package IO_demo;
import java.io.*;
public class Ex06 {

	public static void main(String[] args) {
		
		char[] buffer = new char[1];
		FileReader fr = null;
		String fileName = "c:\\mylog\\log\\20220925.log";
		
		try {
			
			fr = new FileReader(fileName);
			// 讀檔時。當讀到檔尾時。則會顯示-1
			while(fr.read(buffer) != -1) {
				System.out.print(new String(buffer)); // print 的原因是自己不斷行，而是由檔案內容決定
			}
			System.out.println();
			
			
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		finally{
			try {
				fr.close();
			}catch(IOException se) {
				se.printStackTrace();
			}
		}
		
	}
	
}
