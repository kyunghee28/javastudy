package DateFormat;

import java.text.ChoiceFormat;

public class ChoiceFormatEx2 {

	public static void main(String[] args) {
		
		String pattern = "60#D|70#C|80<B|90#A";	// limit#value 의 형태, #은 경계값을 범위에 포함시킨다.
		int[] scores = {91,90,80,88,70,52,60};
		
		ChoiceFormat form = new ChoiceFormat(pattern);
		
		for(int i = 0 ; i < scores.length ; i++) {
			System.out.println(scores[i] + ":" + form.format(scores[i]));
		}
		

	}

}

/* 실행결과
91:A
90:A
80:C
88:B
70:C
52:D
60:D
*/