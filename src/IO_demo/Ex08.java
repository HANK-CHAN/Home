package IO_demo;
import java.io.*;
public class Ex08 {

	public static void main(String[] args) {
		// BufferedWriter(Writer物件)
		
		String[] data = new String[2];
		data[0] = "Java 學習日記";
		data[1] = "學生:陳龍貓";
		
		FileWriter fw = null;
		BufferedWriter bw = null ;
		
		String fileName = "c:\\mylog\\log\\bufferwriter.log";
		try {
			fw = new FileWriter(fileName,true);
			bw = new BufferedWriter(fw);
			for(int i=0 ; i < data.length ; i++) {
				bw.write(data[i]);
				bw.newLine(); // 新增一行空白
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		finally {
			try {
				bw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
