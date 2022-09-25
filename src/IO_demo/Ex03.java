package IO_demo;
import java.io.*;
public class Ex03 {

	public static void main(String[] args) {
		boolean res ;
		File dir = new File("c:\\javalog\\0925"); // 後面沒有副檔名，因為是「目錄」
		if(!dir.exists()) {
			/*
			 若父目錄沒有時，要建立父目錄底下的子目錄時，不可使用
			 只能用在以存在的 父目錄下 建立一個子目錄
			 c:\\javalog\\0925         javalog=> 父目錄 0925 子目錄
			*/
			res = dir.mkdirs();
			
			System.out.println("建立目錄:" + res);
		}
		
		File f = new File("c:\\javalog\\0925\\lcc.txt");
		if(!f.exists()) {
			try {
				f.createNewFile();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
 		
		
	}
	
	
}
