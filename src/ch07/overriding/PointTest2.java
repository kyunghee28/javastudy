package overriding;

class PointTest2 {
	public static void main(String[] args) {
		Point3D2 p3 = new Point3D2();
		System.out.println("p3.x=" + p3.x);
		System.out.println("p3.y=" + p3.y);
		System.out.println("p3.z=" + p3.z);
	}
}

class Point2 {
	int x = 10;
	int y = 20;
	
	Point2(int x, int y) {	
		// 생성자가 첫 줄에서 다른 생성자를 호출하지 않기 떄문에 컴파일러가 super()를 여기에 삽입한다.
		// super() 는 Point의 조상인 Object클래스의 기본 생성자인 Object()를 의미한다.
		this.x = x;
		this.y = y;
	}
}

class Point3D2 extends Point2 {
	int z;
	
	Point3D2() {
		this(100, 200, 300);	// Point3D2(int x, int y, int z) 호출
	}
	
	Point3D2(int x, int y, int z) {		
		super(x, y);	// 조상 클래스의 Point2(int x, int y) 를 호출한다.	
		this.z = z;
	}
}

// Point3D2 p3 = new Point3D2(); 와 같이 인스턴스를 생성하면 
// Point3D2 -> Point3D2(int x, int y, int z) -> Point2(int x, int y) -> Object() 순서로 생성자 호출