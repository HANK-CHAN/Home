package Collection02;

public class CustomSet {
	
	public static<T> void printArray(T[] arr) {
		for(T t : arr) {
			System.out.println(t + "");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Integer[] intArr = {1,2,3,4,5,6};
		Double[]  doubleArr = {1.0,2.0,3.0,4.0};
		Character[] charArr = {'L','C','C','C','O'};
		
		System.out.println("整數: ");
		printArray(intArr);
		System.out.println("浮點數: ");
		printArray(doubleArr);
		System.out.println("字元");
		printArray(charArr);
	}

}
