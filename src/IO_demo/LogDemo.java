package IO_demo;
import java.io.*;

import java.time.LocalDateTime; // 抓取當地時間
import java.time.format.DateTimeFormatter; // 將時間格式轉成字串
public class LogDemo {
	/*
	 	當需要寫入 log 來記錄時，通常會將檔案命名為當時日期
	 	20220925.log 這種命名方式
	 */
	public static void main(String[] args) {
		/*
		String nowtime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		String nowtime2 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd HHmmss"));
		String nowtime3 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
		
		System.out.println(nowtime);
		System.out.println(nowtime2);
		System.out.println(nowtime3);
		*/
		
		int[] number = {10,20,30};
		try {
			System.out.println(number[0]);
			System.out.println(number[10]);
		}catch(Exception e) {
			
			WriterLog(e.getMessage());
		}
		System.out.println("程式執行完畢");
	}

	public static void WriterLog(String arr) {
		File dest = new File("c:\\mylog\\log");
		
		if(!dest.exists()) {
			dest.mkdirs();
		}
		
		String fileName = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")) + ".log";
		String writeFile = "c:\\mylog\\log\\" + fileName;
		String nowtime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		
		FileWriter fw = null ;
		try {
			fw = new FileWriter(writeFile,true);
//			fw.write(arr);
			fw.write(nowtime +"\t" +arr); // 多時間
			fw.write("\r\n");
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		finally {
			try {
				fw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
