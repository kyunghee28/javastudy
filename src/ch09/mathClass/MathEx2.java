package mathClass;
import static java.lang.Math.*;
import static java.lang.System.*;

class MathEx2 {
	public static void main(String[] args) {
		int i = Integer.MIN_VALUE;
		
		out.println("i = " + i);
		out.println("-i = " + (-i));
		
		try {
			out.printf("negateExact(%d)=%d%n", 10, negateExact(10));
			out.printf("negateExact(%d)=%d%n", -10, negateExact(-10));
			out.printf("negateExact(%d)=%d%n", i, negateExact(i));	// 예외발생
		} catch (ArithmeticException e) {
			// i를 long 타입으로 형변환 다음에 negateExact(long a)를 호출
			out.printf("negateExact(%d)=%d%n", (long)i , negateExact((long)i));
		}
	}
}

// 실행결과
/*
i = -2147483648
-i = -2147483648
negateExact(10)=-10
negateExact(-10)=10
negateExact(-2147483648)=2147483648
*/