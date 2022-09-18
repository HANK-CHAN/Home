package UI_demo;

import javax.swing.*;

class movePicgo implements Runnable{

	private JLabel pic; // 標籤
	private int wide , pos_y,time; // 寬 ，睡覺時間
	
	movePicgo(JLabel pic , int w ,int y , int t){
		this.pic = pic;
		wide = w;
		pos_y = y;
		time = t;
	}
	
	public void run() {
		int pos_x = 0 ;
		while(true) {
			try {
				pos_x += 2;
				pic.setLocation(pos_x, pos_y);
				Thread.sleep(time);
				if(pos_x >= wide) {
					pos_x = 0;
				}
			}catch(Exception ex) {
				System.out.println("圖片移動有問題");
				break;
			}
		}
	}
}

class CFrame extends JFrame{ // 放入圖片
	int w1,w2,y1,y2,time1,time2;
	JLabel pic1 = new JLabel(new ImageIcon("pic1.jpg"));
	JLabel pic2 = new JLabel(new ImageIcon("pic2.jpg"));
	
	CFrame(){ // 建構值
		pic1.setSize(100,80); // 設定大小
		add(pic1); // 放入
		w1 = 400; y1 = 20; time1 = 100;//畫面高度 , 圖片位置, 執行速度
		
		Thread movePic1 = new Thread(new movePicgo(pic1,w1,y1,time1));
		
		pic2.setSize(100,80);
		add(pic2);
		w2 = 400; y2 = 150; time2 = 200;
		
		Thread movePic2 = new Thread(new movePicgo(pic2,w2,y2,time2));
		
		movePic1.start();
		movePic2.start();
		
		setTitle("圖片動畫");
		setLayout(null);
		setBounds(100,100,400,300); // => x,y,width,height
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}

public class THGame2 {

	public static void main(String[] args) {
		new CFrame();
	}
	
}
