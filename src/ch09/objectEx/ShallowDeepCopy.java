package objectEx;

class Circle implements Cloneable {
	S_Point p; // 원형
	double r; // 반지름
	
	Circle(S_Point p, double r){
		this.p = p;
		this.r = r;
	}
	
	public Circle ShallowCopy() {	// 얕은 복사
		Object obj = null;
		try {
			obj = super.clone();	
		}catch (CloneNotSupportedException e) {}
		
		return (Circle) obj;	
	}
	
	public Circle deepCopy() {	// 깊은 복사
		Object obj = null;
		try {
			obj = super.clone();	
		}catch (CloneNotSupportedException e) {}
		
		Circle c = (Circle) obj;	
		c.p = new S_Point(this.p.x, this.p.y);
		
		return c;	
	}
	
	public String toString() {
		return "[ p="+ p + ", r=" + r +"]";
	}
}

class S_Point {	
	int x, y;
	
	S_Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x=" + x + ", y =" + y;
	}
}
public class ShallowDeepCopy {
	public static void main(String[] args) {
		Circle c1 = new Circle(new S_Point(1, 1), 2.0);
		Circle c2 = c1.ShallowCopy();
		Circle c3 = c1.deepCopy();
		
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		System.out.println("c3="+c3);
		
		c1.p.x = 9;
		c1.p.y = 9;
		
		System.out.println("= c1의 변경 후 =");
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		System.out.println("c3="+c3);	
	}
}

// 실행결과
/*
c1=[ p=x=1, y =1, r=2.0]
c2=[ p=x=1, y =1, r=2.0]
c3=[ p=x=1, y =1, r=2.0]
= c1의 변경 후 =
c1=[ p=x=9, y =9, r=2.0]
c2=[ p=x=9, y =9, r=2.0]
c3=[ p=x=1, y =1, r=2.0]
*/

