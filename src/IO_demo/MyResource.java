package IO_demo;

public class MyResource implements AutoCloseable{

	public void go() {
		System.out.println("我的財富");
	}
	
	public void close() throws Exception{
		throw new Exception("自動關閉資源");
	}
	
	
}
