package Calendar_Date;
import java.util.Calendar;

// add 과 roll
// 일 필드가 말일 일 때는 roll 메서드를 이용해서 월 필드를 변경하면 일 필드에 영향을 미칠 수 있다.
public class CalendarEx5 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        date.set(2022, 0, 31);  // 2022년 1월 31일
        System.out.println(toString(date));

        date.roll(Calendar.MONTH ,1);
        System.out.println(toString(date));
    }

    public static String toString(Calendar date){
        return date.get(Calendar.YEAR) + "년 "
                + ( date.get(Calendar.MONTH) + 1 ) + "월 " + date.get(Calendar.DATE) + "일 ";
    }
}
// 2월에는 31일이 없기 때문에 2월의 말일인 28일로 자동 변경되었다.
/* 실행결과
2022년 1월 31일
2022년 2월 28일
*/
