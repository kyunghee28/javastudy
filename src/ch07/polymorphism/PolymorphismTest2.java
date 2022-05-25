package polymorphism;

// 여러 종류의 객체를 배열로 다루기

class Product2 {
	int price;			// 제품 가격
	int bonusPoint;		// 제품구매 시 제공하는 보너스 점수
	
	Product2(int price) {
		this.price = price;
		bonusPoint = (int) (price/10.0);	// 보너스 점수는 제품가격의 10%	
	}
	Product2(){};	// 기본 생성자
}

class Tv2 extends Product2 {
	Tv2(){
		// 조상 클래스의 생성자 Product2(int price) 호출
		super(100);	// Tv의 가격을 100만원으로 한다.
	}
	
	// Object클래스의 toString()을 오버라이딩한다.
	public String toString() { return "Tv"; }
}

class Computer2  extends Product2 {
	Computer2() { super(200); }
	public String toString() { return "Computer"; }
}

class Audio  extends Product2 {
	Audio() { super(50); }
	public String toString() { return "Audio"; }
}

class Buyer2 {		// 고객, 물건을 사는 사람
	int money = 1000; 	// 소유금액
	int bonusPoint = 0; // 보너스 점수
	
	Product2[] item = new Product2[10];	// 구입한 제품을 저장하기 위한 배열
	int i = 0;							// Product2 배열에 사용될 카운터
	
	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;				// 가진 돈에서 구입한 제품의 가격을 뺸다.
		bonusPoint += p.bonusPoint;		// 제품의 보너스 점수를 추가한다.
		
		item[i++] = p;					// 제품을 Product2[] item 에 저장

		System.out.println(p + "를 구매하였습니다.");				
	}
	
	void summary() {	// 구매한 물품에 대한 정보를 요약해서 보여준다.
		int sum = 0;
		String itemList = "";
		
		// 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
		for(int i = 0 ; i < item.length ; i++) {
			if(item[i] == null) break;

			sum += item[i].price;
			itemList += (i==0) ? "" + item[i] : ", " + item[i];
		}
		
		System.out.println("구입한 제품의 총 금액 : " + sum);
		System.out.println("구입한 제품 리스트 : " + itemList);
	}
}

public class PolymorphismTest2 {
	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		
		b.buy(new Tv2());
		b.buy(new Computer2());
		b.buy(new Audio());
		
		b.summary();
	}
}

/* 실행 결과
Tv를 구매하였습니다.
Computer를 구매하였습니다.
Audio를 구매하였습니다.
구입한 제품의 총 금액 : 350
구입한 제품 리스트 : Tv, Computer, Audio

*/

