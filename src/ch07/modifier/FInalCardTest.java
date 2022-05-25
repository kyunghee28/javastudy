package modifier;

class Card {
	final int NUMBER;			// 상수가 선언과 함께 초기화 하지 않고
	final String KIND;			// 생성자에서 단 한번만 초기화 할 수 있다.
	static int width = 100;
	static int height = 200;
	
	Card(String kind, int number) {
		// 매개변수로 넘겨받은 값으로 KIND, NUMBER를 초기화로 한다.
		KIND = kind;
		NUMBER = number;
	}
	Card() {
		this("HEART", 1);
	}
	public String toString() {
		return KIND + " " + NUMBER;
	}
}
public class FInalCardTest {
	public static void main(String[] args) {
		Card c = new Card("HEART", 10);
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c); 		// System.out.println(c.toString());

	}
}
/**	결과 확인
 * HEART
 * 10
 * HEART 10
 * **/
