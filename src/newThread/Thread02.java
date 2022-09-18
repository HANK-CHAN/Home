package newThread;

class LccThread extends Thread{

	public void run() {
		
		for(int i = 1; i <= 100 ; i++) {
			String name = Thread.currentThread().getName();
			System.out.println(name + ":" + i);
		}
	}
	
}


public class Thread02 {
	public static void main(String[] args) {
		LccThread t1 = new LccThread();
//		t1.run();
		t1.start();
		
		LccThread t2 = new LccThread();
		t2.start();
		System.out.println("可用執行續 : " + Thread.activeCount());
		
		System.out.println("程式執行完畢");
	}
}
