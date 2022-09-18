package newThread;

/*
 * 死結 
 * 原因:
 * 	 執行續互相等待對方釋放資源且永遠沒有結束
 * 	 無論甚麼原因造成的死結都跟資料被鎖定有很大的關西
 *	 synchroized 使用上的問題
 */
public class Deadlock {

	public static void main(String[] args) {
		
		final Object resource1 = "Res1";
		final Object resource2 = "Res2";
		
		Thread t1 = new Thread() {
			public void run() {
				synchronized(resource1) {
					System.out.println("T1 鎖住 resource1...");
				
					try {
						Thread.sleep(200);
					}catch(Exception ex) {
						System.out.println("T1 被解開");
					}
					
					synchronized(resource2) {
						System.out.println("T1 鎖住 resource2");
					}
				
				}
			}
	
		};
		
		Thread t2 = new Thread() {
			public void run() {
				synchronized(resource2) {
					System.out.println("T2 鎖住 resource2");
					try {
						Thread.sleep(100);
					}catch(Exception ex) {
						System.out.println("T2被解開");
					}
					synchronized(resource1) {
						System.out.println("T2 鎖住 resource1");
					}
				}
			}
		};
		
		t1.start();
		t2.start();
		
	}
}
