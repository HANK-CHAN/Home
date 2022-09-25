package IO_demo;

import java.io.*;
public class Ex09 {

	public static void main(String[] args) {
		
		// InputStream 輸入的串流 byte ; OutputStream 輸出串流 byte
		
		byte[] buffer;
		FileInputStream fis = null;
		String fileName = "c:\\mylog\\log\\20220925.log";
		
		try {
			fis = new FileInputStream(fileName);
			buffer = new byte[1];
			// 讀檔時。當讀到檔尾時。則會顯示-1
			while(fis.read(buffer) != -1) {
//				System.out.println( (char)buffer[0] + "-" + buffer[0] );
				System.out.print( (char)buffer[0]);
			}
			System.out.println();
		}catch(IOException ex){
			ex.printStackTrace();
		}
		finally {
			try {
				fis.close();
			}catch(IOException se) {
				se.printStackTrace();
			}
		}
	}
	
}
