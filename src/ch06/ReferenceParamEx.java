package ch06;

class RData{
    int x;
}

class ReferenceParamEx {
    public static void main(String [] args) {
        RData d = new RData();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d);
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x);
        /*
         *  change 메서드의 매개변수가 참조형이라서
         *  값이 아니라 값이 저장된 주소를 change 메서드에 넘겨주었기 떄문에
         * 값을 읽어오는 것 뿐만 아니라 변경하는 것도 가능
         * */

    }

    static void change(RData d){ // 기본형 매개변수
        d.x = 1000;
        System.out.println("change() : x = " + d.x);
    }

}

/** 실행 결과
 * main() : x = 10
 * change() : x = 1000
 * After change(d)
 * main() : x = 1000
 **/