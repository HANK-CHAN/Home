package IO_demo;
import java.io.*;
import java.net.URL;

public class Download {

	public static void main(String[] args) throws IOException {
		URL url = new URL("https://i.ytimg.com/vi/0JzMhRZFcmY/maxresdefault.jpg");
		InputStream src = url.openStream(); // 對指定的網址進行連線
		OutputStream dest = new FileOutputStream("c:\\mylog\\hm.png");
		
		IO.dump(src, dest);
	
	}
	
	
}
