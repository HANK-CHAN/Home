/*
 * 自訂例外類別時，要有四部奏
 * 
 * 1. 產生自訂例外類別
 * 2. 宣告方法時，要加入 throws 修飾字
 * 3. 在宣告的方法中，要使用 throw new 將自訂例外類別丟出去 
 * 4. 在程式中藥用 tyr...catch 將呼叫方法包起來 或是 再 throw 出去
 */

package Throw01;

import java.util.Scanner;

class MemberIdCheckException extends Exception{
	public MemberIdCheckException(String msg) {
		super("會員ID:" + msg + "格式有誤");
	}
	
	public void callMe() {
		System.out.println("請洽線上服務人員!!!");
	}
}

public class CustomException {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入ID確認:");
		String mID = scan.next();
		boolean verify;
		try {
			verify = checkID(mID);
		} catch (MemberIdCheckException e) {
			System.out.println("訊息:" + e.getMessage());
			e.callMe();
//			e.printStackTrace();
			verify = false;
		}
		if(verify)
			System.out.println("ID 認證成功!");
		else
			System.out.println("ID 認證失敗..");
	}
	
	public static boolean checkID(String id) throws MemberIdCheckException{
		if(id.length() >= 10 || id.length() <= 5) {
			throw new MemberIdCheckException(id);
		}
		return true;
	}
	
	
}
