package Throw01;

public class User {
	
	public static void main(String[] args) {
		
		Account ac = new Account("123-456-789",10000);
		
		// 此行執行後，內容並沒有發生錯誤和改變
		// 需自行檢查 ，回傳錯誤
		int money = -100;
		try {
//			if(money <= 0)
//				System.out.println("數值不對");
//			else
				ac.deposite(-100);
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println(ac.bouns);
	}

}
