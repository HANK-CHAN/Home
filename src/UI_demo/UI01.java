package UI_demo;

import javax.swing.*;

public class UI01 extends JFrame{

	public UI01() {
		super("這個是視窗");
		setLocation(800,300); // 設定 x,y 的位置
		setSize(300,400); // 設定 width 及 height
		setVisible(true); // 設定畫面是否顯示出來
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 關閉畫面
	}
	
	public static void main(String[] args) {
		new UI01();
	}
	
}
