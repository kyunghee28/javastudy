package ch06;

// x의 1제곱 부터 x의 n제곱 까지 구하는 예제
// 재귀호출을 사용하여 x의 n제곱을 구하는 power() 사용
public class PowerTest {
    public static void main(String [] args) {
        int x = 2;
        int n = 5;
        long result = 0;

        for(int i = 1 ; i <= n ; i++) {
            result += power(x,i);
        }
        System.out.println(result);
    }

    static long power(int x , int i) {
        if(i==1){
            return x;
        }
        return x * power(x, i-1);
    }
}

/* 실행결과
*  62
* */