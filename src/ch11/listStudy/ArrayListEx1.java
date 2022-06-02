package listStudy;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);
		
		// list1 과 list2 를 정렬한다.
		Collections.sort(list1);		
		Collections.sort(list2);
		print(list1, list2);
		
		// list1이 list2의 모든 요소를 포함하고 있을 때 true
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		print(list1, list2); 
		
		list2.add(3, "AA");
		print(list1, list2); 
		
		// list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
		print(list1, list2);
		
		// list2에서 list1에 포함된 객체들을 삭제한다.
		// 변수 i를 증가시키면서 삭제하면, 한 요소가 삭제될 때마다 빈 공간을 채우기 위해 나머지 요소들이 자리이동을 하기 떄문에 올바른 결과를 얻을 수 없다.
		for(int i =list2.size() -1 ; i >= 0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
	}
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();
	}
}

// 결과확인
/*
list1:[5, 4, 2, 0, 1, 3]
list2:[4, 2, 0]

list1:[0, 1, 2, 3, 4, 5]	<- Collections.sort(list1) 를 사용해서 정렬하였다.
list2:[0, 2, 4]

list1.containsAll(list2) : true 	<- list1이 list2의 모든 요소를 포함하고 있을 떄만 true
list1:[0, 1, 2, 3, 4, 5]
list2:[0, 2, 4, A, B, C]			<- add(Object obj) 를 이용해서 새로운 객체를 저장

list1:[0, 1, 2, 3, 4, 5]
list2:[0, 2, 4, AA, A, B, C]		<- set(int index, Object obj)를 이용해서 다른 객체로 변경

list1.retainAll(list2) : true		<- retainAll에 의해 list1에 변화가 있었으므로 true를 반환
list1:[0, 2, 4]						<- list2와의 공통요소 이외에는 모두 삭제되었다. 
list2:[0, 2, 4, AA, B, C]

list1:[0, 2, 4]
list2:[AA, A, B, C]

*/