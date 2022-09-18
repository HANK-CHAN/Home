package newThread;

public class Store {
	public static void main(String[] args) {
		
		Clerk clerk = new Clerk();
		
		new Thread(new Cunsumer(clerk)).start();
		
		new Thread(new Producer(clerk)).start();
	}
	

}
