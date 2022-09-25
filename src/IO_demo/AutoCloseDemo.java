package IO_demo;

public class AutoCloseDemo {

	public static void main(String[] args) {
		try (MyResource res = new MyResource()){
			res.go();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
}
