package polymorphism;

class Product {
	int price;			// 제품 가격
	int bonusPoint;		// 제품구매 시 제공하는 보너스 점수
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price/10.0);	// 보너스 점수는 제품가격의 10%	
	}
}

class Tv extends Product {
	Tv(){
		// 조상 클래스의 생성자 Product(int price) 호출
		super(100);	// Tv의 가격을 100만원으로 한다.
	}
	
	// Object클래스의 toString()을 오버라이딩한다.
	public String toString() { return "Tv"; }
}

class Computer  extends Product {
	Computer() { super(200); }
	public String toString() { return "Computer"; }
}

class Buyer {			// 고객, 물건을 사는 사람
	int money = 1000; 	// 소유금액
	int bonusPoint = 0; // 보너스 점수
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;				// 가진 돈에서 구입한 제품의 가격을 뺸다.
		bonusPoint += p.bonusPoint;		// 제품의 보너스 점수를 추가한다.
		System.out.println(p + "를 구매하였습니다.");
				
	}
}

public class PolymorphismTest {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		
		System.out.println("현재 남은 돈은 " + b.money);
		System.out.println("현재 보너스 점수는 " + b.bonusPoint);
	}
}

/* 실행 결과
Tv를 구매하였습니다.
Computer를 구매하였습니다.
현재 남은 돈은 700
현재 보너스 점수는 30
*/

