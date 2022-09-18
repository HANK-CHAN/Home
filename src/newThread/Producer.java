package newThread;

public class Producer implements Runnable {

	private Clerk clerk;
	public Producer(Clerk clerk) {
		this.clerk = clerk;
	}
	
	public void run() {
		System.out.println("生產者開始生產商品...");
		
		for(int i = 1 ; i <= 10 ; i++) {
			try {
				Thread.sleep((int)(Math.random()*4000));
			}catch(Exception ex) {
				System.out.println("被喚醒");
			}
			
			clerk.setProduct(i);
			
		}
	}

	
}
