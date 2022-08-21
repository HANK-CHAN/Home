package six;
/*
 方法內部內別
 方法中宣告的類別
 只要是方法內部類別，必須在此方法就要自己生成
 
 */
public class InnerClass02 {

	public void mainMethod() {
		System.out.println("Main");
	}
	
	
	public void innerMethod() {
		
		class YouInner extends Father{
			void youMethod() {
				System.out.println("方法的內部類別");
			}
		}
		
		YouInner you = new YouInner();
		you.youMethod();
		you.car();
	}
	
	
	
}
