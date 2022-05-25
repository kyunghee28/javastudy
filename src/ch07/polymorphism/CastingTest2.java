package polymorphism;

class CastingTest2 {

	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
		fe = (FireEngine)car;	// 실행시 에러 발생
		fe.drive();
		car2 = fe;
		car2.drive();
	}

}

// 실행시 에러가 난 이유는 형변환에 오류가 있기 떄문이다.
// 참조변수 car 가 참조하고 있는 인스턴스가 Car타입의 인스턴스이기 떄문
// 조상타입의 인스턴스를 자식타입의 참조변수로 참조하는 것은 허용되지 않는다.

