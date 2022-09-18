package newThread;

public class FatherThread implements Runnable{
	
	public void run() {
		System.out.println("爸爸下班了!!!");
		System.out.println("準備打開家裡的門");
		System.out.println("發現沒帶 Key .....");
		System.out.println("打電話請開鎖師傅來處理..");
		System.out.println("等待師傅前來....");
		
		Thread worker = new Thread(new KeyWorkerThread());
		worker.start();
		try{
			worker.join(); // 讓與給 worker 先做完，自己再繼續
//			worker.join(2000); // 可填寫讓與秒數
		}catch(InterruptedException ex) {
			System.out.println("放棄...");
		}
		System.out.println("爸爸給錢給師傅後，成功開門回家!");
	}
	
	

}
