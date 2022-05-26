package interfaceStudy;

class A {
	public void methodA(B b) {
		b.methodB();
	}
}

class B {
	public void methodB() {
		System.out.println("methodB()");
	}
}


public class InterfaceTest {
	public static void main(String[] args) {
		A a = new A();
		a.methodA(new B());
	}
}

// 현재 상태는 B 가 변경되면 A도 변경해 줘야 하는 단점이 있다.
// 인터페이스를 이용해서 클래스 B의 선언과 구현을 분리해야 한다.
