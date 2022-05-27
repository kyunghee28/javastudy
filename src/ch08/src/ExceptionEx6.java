package src;
// 메서드에 예외 선언하기
public class ExceptionEx6 {

	public static void main(String[] args) throws Exception {
		
		try {
			method1();	
		} 	catch(Exception e) {
			System.out.println("main 메서드에서 예외가 처리되었습니다.");
			e.printStackTrace();
		}
	}
	
	static void method1() throws Exception {
		throw new Exception();	
	}
}

// 예외가 발생한 메서드에서 예외를 처리하지 않고 호출한 메서드로 넘겨주면 
// 호출한 메서드에서는 method1()을 호출한 라인에서 예외가 발생한 것으로 간주되어 처리하게 된다.
