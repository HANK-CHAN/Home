package IO_demo;
import java.io.*;
public class Ex05 {

	// 寫入文字到檔案有兩個方式 fileWirter StreamWriter
	
	// stream 串流 : 傳輸的方式: byte 位元      圖片、影片、other...、copy
	// writer,reader : 都是用 character 字元  純文字用
	
	public static void main(String[] args) {
		
		String fileName = "c:\\mylog\\0925\\good.txt";
		
		// \n 是程式判斷段行的符號 windows 打開文字時看不懂
		// 在windows要處理就要改為 \r\n;
		
		String data = "Java 程式設計師\r\n";
		String data2 = "Python 程式設計師\r\n\r\n";
		
		FileWriter fw = null; // 要初始化物件
		
		try {
			// 21行 括號內若沒寫上true ，每執行一次就會將原先的文字給覆蓋掉
//			fw = new FileWriter(fileName);
			fw = new FileWriter(fileName,true);
			fw.write(data);
			fw.write(data2);
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally { // 最後一定要執行
			try {
				fw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	
}
