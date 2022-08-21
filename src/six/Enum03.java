package six;

public class Enum03 {
	
	public static void main(String[] args) {
		
		int score = Grade.B.getScore();
		String info = Grade.B.getInfo();
		
		System.out.println("分數=>"+score + "，評語:" + info);
		System.out.println("====================");
		
		Grade myGrade = Grade.D;
		int myscore = myGrade.getScore();
		String myinfo = myGrade.getInfo();
		
		System.out.println("級別=>"+myscore + "，評語:" + myinfo);
		
	}

}
