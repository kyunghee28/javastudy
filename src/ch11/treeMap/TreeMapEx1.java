package treeMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx1 {

	public static void main(String[] args) {
		String[] data = {"A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D"};
		TreeMap map = new TreeMap();
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
		
		System.out.println("= 기본정렬 =");
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			int value = ((Integer) entry.getValue()).intValue();
			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
		}
		
		System.out.println();
		
		//map 을 ArrayList로 변환한 다음에 Collections.sort()로 정렬
		Set set = map.entrySet();
		List list = new ArrayList(set); // ArrayList(Collections c)
		
		// static void sort(List list, Collections c)	
		Collections.sort(list, new ValueComparator());	// 내림차순으로 정렬
		
		it = list.iterator();
		
		System.out.println("= 값의 크기가 큰 순서로 정렬 =");
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			int value = ((Integer) entry.getValue()).intValue();
			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
		}

	}
	
	static class ValueComparator implements Comparator{
		public int compare(Object o1, Object o2) {
			if(o1 instanceof Map.Entry && o2 instanceof Map.Entry) {
				Map.Entry e1 = (Map.Entry)o1;
				Map.Entry e2 = (Map.Entry)o2;
				
				int v1 = ((Integer) e1.getValue()).intValue();
				int v2 = ((Integer) e2.getValue()).intValue();
				
				return v2-v1;
			}
			return -1;
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

// 결과 확인
/*
= 기본정렬 =
A : ### 3
D : ## 2
K : ###### 6
Z : # 1

= 값의 크기가 큰 순서로 정렬 =
K : ###### 6
A : ### 3
D : ## 2
Z : # 1
*/
