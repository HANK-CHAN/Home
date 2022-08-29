package Throw01;

public class Account {
	
	public String number;
	public int bouns;
	
	public Account(String number, int bouns) {
		this.number = number;
		this.bouns = bouns;
	}
	
	public void deposite(int money) throws Exception {
		// 若存款為 0 或是負數時，怎麼辦?
			
		if(money > 0) {
			this.bouns += money;
		}else {
			// 丟出自己產生的例外事件
			// 在方法中若有 throw new 時，方法上也要有 throw 例外事件
			throw new Exception("金額必須大於 0 ");
		}
	
	}
	
	
	public void saveMoney(int money) {
		if(money > 0) {
			this.bouns += money;
		}
	}

}
