package DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatEx1 {

	public static void main(String[] args) {
		Date today = new Date();
		
		SimpleDateFormat sdf1, sdf2, sdf3, sdf4; 
		SimpleDateFormat sdf5, sdf6, sdf7, sdf8, sdf9;
		
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		sdf2 = new SimpleDateFormat("''yy년 MM dd일 E요일");
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:MM:ss.SSS");
		sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:MM:ss a");
		
		sdf5 = new SimpleDateFormat("오늘은 올 해의 D번쨰 날입니다.");
		sdf6 = new SimpleDateFormat("오늘은 이 달의 d번쨰 날입니다.");
		sdf7 = new SimpleDateFormat("오늘은 올 해의 w번쨰 주입니다.");
		sdf8 = new SimpleDateFormat("오늘은 이 달의 W번쨰 주입니다.");
		sdf9 = new SimpleDateFormat("오늘은 이 달의 F번쨰 E요일입니다.");
		
		System.out.println(sdf1.format(today));
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
		System.out.println(sdf5.format(today));
		System.out.println(sdf6.format(today));
		System.out.println(sdf7.format(today));
		System.out.println(sdf8.format(today));
		System.out.println(sdf9.format(today));
		

	}
}

/* 실행결과
2022-06-02
'22년 06 02일 목요일
2022-06-02 09:06:52.974
2022-06-02 09:06:52 오전
오늘은 올 해의 153번쨰 날입니다.
오늘은 이 달의 2번쨰 날입니다.
오늘은 올 해의 23번쨰 주입니다.
오늘은 이 달의 1번쨰 주입니다.
오늘은 이 달의 1번쨰 목요일입니다.

*/
