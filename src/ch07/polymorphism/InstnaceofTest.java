package polymorphism;

class InstnaceofTest {

	public static void main(String[] args) {
		I_FireEngine fe = new I_FireEngine();
		
		if(fe instanceof I_FireEngine) {
			System.out.println("this is a FireEngine instance.");
		}
		
		if(fe instanceof I_Car) {
			System.out.println("this is a Car instance.");
		}
		
		if(fe instanceof Object) {
			System.out.println("this is an Object instance.");
		}
		
		System.out.println(fe.getClass().getName());	// 클래스 이름 출력
	}

}

class I_Car {}
class I_FireEngine extends I_Car {}

/**	실행결과 
 * this is a FireEngine instance.
 * this is a Car instance.
 * this is an Object instance.
 * polymorphism.I_FireEngine
 **/