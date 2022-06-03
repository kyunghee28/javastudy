package hashMap;

import java.util.HashMap;
import java.util.Scanner;

// HashMap을 생성하고 사용자 ID, PW를 key, value로 저장.
// 사용자 ID를 키로 HashMap 검색해서 얻은 값을 입력된 pw 와 비교하는 예제
public class HashMapEx1 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myID", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 pw를 입력해주세요.");
			System.out.print("id : ");
			String id = s.nextLine().trim();
			
			System.out.print("pw : ");
			String pw = s.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			} else {
				if(!(map.get(id).equals(pw))) {
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
				} else {
					System.out.println("id와 비밀번호가 일치합니다.");
					break;
				}
			}
			
		}
		
	}

}
