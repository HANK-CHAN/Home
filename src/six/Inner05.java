package six;

public class Inner05 {
	
	
	public static void main(String[] args) {
		/*
		 靜態內部類別，在宣告類別時加上 static 
		 只要有加上 static 所配置到的記憶體就在痊癒
		 內部類別加上了static 就如同 static 變數一樣，只屬於某一個類別的
		 他並不是類別中的實體，靜態內部類別沒有 this 參照
		 */
		
		// 可以直接呼叫，因為 StaticInner 是 static ，BMthod 也是 static
		InnerClass03.StaticInner.BMethod();
		
		// 靜態內部類別需要實體化時
		InnerClass03.StaticInner is = new InnerClass03.StaticInner();
		is.AMethod();
		is.BMethod();
		
	}
}
