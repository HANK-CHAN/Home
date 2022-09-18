package newThread;

public class Thread01 {

	public static void main(String[] args) {
		
		System.out.println("LCC School");
		
		String name = Thread.currentThread().getName();
		
		System.out.println("正在執行的Thread name : " + name);
		
		System.out.println("執行續數量 : "+Thread.activeCount());
		
	}
	
}
