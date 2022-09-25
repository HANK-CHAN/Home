package IO_demo;

import java.io.*;
public class Ex04 {

	public static void main(String[] args) {
		
		File source = new File("c:\\javalog\\lcc.txt"); // 來源檔案名稱
		File des = new File("c:\\javalog\\lccgood.txt");// 目的地檔案名稱
		
		// 更名
		if(source.exists()) {
			
			if(!des.exists()){ // 目的地檔案需要不存在才可以更名
				source.renameTo(des);
			}

		}
		
		// 刪除檔案
		if(des.exists()){
			des.delete();
		}
		
		
		
	}
	
}
