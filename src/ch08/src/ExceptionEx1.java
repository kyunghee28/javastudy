package src;

public class ExceptionEx1 {
	// 0 으로 나누려고 할 때  ArithmeticException 이 발생
	// ArithmeticException 은 산술 연산 과정에서 오류가 있을 떄 발생
	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		
		try {
			for(int i = 0 ; i < 10 ; i++) {
				result = number / (int) (Math.random() * 10 );
				System.out.println(result);
			}
		} 	catch(ArithmeticException e) {	
			System.out.println("0");
		}
		
		
	}

}
