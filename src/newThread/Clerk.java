package newThread;

public class Clerk {

	private int product = -1 ; // 表示目前沒有貨
	
	public synchronized void setProduct(int pro) {
		while(product != -1) {
			try {
				wait();
			}catch(InterruptedException ex) {
				System.out.println("有Bug");
			}
		}
		
		product = pro;
		System.out.printf("生產者生產 %d 個%n",product);
		notify();
	}
	
	
	public synchronized int getProduct() {
		while(product == -1) {
			try {
				wait();
			}catch(InterruptedException ex) {
				System.out.println("有Bug");
			}
		}
		
		int p = product;
		System.out.printf("消費者取走 %d 個%n ", product);
		
		product = -1;
		notify();
		return p ;
	}
	
}
