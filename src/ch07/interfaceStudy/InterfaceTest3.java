package interfaceStudy;

interface I3 {
	public abstract void methodB();
}

class InstanceManager {
	public static I3 getInstance() {
		return new B3();	// 다른 인터페이스로 바꾸려면 이부분을 변경하면 된다.
	}
}

class A3 {
	void methodA() {
		// 제 3의 클래스의 메서드를 통해서 인터페이스 i를 구현한 클래스의 인스턴스를 얻어온다.
		// 인스턴스를 직접 생성하지 않고 getInstance() 라는 메서드를 통해 제공받는다.
		I3 i = InstanceManager.getInstance();
		i.methodB();
		System.out.println(i.toString());	// i로 object클래스의 메서드 호출가능
	}
}

class B3 implements I3 {
	public void methodB() {
		System.out.println("methodB in B3 class");
	}
	public String toString() {	return "class B3"; }
}

public class InterfaceTest3 {
	public static void main(String[] args) {
		A3 a = new A3();
		a.methodA();
	}
}

// 실행결과
/*
 * methodB in B3 class
 * class B3
*/
