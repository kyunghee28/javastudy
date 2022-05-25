package polymorphism;

class BindingTest3 {
	public static void main(String[] args) {
		Parent3 p = new Child3();
		Child3 c = new Child3();
		
		System.out.println("p.x = " + p.x);
		p.method();
		System.out.println();
		System.out.println("c.x = " + c.x);
		c.method();
	}
}

class Parent3 {
	int x = 100;
	void method() {
		System.out.println("Parent Method");
	}
}

class Child3 extends Parent3 {
	int x = 200;
	void method() {
		System.out.println("x=" + x);
		System.out.println("super.x=" + super.x);
		System.out.println("this.x=" + this.x);
	}
}

/* 실행 결과
p.x = 100
x=200
super.x=100
this.x=200

c.x = 200
x=200
super.x=100
this.x=200
*/
