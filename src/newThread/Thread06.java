package newThread;

public class Thread06 {
	
	public static void main(String[] args) {
		
		// 當Thread.sleep 時，必須用 try..catch 來包覆
		// 因為 Thread.sleep 會產生 InterruptedException 中斷的錯誤
		
		Thread t1 = new Thread() {
			
			public void run() {
				try {
					Thread.sleep(3000);
				}catch(InterruptedException e) {
					System.out.println("在未完成的時間，我被叫醒了");
				}
			}
			
		};
		
		t1.start();
		System.out.println("程式執行完畢");
	}

}
