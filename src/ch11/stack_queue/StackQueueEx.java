package stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {

	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList();	// Queue인터페이스의 구현체인 LinkedList 사용
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");		
		q.offer("1");		
		q.offer("2");		
		
		System.out.println("= Stack =");
		while (!st.empty()) {
			System.out.println(st.pop()); // Stack의 맨 위에 저장된 객체를 꺼낸다.
		}
		
		System.out.println("= Queue =");
		while (!q.isEmpty()) {
			System.out.println(q.poll());	// Queue 에서 객체를 꺼내서 반환, 비어있으면 null반환
		}	
	}
}
// 결과확인
/*
 = Stack =
2
1
0
= Queue =
0
1
2
 */
