package six;

public class Inner03 {
	
	
	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.driver();
		car.rain();
		System.out.println("==================");
		
		// 匿名類別 直接實作類別，只在此程式用到，別的內別無法使用
		// 匿名類別主要是用來改寫別的類別的方法 Override
		
		Car car2 = new Car() {
			
			@Override
			public void rain() {
				System.out.println("自動噴水雨刷清理");
			}
		};
		
		car2.driver();
		car2.rain();
		
	}
	 

}
