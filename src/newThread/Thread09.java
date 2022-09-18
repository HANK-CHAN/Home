package newThread;

public class Thread09 {

	public static void main(String[] args) {
		
		System.out.println("主程式執行開始");
		
		Thread t1 = new Thread() {
			public void run() {
				try {
					System.out.println("Thread T1 Start");
					for(int i = 1 ; i <= 5 ; i++ ) {
						Thread.sleep(1000);
						System.out.println("T1 Run...");
					}
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		t1.start();
		
		try {
			t1.join(); // 讓與這個執行序整個執行完畢後，其他的執行序才會繼續往下
		}catch(InterruptedException e ) {
			e.printStackTrace();
		}
		
		System.out.println("程式執行完畢");
	}
	
	
}
