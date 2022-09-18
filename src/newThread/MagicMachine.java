package newThread;

class WithDraw implements Runnable{
	
	private Account account; // 帳號
	private double withdrawMoney; // 要提款金額
	
	public WithDraw(Account account, double withdrawMoney) {
		this.account = account;
		this.withdrawMoney = withdrawMoney;
	}
	
	public void run() {
		synchronized(account) {
			account.withDraw(account, withdrawMoney);
		}
	}
}

class Account{
	
	private double balance; // 帳戶餘額
	
	public Account(double balance) {
		this.balance = balance;
	}
	 // synchronized 鎖定/同步
//	public synchronized void withDraw(Account account,double money) {
	public synchronized void withDraw(Account account,double money) {
		String tName = Thread.currentThread().getName();
		System.out.println(tName + "開始提款...");
		
		double tempBalance = balance;
		// 單純的讓 delay 從0 跑到 99999999 結束
		// 讓城市稍微 delay 一點點
		for(int delay=0 ; delay <= 99999999; delay++);
		
		tempBalance -= money;
		
		if(tempBalance < 0) {
			System.out.println("--------------------");
			System.out.println("此帳戶餘額不足");
			System.out.println("--------------------");
		}else {
			balance = tempBalance;
		}
		
		System.out.println("交易明細:\n 欲提款金額 : " + money + "餘額為: " + balance);
		System.out.println(tName + "完成提款...");
		System.out.println("--------------------");
	}
	
	public double chackBalance() {
		return balance;
	}
}

public class MagicMachine {
	
	public static void main(String[] args) {
		Account ac = new Account(10000); // 物件
		
		System.out.println("此帳號餘額為: " + ac.chackBalance() + " 元");
		
		WithDraw s1 = new WithDraw(ac,5000);
		WithDraw s2 = new WithDraw(ac,2000);
		WithDraw s3 = new WithDraw(ac,7000);
		
		Thread t1 = new Thread(s1,"W1");
		Thread t2 = new Thread(s2,"W2");
		Thread t3 = new Thread(s3,"W3");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
