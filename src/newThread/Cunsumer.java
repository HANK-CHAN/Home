package newThread;

public class Cunsumer implements Runnable{
	
	private Clerk clerk;
	public Cunsumer(Clerk clerk) {
		this.clerk = clerk;
	}
	
	public void run() {
		System.out.println("消費者開始拿商品...");
		
		for(int i = 1 ; i <= 10 ; i++) {
			try {
				Thread.sleep((int)(Math.random()*4000));
			}catch(Exception ex) {
				System.out.println("被喚醒");
			}
			
			int product = clerk.getProduct();
			
		}
	}

}
