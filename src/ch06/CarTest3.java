// 생성자를 이용한 인스턴스의 복사

class Car3 {
	String color;		// 색상
	String gearType;	// 변속기 종류 - auto(자동), manual(수동)
	int door;			// 문의 개수
	
	Car3(){
		this("white", "auto", 4);	// Car(String color, String gearType, int door)를 호출
	}
	Car3(Car3 c){	// 인스턴스 복사를 위한 생성자
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	Car3(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class CarTest3 {

	public static void main(String[] args) {
		Car3 c1 = new Car3();
		Car3 c2 = new Car3(c1);	// c1의 복사본 c2 생성
		
		System.out.println("c1의 color = "+ c1.color + 
				", gearType = "+ c1.gearType +
				", door = "+ c1.door );
		
		System.out.println("c2의 color = "+ c2.color + 
				", gearType = "+ c2.gearType +
				", door = "+ c2.door );
		
		c1.door = 100;	// c1의 인스턴스 변수 door 의 값 변경
		System.out.println("c1.door = 100; 수행 후");
		System.out.println("c1의 color = "+ c1.color + 
				", gearType = "+ c1.gearType +
				", door = "+ c1.door );
		
		System.out.println("c2의 color = "+ c2.color + 
				", gearType = "+ c2.gearType +
				", door = "+ c2.door );
		
	}
}

// 인스턴스 c2는 c1을 복사하여 생성되어서 서로 같은 상태이지만, 
// 서로 독립적인 메모리 공간에 존재하므로 c1의 값이 변경되어도 c2에 영향을 주지 않는다.

/**	
 * 실행 결과
 * 
 * c1의 color = white, gearType = auto, door = 4
 * c2의 color = white, gearType = auto, door = 4
 * c1.door = 100; 수행 후
 * c1의 color = white, gearType = auto, door = 100
 * c2의 color = white, gearType = auto, door = 4
 * 
 **/
