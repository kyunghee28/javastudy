package DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//Calendar인스턴스를 Date인스턴스로 변환하는 방법을 보여주는 예제
public class DateFormatEx2 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(2021, 9, 3);	// 2021년 10월 3일 - month 는 0~11범위를 가진다.
		
		Date day = cal.getTime();	// Calendar를 Date로 변환
		
		SimpleDateFormat sdf1, sdf2, sdf3, sdf4; 
		
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		sdf2 = new SimpleDateFormat("''yy년 MM dd일 E요일");
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:MM:ss.SSS");
		sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:MM:ss a");
		
		System.out.println(sdf1.format(day));
		System.out.println(sdf2.format(day));
		System.out.println(sdf3.format(day));
		System.out.println(sdf4.format(day));
	}
}

/* 실행결과
2021-10-03
'21년 10 03일 일요일
2021-10-03 09:10:46.720
2021-10-03 09:10:46 오전
*/
