package newThread;

class HelloThread extends Thread{
	public void run() {
		
		for (int i=0 ; i <= 100 ; i++) {
			String name = Thread.currentThread().getName();
			System.out.println(name + ":" + i);
		}
	}
}
public class Thread03 {

	public static void main(String[] args) {
		
		HelloThread t1 = new HelloThread();
		HelloThread t2 = new HelloThread();
		
		t1.setName("T1");
		t2.setName("T2");
		
		// 啟動
		t1.start();
		t2.start();
	}
	
}
