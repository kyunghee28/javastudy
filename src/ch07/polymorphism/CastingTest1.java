package polymorphism;

class CastingTest1 {
	public static void main(String[] args) {
		Car car = null;	// Car타입의 참조변수를 car로 선언하고 null로 초기화
		FireEngine fe  = new FireEngine();	// FireEngine 인스턴스를 생성, FireEngine 타입의 참조변수가 참조하도록
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;	// car = (Car) fe; 에서 형 변환이 생략된 형태 
		// car.water();	// 컴파일 에러! Car 타입의 참조변수로는 water()를 호출할 수 없다.
		
		fe2 = (FireEngine)car;	// 자손타입 <- 조상타입
		fe2.water();
	}

}

class Car {
	String color;
	int door;

	void drive() { // 운전하는 기능
		System.out.println("drive");
	}

	void stop() { // 엄추는 기능
		System.out.println("stop");
	}
}

class FireEngine extends Car { // 소방차
	void water() { // 물뿌리는 기능
		System.out.println("water");
	}
}