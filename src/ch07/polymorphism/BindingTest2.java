package polymorphism;

class BindingTest2 {
	public static void main(String[] args) {
		Parent2 p = new Child2();
		Child2 c = new Child2();
		
		System.out.println("p.x = " + p.x);
		p.method();
		
		System.out.println("c.x = " + c.x);
		c.method();
	}
}

class Parent2 {
	int x = 100;
	void method() {
		System.out.println("Parent Method");
	}
}

class Child2 extends Parent2 {
	
}

/* * 실행 결과
 * 	p.x = 100
 * 	Parent Method
 * 	c.x = 100
 * 	Parent Method
 * */
