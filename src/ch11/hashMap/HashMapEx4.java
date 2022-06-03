package hashMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HashMapEx4 {
	
	public static void main(String[] args) {
		String[] data = {"A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D"};
		HashMap map = new HashMap();
		
		for(int i = 0 ; i< data.length ; i++) {
			if(map.containsKey(data[i])) {	// HashMap에 같은 문자열이 키로 저장되어 있는지 containsKey로 확인
				// 이미 저장ㄷ하오 았눈 문자열인경우 +1
				Integer value = (Integer) map.get(data[i]);
				map.put(data[i], new Integer(value.intValue() + 1));	
			} else {
				map.put(data[i], new Integer(1));
			}
		}
		
		Iterator it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			int value = ((Integer) entry.getValue()).intValue();
			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
		}
		
	}
	
	public static String printBar(char ch, int value) {
		char[] bar = new char[value];
		for(int i = 0 ; i < bar.length ; i++) {
			bar[i] = ch;
		}
		return new String(bar);
	}
	
}

// 결과확인
/*
A : ### 3
D : ## 2
Z : # 1
K : ###### 6

 * 
 */
