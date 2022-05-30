package stringClass;

import java.util.StringJoiner;

public class StringEx4 {
	public static void main(String[] args) throws Exception {
		String str = "가";
		
		byte[] bArr = str.getBytes("UTF-8");	// 한 글자를 3byte로 표현
		byte[] bArr2 = str.getBytes("CP949");	// CP949는 2byte로 표현
		
		System.out.println("UTF-8 : " + joinByteArry(bArr));
		System.out.println("CP949 : " + joinByteArry(bArr2));
		
		System.out.println("UTF-8 : " + new String(bArr, "UTF-8"));
		System.out.println("CP949 : " + new String(bArr2, "CP949"));
	}
	
	static String joinByteArry(byte[] bArr) {
		StringJoiner sj = new StringJoiner(":","[","]");
		
		for(byte b : bArr)
			sj.add(String.format("%02X", b));
		
		return sj.toString();
	}
}

// 실행결과
/*
UTF-8 : [EA:B0:80]
CP949 : [B0:A1]
UTF-8 : 가
CP949 : 가
*/