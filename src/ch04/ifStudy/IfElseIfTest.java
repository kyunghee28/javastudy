package ch04.ifStudy;

public class IfElseIfTest {
    public static void main(String[] args){
        int age = 12;
        int charge;

        if(age < 8) {
            charge = 1000;
            System.out.println("미취학 아동입니다.");
        } else if(age < 14) {
            charge = 2000;
            System.out.println("초등학생입니다.");
        } else if(age < 20) {
            charge = 2500;
            System.out.println("중.고등학생입니다..");
        }  else {
            charge = 3000;
            System.out.println("성인입니다.");
        }
        System.out.println("입장료는 " + charge + "원 입니다.");
    }
}
// 결과확인
/*
초등학생입니다.
입장료는 2000원 입니다.
*/