package six;

public class EnumDemo {
	
	public enum Color{
		RED,GREEN,BLUE
	}
	
	
	public static void main(String[] args) {
		System.out.println(Enum01.Sunday);
		
		Color myColor = Color.GREEN;
		
		switch(myColor){
			case RED:
				System.out.println("目前獲得紅色");
				break;
			case GREEN:
				System.out.println("目前獲得綠色");
				break;
			case BLUE:
				System.out.println("目前獲得藍色");
				break;
		}
		
		// 利用迴圈的方式將值列出
		for(Color c : Color.values()) {
			System.out.println(c);
		}
		
	}
	

}
