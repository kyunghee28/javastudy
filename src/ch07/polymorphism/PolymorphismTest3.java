// 여러 종류의 객체를 배열로 다루기
package polymorphism;

import java.util.*;	// Vector 클래스를 사용하기 위해서 추가해 주었다.

// Vector는 동적으로 크기가 관리되는 객체배열이다.

class Product3 {
	int price;			// 제품 가격
	int bonusPoint;		// 제품구매 시 제공하는 보너스 점수
	
	Product3(int price) {
		this.price = price;
		bonusPoint = (int) (price/10.0);	// 보너스 점수는 제품가격의 10%	
	}
	Product3(){
		price = 0;
		bonusPoint = 0;
	};	
}

class Tv3 extends Product3 {
	Tv3(){
		// 조상 클래스의 생성자 Product3(int price) 호출
		super(100);	// Tv의 가격을 100만원으로 한다.
	}
	
	// Object클래스의 toString()을 오버라이딩한다.
	public String toString() { return "Tv"; }
}

class Computer3  extends Product3 {
	Computer3() { super(200); }
	public String toString() { return "Computer"; }
}

class Audio3  extends Product3 {
	Audio3() { super(50); }
	public String toString() { return "Audio"; }
}

class Buyer3 {		// 고객, 물건을 사는 사람
	int money = 1000; 	// 소유금액
	int bonusPoint = 0; // 보너스 점수
	Vector item = new Vector();	// 구입한 제품을 저장하는데 사용될 Vector

	void buy(Product3 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;				// 가진 돈에서 구입한 제품의 가격을 뺸다.
		bonusPoint += p.bonusPoint;		// 제품의 보너스 점수를 추가한다.
		
		item.add(p);					// 제품을 Vector 에 저장

		System.out.println(p + "를 구매하였습니다.");				
	}
		
	void refund(Product3 p) {	// 구입한 제품을 환불한다.
		if(item.remove(p)) {	// 환불한 제품을 Vector에서 제거 
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "를 반품하였습니다.");
		} else {
			// 제거 실패한 경우
			System.out.println("구입한 제품 중에 해당 제품이 없습니다.");
		}	
	}
	
	void summary() {	// 구매한 물품에 대한 정보를 요약해서 보여준다.
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()) {	// Vector 비어있는 경우
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		
		// 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
		for(int i = 0 ; i < item.size() ; i++) {
			Product3 p = (Product3) item.get(i);	// Vector의 i 번쨰에 있는 객체를 얻어온다.
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p;
		}
		
		System.out.println("구입한 제품의 총 금액 : " + sum);
		System.out.println("구입한 제품 리스트 : " + itemList);
	}
}

public class PolymorphismTest3 {
	public static void main(String[] args) {
		Buyer3 b = new Buyer3();
		Tv3 tv = new Tv3();
		Computer3 com = new Computer3();
		Audio3 audio = new Audio3();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);		
		b.summary();
		
		System.out.println();
		
		b.refund(tv);
		b.summary();
		
	}
}

/* 실행 결과
Tv를 구매하였습니다.
Computer를 구매하였습니다.
Audio를 구매하였습니다.
구입한 제품의 총 금액 : 350
구입한 제품 리스트 : Tv, Computer, Audio

Tv를 반품하였습니다.
구입한 제품의 총 금액 : 250
구입한 제품 리스트 : Computer, Audio
*/

