package IO_demo;

import java.io.*;
public class Ex01 {

	public static void main(String[] args) {
		
		File f = new File("lcc.txt"); // 產生 File物件 ，並不會立即建立檔案
 		
		if(!f.exists()) { // 若是檔案不存在時  exists() 判斷存在 
			try {
			boolean result = f.createNewFile();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("檔案是否存在?" + f.exists());
	}
	
	
}
