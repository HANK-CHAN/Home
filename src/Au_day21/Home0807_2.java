package Au_day21;

public class Home0807_2 {
	
	public static void main(String[] args) {
		double[] num = new double[21];
		num[0] = 1;
		num[1] = 2;
		
		for(int i=2 ; i <= 20 ; i++) {
			num[i] = num[i-2] + num[i-1];
			System.out.print(num[i]+",");
		}
		System.out.println();
		
		double total = 0 ;
		
		for(int i = 0 ; i < 20 ; i++ ) {
			total += num[i+1] / num[i];
		}
		
		System.out.println("總合為:" + total);
		
	}
	

}
