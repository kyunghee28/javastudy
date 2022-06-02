package Calendar_Date;
import java.util.Calendar;

// add 과 roll

public class CalendarEx4 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        date.set(2021, 7, 31);  // 2021년 8월 31일
        System.out.println(toString(date));

        System.out.println("= 1일 후 =");
        date.add(Calendar.DATE ,1);
        System.out.println(toString(date));

        System.out.println("= 6달 전 =");
        date.add(Calendar.MONTH ,-6);
        System.out.println(toString(date));

        System.out.println("= 31일 후(roll) =");
        date.roll(Calendar.DATE ,31);
        System.out.println(toString(date));

        System.out.println("= 31일 후(add) =");
        date.add(Calendar.DATE ,31);
        System.out.println(toString(date));
    }

    public static String toString(Calendar date){
        return date.get(Calendar.YEAR) + "년 "
                + ( date.get(Calendar.MONTH) + 1 ) + "월 " + date.get(Calendar.DATE) + "일 ";
    }
}

// add 메서드로 날짜 필드의 값을 31만큼 증가시켰다면 다음 달로 넘어가므로 월 필드로 1 증가하지만,
//roll메서드는 월 필드의 값은 변하지 않고 일 필드의 값만 변경된다.

/* 실행결과
2021년 8월 31일
= 1일 후 =
2021년 9월 1일
= 6달 전 =
2021년 3월 1일
= 31일 후(roll) =
2021년 3월 1일
= 31일 후(add) =
2021년 4월 1일

*/
