package newThread;

public class ForgetKey {

	public static void main(String[] args) {
		
		Thread father = new Thread(new FatherThread());
		father.start();
		
		
	}
	
}
