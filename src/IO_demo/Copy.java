package IO_demo;

import java.io.*;
public class Copy {

	public static void main(String[] args) throws FileNotFoundException,IOException{
		
		IO.dump(new FileInputStream("c:\\mylog\\ppt.pptx"),new FileOutputStream("c:\\mylog\\log\\wt.pptx"));
		
	}
	
}
