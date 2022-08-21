package six;

public enum Grade {
	A(90,"特優"),
	B(80,"佳作"),
	C(70,"良好"),
	D(60,"普通"),
	E(50,"再加油");
	
	// 屬性必須寫在列舉實例之後，不可寫在之前
	private int score;
	private String info;
	
	private Grade(int score , String info) {
		this.score = score;
		this.info = info ;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public String getInfo() {
		return this.info;
	}
	
}
