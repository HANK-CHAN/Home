package Throw01;

import java.util.Scanner;

public class User2 {
	
	
	public static void main(String[] args) {

		Account acc = new Account("444-666-000",12000);
		Scanner scan = new Scanner(System.in);
		int money = 0;
		while(money <= 0) {
			
			try {
				System.out.print("請輸入存款金額 :");
				money = scan.nextInt();
				if(money <= 0) {
					money = 0;
					System.out.println("存款金額必須大於零");
				}
			}catch(Exception e){
				System.out.println("輸入的值不是整數");
				scan.next();
			}
		}
		
		System.out.println("存款金額為: " + money);
		acc.saveMoney(money);
		System.out.println("存款後餘額為: " + acc.bouns);
		
	}
}
