// 변수 초기화 - 초기화 블럭

class BlockTest {
	
	static {	
		// 클래스 초기화 블럭
		System.out.println("static { } ");
	}
	
	{	
		// 인스턴스 초기화 블럭
		System.out.println(" { } ");	
	}
	
	public BlockTest() {
		System.out.println("생성자");
	}
	
	public static void main(String[] args) {
		System.out.println("BlockTest bt = new BlockTest(); ");
		BlockTest bt = new BlockTest();
		
		System.out.println("BlockTest bt2 = new BlockTest(); ");
		BlockTest bt2 = new BlockTest();
	}
}

// main메서드가 수행되어 BlockTest 인스턴스가 생성되면서 인스턴스 초기화 블럭이 먼저 수행된 후 생성자가 수행
/** 실행결과
 * 	
 * static { } 
 * BlockTest bt = new BlockTest(); 
 *  { } 
 * 생성자
 * BlockTest bt2 = new BlockTest(); 
 *  { } 
 * 생성자
 * 
 * */

