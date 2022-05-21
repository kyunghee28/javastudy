package ch06;

// 재귀호출
// 유효성 검사하는 코드를 추가해 메서드 factorial 의 매개변수 n이 음수거나 20보다 크면 -1반환
public class FactorialTest2 {

    public static void main(String [] args) {
        int n = 21;
        long result = 0;

        for(int i = 1 ; i <= n ; i++) {
            result = factorial(i);

            if(result == -1) {
                System.out.printf("유효하지 않은 값입니다. (0<n<=20) : %d%n", n);

                break;
            }

            System.out.printf("%2d!=%20d%n", i, result);
        }


    }

    static long factorial(int i) {
        // 매개변수 유효성 검사
        if(i<=0 || i >20){
            return -1;
        }
        if(i<=1){
            return 1;
        }
        return i * factorial(i-1);
    }
}
