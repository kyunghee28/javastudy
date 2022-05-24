package 상속;

public class DeckTest {
	public static void main(String[] args) {
		Deck d = new Deck();	// 카드 한벌(Deck) 을 만든다.
		Card c = d.pick(0);		// 섞기 전에 제일 위의 카드를 뽑는다
		System.out.println(c);	// System.out.println(c.toString()); 과 같다.
		
		d.shuffle();			// 카드를 섞는다,
		c = d.pick(0);			// 섞은 후에 제일 위의 카드를 뽑는다. 
		System.out.println(c);
	}
}

class Deck {
	final int CARD_NUM = 52;	// 카드의 개수
	Card cardArr[] = new Card[CARD_NUM]; // card 객체 배열을 포함
	
	Deck () {	// Deck 의 카드 초기화
		int i = 0;
		for(int k = Card.KIND_MAX ; k > 0; k--) {
			for(int n = 0 ; n < Card.NUM_MAX ; n++) {
				cardArr[i++] = new Card(k, n+1);
			}
		}		
	}
	
	Card pick(int index) {	// 저장된 위치(index)에 있는 카드 하나를 꺼내서 반환
		return cardArr[index];
	}
	
	Card pick() {	// Deck에서 카드 하나를 선택한다.
		int index = (int) (Math.random() * CARD_NUM);
		return pick(index);
	}
		
	void shuffle() {	// 카드의 순서를 섞는다.
		for(int i = 0 ; i < cardArr.length ; i++) {
			int r = (int) (Math.random() * CARD_NUM);
			Card temp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = temp;
		}
	}
}

class Card {
	static final int KIND_MAX = 4;	// 카드 무늬의 수
	static final int NUM_MAX = 13;	// 무늬별 카드 수
	
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	int kind;
	int number;
	
	Card() {
		this(SPADE, 1);
	}
	
	Card(int k, int n) {
		this.kind = k;
		this.number = n;
	}
	
	public String toString() {	// 인스턴스의 정보를 문자열로 반환할 목적으로 정의
		String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
		String numbers = "0123456789XJQK";	// 숫자 10은 X로 표현
		return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number);
	}
}
