package ch10;

import java.util.Calendar;

public class CalendarEx1 {
    public static void main(String[] args) {
        // 기본적으로 현재날짜와 시간으로 설정된다.
        Calendar today = Calendar.getInstance();
        System.out.println("이 해의 년도 : " + today.get(Calendar.YEAR));
        System.out.println("월(0~11, 0:1월) : " + today.get(Calendar.MONTH));
        System.out.println("이 해의 몇 째주 : " + today.get(Calendar.WEEK_OF_YEAR));
        System.out.println("이 해의 몇 째주 : " + today.get(Calendar.WEEK_OF_MONTH));

        // DATE 와 WEEK_OF_MONTH 는 같다.
        System.out.println("이 달의 몇 일 : " + today.get(Calendar.DATE));
        System.out.println("이 달의 몇 일 : " + today.get(Calendar.DAY_OF_MONTH));
        System.out.println("이 해의 몇 일 : " + today.get(Calendar.DAY_OF_MONTH));
    }
}
