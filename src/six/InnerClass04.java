package six;

class InnerData{
	private static int sx = 100; // InnerData 靜態成員
	private int x = 16 ; // InnerData 物件成員
	
	class MyData{
		private int x = 99 ; // MyData 物件成員
		public void AMethod() {
			int x = 77 ; // AMethod 中的區域成員
			
			System.out.println("區域變數 x = " + x);
			System.out.println("MyData的 x = " + this.x);
			System.out.println("InnerData的 x = " + InnerData.this.x);
			
			System.out.println("InnerData 的 sx = " + InnerData.sx);
			System.out.println("InnerData 的 sx = " + InnerData.this.sx);
			
		}
	}
}

public class InnerClass04 {
	
	
	public static void main(String[] arg) {
		new InnerData().new MyData().AMethod();
	}

}
