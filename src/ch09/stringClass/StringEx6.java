package stringClass;

// substring메서드를 이용하여 한 문자열에서 내용의 일부를 추출하는 예
public class StringEx6 {
	public static void main(String[] args) throws Exception {
		String fullName = "Hello. java";
		
		// fullName에서 '.'의 위치를 찾는다.
		int index = fullName.indexOf('.');
		
		// fullName의 첫번쨰 글자부터 '.'이 있는 곳까지 문자열을 추출한다
		String fileName = fullName.substring(0, index);
		
		// '.'의 다음 문자부터 시작해서 문자열의 끝까지 추출한다.
		// fullName.substring(index + 1, fullName.length()); 의 결과와 같다.
		String ext = fullName.substring(index + 1);
		
		System.out.println(fullName + "의 확장자를 제외한 이름은 " + fileName);
		System.out.println(fullName + "의 확장자는 " + ext
				);
		
	}
}

// 실행결과
/*
Hello. java의 확장자를 제외한 이름은 Hello
Hello. java의 확장자는  java
*/