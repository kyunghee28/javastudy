

// 기본 생성자

class Data1 {
	int value;
}

class Data2 {
	int value;
	
	Data2(int x){	// 매개변수가 있는 생성자
		value = x;
	} 
}

class ConstructorTet {
	public static void main(String[] args) {
		Data1 d1 = new Data1();
		Data2 d2 = new Data2(3);
		
		// Data2 d2 = new Data2(); // compile error 발생
		// Data2에 생성자 Data2() 가 정이되어 있지 않기 떄문에 에러 발생
	}
}

