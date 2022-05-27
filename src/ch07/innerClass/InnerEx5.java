package innerClass;

class Outer5 {
	int value = 10; // Outer5.this.value
	
	class Inner {
		int value = 20;	// this.value
		
		void method1() {
			int value = 30;
			
			// 내부 클래스와 외부 클래스에 선언된 변수 이름이 같을 떄 
			// 변수 앞에 'this' 또는 '외부 클래스명.this'를 붙여서 서로 구별할 수 있다는 것을 보여준다.
			
			System.out.println("            value : " + value);
			System.out.println("       this.value : " + this.value);
			System.out.println("Outer5.this.value : " + Outer5.this.value);
		}
	}
	
}

class InnerEx5 {	
	public static void main(String[] args) {

		Outer5 outer = new Outer5();
		Outer5.Inner inner = outer.new Inner();
		inner.method1();
	}
}

/*
 * 실행결과 
            value : 30
       this.value : 20
Outer5.this.value : 10
 */
