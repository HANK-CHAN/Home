package newThread;

class SchoolThread implements Runnable{
	
	public void run() {
		for(int i=1 ; i <= 100 ; i++) {
			String name = Thread.currentThread().getName();
			System.out.println(name + ":" + i);
		}
	}
}

public class Thread04 {

	public static void main(String[] args) {
		
		SchoolThread s1 = new SchoolThread(); 
		SchoolThread s2 = new SchoolThread();
		
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2,"Thread2");
		
		t1.start();
		t2.start();
		
		System.out.println("可用執行序為:" + Thread.activeCount() + "條");
		
	}
	
}
