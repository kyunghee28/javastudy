package ch10.Calendar_Date;
import java.util.Calendar;

// 첫주와 마지막 주가 이전달,이후달과 연결되도록
public class CalendarEx7 {
    public static void main(String[] args) {
        String[] str = {"2022","5"};
        ex7(str);
    }

    static void  ex7(String[] args) {
        if(args.length != 2){
            System.out.println("Usage : java CalendarEx7");

            return;
        }

        int year = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);

        Calendar sDay = Calendar.getInstance(); // 시작일
        Calendar eDay = Calendar.getInstance(); // 끝일

        sDay.set(year, month-1, 1); // 입력월의 1일로 설정한다.
        eDay.set(year, month-1, sDay.getActualMaximum(Calendar.DATE));// 입력월의 말일로 설정한다.

        // 1일이 속한 주의 일요일로 날짜 설정
        sDay.add(Calendar.DATE, -sDay.get(Calendar.DAY_OF_WEEK) + 1);

        // 말일이 속한 주의 토요일로 날짜 설정
        eDay.add(Calendar.DATE, 7 - eDay.get(Calendar.DAY_OF_WEEK));

        System.out.println("     " + args[0] + "년 " + args[1] + "월");
        System.out.println(" 일 월 화 수 목 금 토");

        // 시작 일부터 마지막 일까지(sDay <= eDay) 1일씩 증가시키면서 일(Calendar.DATE)을 출력
        for(int n = 1 ; sDay.before(eDay) || sDay.equals(eDay) ; sDay.add(Calendar.DATE, 1)){
            int day = sDay.get(Calendar.DATE);
            System.out.print((day < 10) ? "  " + day : " " + day);
            if(n++ % 7==0) System.out.println();  // 7치를 찍고나서 줄을 바꾼다.
        }
    }

}

/* 실행결과
     2022년 5월
 일 월 화 수 목 금 토
  1  2  3  4  5  6  7
  8  9 10 11 12 13 14
 15 16 17 18 19 20 21
 22 23 24 25 26 27 28
 29 30 31  1  2  3  4
*/
