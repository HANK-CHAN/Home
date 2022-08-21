package Au_day21;

import java.util.Scanner;

public class Home0807_1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("輸入天數:");
		
		int day = sc.nextInt();
		int[] rabbit = new int[day+1];
		
		for(int i = 1 ; i < rabbit.length ; i++) {
			if (i == 1 || i == 2) {
				rabbit[i-1] = 1;
			}else {
				rabbit[i-1] = rabbit[i-2] + rabbit[i-3];
			}
		}
		
		// 上述是rabbit 的對數
		
		for(int i = 1 ; i < rabbit.length ; i++) {
			if(i == day) {
				System.out.println(rabbit[i-1]);
			}else {
				System.out.println(rabbit[i-1]+",");
			}
		}	
		int number = rabbit[day-1] * 2 ; 
		System.out.println("Rabbit 的隻數 : " +number);
		
	}
/*
  1  1  2  3  5  8 
  r[0] = 1
  r[1] = 2
  r[3-1] = r[3-2] + r[3-3]
  r[4-1] = r[4-2] + r[4-3]
  r[5-1] = r[5-2] + r[5-3] 
*/

}
