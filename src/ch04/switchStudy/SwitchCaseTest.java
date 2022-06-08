package ch04.switchStudy;

import java.util.Scanner;

public class SwitchCaseTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        int day;
        switch (month) { // break 를 써야 switch문을 빠져나간다.
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day = 31;
                break;
            case 4: case 6: case 9: case 11:
                day = 30;
                break;
            case 2:
                day = 28;
                break;


            default:
                System.out.println("존재하지 않는 달입니다.");
                day = -1;
        }

        System.out.println(month + "월은 " + day + "일 입니다.");
    }
}
// 결과확인
/*
10
10월은 31일 입니다.
*/