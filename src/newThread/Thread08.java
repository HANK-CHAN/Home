package newThread;

public class Thread08 {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread() {
			public void run() {
				while(true) {
					System.out.println("Go");
				}
			}
		};
		
		t1.setDaemon(true); // 當此執行序被設定 Daemon 時，其他執行序執行完後，
		t1.start();         // 若 t1還沒有執行完，會直接被中斷掉
		
		System.out.println("程式執行完畢");
		
	}

}
