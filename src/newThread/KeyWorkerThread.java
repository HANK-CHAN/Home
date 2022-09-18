package newThread;

public class KeyWorkerThread implements Runnable{

	public void run() {
		System.out.println("師傅睡眠中接到電話..");
		System.out.println("確認收費金額，準備出門前往");
		
		try{
			for(int i = 1 ; i <= 6 ; i++) {
				Thread.sleep(1000);
				System.out.println( i +" 分鐘");
			}
		}catch(InterruptedException e){
			System.out.println("工人覺得收費低，拒絕前往");
		}
		System.out.println();
		System.out.println("師傅開鎖中...");
		System.out.println("叮! 師傅開鎖成功，索要開鎖費500");
		System.out.println("師傅離開回家去");
	}
	
}
