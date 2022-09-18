package newThread;

class Food{
	private int foodNo;
	private static boolean empty = true; // 判斷盤子是否為空 true => 空的
	// 放
	public synchronized void put(int no) {
		while(!empty) { // 表示盤子有食物
			
				try {
					wait(); // 等待
				}catch(InterruptedException ex) {
					System.out.println("有Bug");
				}
				
		}
		
		System.out.println("主人放了第" + no +" 塊雞塊");
		foodNo = no;
		empty = false;
		notify();
		
	}
	// 吃
	public synchronized void eat(int no) {
		
		while(empty) { // 表示盤子無食物
			
			try {
				wait(); // 等待
			}catch(InterruptedException ex) {
				System.out.println("有Bug");
			}
			
		}
		System.out.println("小狗吃了第" + no + " 塊雞塊");
		foodNo = no;
		empty = true;
		notify();
		
	}
}

class Eat implements Runnable{
	Food food;
	public Eat(Food food) {
		this.food = food;
	}
	public void run() {
		for(int i = 1 ; i <= 10 ; i++ ) {
			food.eat(i);
		}
	}
	
}
class Put implements Runnable{
	Food food ;
	
	public Put(Food food) {
		this.food = food;
	}
	public void run() {
		for(int i = 1 ; i <= 10 ; i++) {
			food.put(i);
		}
	}
	
}

public class Cookies {

	public static void main(String[] args) {
		
		Food food = new Food(); // 生成物件
		
		Put put = new Put(food);
		Eat eat = new Eat(food);
		// 上述 兩個是共同維護同一個物件(記憶體位置)
		
		Thread dog = new Thread(eat);
		Thread master = new Thread(put);
		
		dog.start();
		master.start();
		
	}
}
