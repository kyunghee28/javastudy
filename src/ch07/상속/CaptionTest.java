package 상속;


class Tv {
	boolean power;		// 전원상태(on/off)
	int channel;		// 채널
	
	void power() 		{	power = !power; }
	void channelUp() 	{	++channel; 	}
	void channelDown() 	{	--channel;	}
}

class CaptionTv extends Tv {
	boolean caption;	// 캡션상태(on/off)
	void displayCaption(String text) {
		if(caption) {	// 캡션상태가 on(true) 일 떄만 text 를 보여준다
			System.out.println(text);
		}
	}
}

public class CaptionTest {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;	// 조상 클래스로 부터 상속
		ctv.channelUp();	// 조상 클래스로 부터 상속
		System.out.println(ctv.channel);
		
		ctv.displayCaption("Hello");
		ctv.caption = true;	// caption 기능 true 변경
		ctv.displayCaption("Hi");
	}
}

/** 실행결과
* 11
* Hi	
**/