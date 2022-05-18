package ch06;

class Data{
    int x;
}

class PrimitiveParamEx {
    public static void main(String [] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);
        // d.x 의 값이 변경된 것이 아니라 change 메소드의 매개변수 x 의 값이 변경된 것이다.
    }

    static void change(int x){ // 참조형 매개변수
        x = 1000;
        System.out.println("change() : x = " + x);
    }

}

/** 실행 결과
 * main() : x = 10
 * change() : x = 1000
 * After change(d.x)
 * main() : x = 10
 **/