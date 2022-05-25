package modifier;

public class TimeTest {
	public static void main(String[] args) {
		Time t = new Time(12,35,30);
		System.out.println(t);
		
		// t.hour = 13;	// 에러! 변수 hour의 접근 제어자는 private이므로 접근 불가	- 메서드로 접근해야 한다.
		t.setHour(t.getHour() + 1);	// 현재 시간보다 1시간 후로 변경
		System.out.println(t);
	}
}

class Time {
	private int hour, minute, second;	
	
	Time(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public int getHour() {return hour;}
	public void setHour(int hour) {
		if(hour < 0 || hour > 23) return;
		this.hour = hour;
	}

	public int getMinute() {return minute;}
	public void setMinute(int minute) {
		if(minute < 0 || minute > 59) return;
		this.minute = minute;
	}

	public int getSecond() {return second;}
	public void setSecond(int second) {
		if(second < 0 || second > 59) return;
		this.second = second;
	}
	
	public String toString() {
		return hour + ":" + minute + ":" + second;  
	}
}

/*	출력결과
 * 
 * 12:35:30
 * 13:35:30
 * */
