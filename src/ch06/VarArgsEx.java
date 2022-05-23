// 가변인자 오버로딩
class VarArgsEx {

	public static void main(String[] args) {
		String[] strArr = {"100", "200", "300"};
		
		// concatenate 메서드는 매개변수로 가변인자를 선언했으므로 문자열 개수의 제약없이 매개변수로 지정할 수 있다.
		System.out.println(concatenate("", "100", "200", "300"));
		System.out.println(concatenate("-", strArr));
		System.out.println(concatenate(",", new String[]{"1", "2", "3"}));
		System.out.println("["+concatenate(",", new String[0])+"]");
		System.out.println("["+concatenate(",")+"]");
		
	}
	
	static String concatenate(String delim, String... args) {
		String result = "";
		
		for(String str : args) {
			result += str + delim;
		}
		return result;
	}
}

/**	
 * 실행 결과
 * 
 * 100200300
 * 100-200-300-
 * 1,2,3,
 * []
 * []
 * 
 **/