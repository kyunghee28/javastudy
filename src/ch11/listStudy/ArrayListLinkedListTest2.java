package listStudy;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

// ArrayList 와 LinkedList 비교
public class ArrayListLinkedListTest2 {
	public static void main(String[] args) {

		ArrayList al = new ArrayList(1000000);
		LinkedList ll = new LinkedList();
		add(al);
		add(ll);
		
		System.out.println("= 접근시간 테스트 =");
		System.out.println("ArrayList : " + access(al));
		System.out.println("LinkedList : " + access(ll));
	}
	
	public static void add(List list) {		
		for(int i=0; i<100000; i++) list.add(i+"");
	}
	
	public static long access(List list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<10000; i++) list.get(i);
		long end = System.currentTimeMillis();
		return end - start;
	}
}
// LinkedList 는 저장해야하는 데이터의 개수가 많아질 수록 데이터를 읽어오는 시간(접근시간)이 길어진다는 단점이 있다.
