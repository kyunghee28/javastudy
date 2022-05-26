package interfaceStudy;

interface I {
	public abstract void play();
}

class A2 {
	void autoPlay(I i) {
		i.play();
	}
}

class B2 implements I {
	public void play() {
		System.out.println("play in B2 class");
	}
}

class C implements I {
	public void play() {
		System.out.println("play in C class");
	}
}

public class InterfaceTest2 {
	public static void main(String[] args) {
		A2 a = new A2();
		a.autoPlay(new B2());	// void autoPlay(I i) 호출
		a.autoPlay(new C());	// void autoPlay(I i) 호출
	}
}

// 실행결과
/*
 * play in B2 class
 * play in C class
*/
