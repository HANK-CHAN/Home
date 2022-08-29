package Throw01;

import java.util.Scanner;

public class Exception01 {
	
	public static void main(String[] arg) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		try {
			System.out.println("兩數乘績之和:" + multiply(a , b));
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("程式已經結束!");
		
	}
	
	public static int multiply(int a ,int b) throws NumberFormatException{
		int total = 0;
		if (a == 0 || b == 0)
			throw new NumberFormatException("數值為0");
		
		total = a * b;
		
		return total;
	}
}
