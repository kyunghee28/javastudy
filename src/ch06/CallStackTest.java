package ch06;

// 객체를 생성하지 않고도 메소드를 호출할 수 있으려면, 메서드 앞에 static 을 붙여야 한다.
public class CallStackTest {
    public static void main(String [] args) {
        // static메서드는 객체 생성없이 호출가능
        firstMethod();
    }

    static void firstMethod(){
        secondMethod();
    }

    static void secondMethod(){
        System.out.println("secondMethod()");
    }
}
