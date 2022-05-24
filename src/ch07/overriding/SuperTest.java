package overriding;

class SuperTest {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}
}

class Parent {
	int x = 10;
}

class Child extends Parent {
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
}

// x, this.x, super.x 모두 같은 변수를 의미하므로 모두 같은 값이 출력

/**	결과 확인
 * x=10
 * this.x=10
 * super.x=10
 * */
 