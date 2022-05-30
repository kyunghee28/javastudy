package objectEx;

class Card2 {
	String kind;
	int number;
	
	Card2() {
		this("SPADE", 1);
	}

	Card2(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		// Card2 인스턴스와 kind와 number를 문자열로 반환
		return "kind : " + kind + ", number : " + number;
	}
}

public class CardToString2 {
	public static void main(String[] args) {
		Card2 c1 = new Card2();
		Card2 c2 = new Card2("HEART", 10);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}

// 실행결과
/*
 * kind : SPADE, number : 1 
 * kind : HEART, number : 10
 */
