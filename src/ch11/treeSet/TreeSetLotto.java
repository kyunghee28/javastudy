package treeSet;
import java.util.*;
public class TreeSetLotto {

	public static void main(String[] args) {
		Set set = new TreeSet();
		for(int i = 0 ; set.size() < 6 ; i++) {
			int num = (int) (Math.random() * 45) +1;
			set.add(num); // TreeSet 은 저장할 때 이미 정렬하기 때문에 읽어올떄 따로 정렬할 필요가 없다.
		}
		System.out.println(set);
	}

}

