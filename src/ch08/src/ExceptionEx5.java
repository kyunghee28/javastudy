package src;
// 메서드에 예외 선언하기
public class ExceptionEx5 {

	public static void main(String[] args) throws Exception {
		method1();
	}
	
	static void method1() {
		try {
			throw new Exception();		
		} 	catch(Exception e) {
			System.out.println("method1메서드에서 예외가 처리되었습니다.");
			e.printStackTrace();
		}
	}
}

// 위와 같이 예외처리되면 호출한 메서드에서는 예외가 발생했다는 사실조차 모르게 된다.
