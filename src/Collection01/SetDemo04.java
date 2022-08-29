package Collection01;
import java.util.*;

import Throw01.Account;
public class SetDemo04 {

	public static void main(String[] args) {
		
		// 希望帶入的值是字串物件
		// 泛型，主要是讓所使用的集合更加安全
		HashSet<String> data = new HashSet<>();
		
		data.add("台灣大學");
//		data.add(100); 
		
		Iterator<String> itStr = data.iterator();
		while(itStr.hasNext()) {
			String s = itStr.next();
			System.out.println(s);
		}
		
		HashSet<Account> accObj = new HashSet<>();
		
		accObj.add(new Account("1111",500));
		accObj.add(new Account("2222",800));
		accObj.add(new Account("3333",400));
		
		Iterator<Account> itAcc = accObj.iterator();
		while(itAcc.hasNext()) {
			Account s = itAcc.next();
			System.out.println(s);
		}
		
		HashSet<Number> numObj = new HashSet();
		numObj.add(200);
		numObj.add(3.14);
		
		Iterator<Number> itnum = numObj.iterator();
		while(itnum.hasNext()) {
			Number s = itnum.next();
			System.out.println(s);
		}
		
	}
	
	
}
