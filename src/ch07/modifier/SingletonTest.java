package modifier;

// 생성자의 접근 제어자

final class Singleton {
	
	// getInstance() 에서 사용될 수 있도록 인스턴스가 미리 생성되어야 하므로 static 이어야 한다.
	private static Singleton s = new Singleton();
	
	private Singleton() {
		
	}
	
	// 인스턴스를 생성하지 않고도 호출할 수 있어야 하므로 static이어야 한다.
	public static Singleton getInstance() {
		if(s==null)
			s = new Singleton();
		return s;
	}
}

public class SingletonTest {
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
	}
}
