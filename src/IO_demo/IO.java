package IO_demo;
import java.io.*;

public class IO {
	// 將來源的資料 寫入 至 目的地的資料位置
	public static void dump(InputStream src,OutputStream dest) throws IOException{
		
		// 資訊自動關閉
		try(InputStream input = src ; OutputStream output = dest){
			byte[] data = new byte[1024]; // 1024byte => 1kb
			int length = -1; // 設定檔尾
			
			while((length = input.read(data)) != -1) {
				output.write(data,0,length);
			}
		}
	}
	
}
