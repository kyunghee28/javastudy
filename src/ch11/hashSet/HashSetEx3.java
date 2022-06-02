package hashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx3 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Person3("David", 10));
		set.add(new Person3("David", 10));
		
		System.out.println(set);
	}

}

class Person3{
	String name;
	int age;
	
	Person3(String name, int age){
		this.name = name;
		this.age = age;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Person3) {
			Person3 tmp = (Person3)obj;
			return name.equals(tmp.name) && age == tmp.age; // name과 age 가 서로 같으면 true
		}
		return false;
	}
	public int hashCode() {
		return (name + age).hashCode();
	}
	public String toString() {
		return name + ":" + age;
	}
}

// 결과확인
// [abc, David:10]
