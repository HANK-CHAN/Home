package Collection01;
import java.util.*;
public class ListDemo1 {

	public static void main(String[] args) {
		// 括號 () 內可以先設置長度 
		ArrayList<String> list = new ArrayList<>();
		
		list.add("大眼睛");
		list.add("小鼻子");
		list.add("招風耳");
		list.add("大眼睛");
		
		System.out.println("ArrayList 的長度:" + list.size());
		System.out.println("內容物");
		System.out.println(list);
		
		// 指定插入的位置(索引)
		
		list.add(1,"Cow");
		
		System.out.println("取出元素");
		
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.println(i + ":" + list.get(i));
		}
		
		// foreach 抓法
		int i = 0;
		System.out.println();
		for(String name : list) {
			System.out.println(i + ":" + name);
			i++;
		}
		
		// 搜尋  indexOf 是從第0個索引值找
		System.out.println("大眼睛是否在裡面:" + list.indexOf("大眼睛"));
		// lastIndexof   是找出元素中最後的那一個索引位置
		System.out.println("大眼睛是否在裡面:" + list.lastIndexOf("大眼睛"));
		
		// 找不到 會顯示 -1
		System.out.println("李大天是否在裡面:" + list.indexOf("李大天"));
		
		
		//取代
		list.set(0, "小蝌蚪");
		
		System.out.println(list);
		
		list.remove(0); // 立面放索引值
		
		System.out.println(list);
		
	}
	
	
}
