package six;

enum Action{
	UP,DOWN,LEFT,RIGHT;
	
	// 列舉建構式的權限是 private
	Action(){
		System.out.println(this.toString());
	}
	
	public void display() {
		System.out.println("Action 動作顯示");
		System.out.println(this.toString());
	}
	public void go() {
		System.out.println("GO");
	}
}

public class Enum02 {
	public static void main(String[] args) {
		Action ac = Action.UP;
		System.out.println("ac = " + ac);
//		ac.display();
//		ac.go();
		Action ac1 = Action.DOWN;
		ac1.display();
	}
	
}
