package newThread;

public class LambdaDemo {

	public static void main(String[] args) {
		
		new Thread(new Runnable() {
			public void run() {
				System.out.println("T1 執行續");
			}
		}).start();
		
		// lambda 寫法
		
		new Thread(()-> System.out.println("T2 執行續") ).start();
	}
	
	
}
