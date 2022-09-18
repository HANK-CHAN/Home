package Collection02;

import java.util.Random;
import java.util.Scanner;
public class School {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand= new Random();
		
		StuLinkedList list = new StuLinkedList();
		int i,j,findNumber = 0 , find ;
		int[][] data = new int[12][10];
		
		String[] name = {"Bill","Sue","Mary","Tom","Hank","Allen","John","Cherry","Joe","Bob","Lisa","David"};
		
		
		
		// 新增學生資料
		for(i = 0 ; i < 12 ; i++) {
			data[i][0] = i + 1;
			data[i][1] = (Math.abs(rand.nextInt(50))) + 50;
			list.insert(data[i][0],data[i][1], name[i]);	
		}
		
		System.out.println("座號 成績 座號 成績 座號 成績 座號 成績\n");
		// 呈現輸入完的學生資料
		for(i=0 ; i < 3 ; i++) {
			for(j=0 ; j < 4 ; j++) {
				System.out.print("[" + data[j*3+i][0] + "] [" + data[j*3+i][1] + "]");
			}
			System.out.println();

		}
		System.out.println();
		list.print();
		
		while(true) {
			
			System.out.println("請輸入要刪除的座號，離開請輸入 -1:");
			findNumber = scan.nextInt();
			if(findNumber == -1)
				break;
			else {
				Node current = new Node(list.first.data,list.first.np,list.first.name);
				// 從第一位開始找
				current.next = list.first.next;
				// 要刪除的座號一定要在裡面
				while(current.data != findNumber)
					current = current.next;
				list.delete(current);
			}
			list.print();
		}
	}
	
}
