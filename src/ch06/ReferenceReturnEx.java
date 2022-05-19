package ch06;

public class ReferenceReturnEx {
    public static void main(String[] args){
        Data d = new Data();
        d.x = 10;

        Data d2 = copy(d);
        System.out.println("d.x = "+d.x);
        System.out.println("d2.x = "+d2.x);
    }

    // copy메서드는 새로운 객체를 생성한 다음에 매개 변수로 넘겨받은 객체에 저장된 값을 복사해서 반환
    static Data copy(Data d){
        Data tmp = new Data( );  // 새로운 tmp 생성
        tmp.x = d.x;            // d.x 의 값을 tmp.x에 복사
        return tmp;             // 복사한 객체의 주소를 반환
    }
}
