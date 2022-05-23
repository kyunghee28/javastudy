// Product클래스의 인스턴스를 생성할 때마다 인스턴스 블럭이 수행되어
// 클래스 변수 count의 값을 1을 증가시킨 다음 그 값을 serialNo에 저장
class Product {
	static int count = 0;	// 생성된 인스턴스 수를 저장하기 위한 변수
	int serialNo;			// 인스턴스 고유의 번호
	
	{	
		++count;
		serialNo = count;
	}
	
	public Product() {}		// 기본 생성자, 생략가능
}

public class ProductTest {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1의 제품번호 (serial no)는 " + p1.serialNo);
		System.out.println("p2의 제품번호 (serial no)는 " + p2.serialNo);
		System.out.println("p3의 제품번호 (serial no)는 " + p3.serialNo);
		System.out.println("생산된 제품의 수는 모두 " + Product.count + "개 입니다.");
	}
}

/** 실행결과
 * p1의 제품번호 (serial no)는 1
 * p2의 제품번호 (serial no)는 2
 * p3의 제품번호 (serial no)는 3
 * 생산된 제품의 수는 모두 3개 입니다.
**/