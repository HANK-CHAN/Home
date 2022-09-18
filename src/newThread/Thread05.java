package newThread;

public class Thread05 {

	public static void main(String[] args) {
		// 匿名類別
		Thread t1 = new Thread() {
			public void run() {
				for(int i=0 ; i <=100 ; i++) {
					System.out.println(i);
				}
			}
		};
		
		t1.start();
		
		System.out.println("可用執行序為:" + Thread.activeCount() + "條");
		System.out.println("程式執行完畢");
	}

}
