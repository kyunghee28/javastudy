package objectEx;

public class ToStringTest {

	public static void main(String[] args) {
		String str = new String("KOREA");
		java.util.Date today = new java.util.Date();
		
		System.out.println(str);
		System.out.println(str.toString());
		System.out.println(today);
		System.out.println(today.toString());
	}

}

// 실행결과
//KOREA
//KOREA
//Mon May 30 09:26:58 KST 2022
//Mon May 30 09:26:58 KST 2022