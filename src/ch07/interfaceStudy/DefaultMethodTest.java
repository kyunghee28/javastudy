package interfaceStudy;

class Parent {
	public void method2() {
		System.out.println("method2 () in Parent");
	}
}

interface MyInterface {
	default void methid1() {
		System.out.println("methid1() in MyInterface");
	}
	default void methid2() {
		System.out.println("methid2() in MyInterface");
	}
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface");
	}
}

interface MyInterface2 {
	default void methid1() {
		System.out.println("methid1() in MyInterface2");
	}
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface2");
	}
}

class Child extends Parent implements MyInterface, MyInterface2 {
	public void  methid1() {
		System.out.println("methid1() in Child");	// 오버라이딩
	}
}


public class DefaultMethodTest {
	public static void main(String[] args) {
		Child c = new Child();
		c.methid1();
		c.methid2();
		MyInterface.staticMethod();
		MyInterface2.staticMethod();
	}
}

/* 실행결과
 * methid1() in Child 
 * methid2() in MyInterface 
 * staticMethod() in MyInterface
 * staticMethod() in MyInterface2
 */
