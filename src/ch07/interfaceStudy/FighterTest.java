package interfaceStudy;

class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if(f instanceof Unit) {
			System.out.println("f는 Unit 클래스의 자손입니다.");
		}
		if(f instanceof Fightable) {
			System.out.println("f는 Fightable 인터페이스를 구현하였습니다.");
		}
		if(f instanceof Movable) {
			System.out.println("f는 Movable 인터페이스를 구현하였습니다.");
		}
		if(f instanceof Attackable) {
			System.out.println("f는 Attackable 인터페이스를 구현하였습니다.");
		}
		if(f instanceof Object) {
			System.out.println("f는 Object 클래스의 자손입니다.");
		}		
	}
}

class Unit {
	int currentHP;	// 유닛의 체력
	int x;			// 유닛의 위치(x좌표)
	int y;			// 유닛의 위치(y좌표)
}

interface Movable {	void move(int x, int y); }
interface Attackable {	void attack(Unit u); }
interface Fightable extends Movable, Attackable {}

class Fighter extends Unit implements Fightable {
	public void move(int x, int y) {
		// TODO Auto-generated method stub		
	}
	public void attack(Unit u) {
		// TODO Auto-generated method stub		
	}
}

//Fighter클래스는  Unit클래스로부터 상속받고 Fightable 인터페이스만 구현했지만
//Unit클래스는 object 클래스의 자손이고
//Fightable 인터페이스는 Movable과 Attackable 인터페이스의 자손이므로 
//Fighter클래스는 이 모든 클래스와 인터페이스의 자손이다.

/**	실행결과

f는 Unit 클래스의 자손입니다.
f는 Fightable 인터페이스를 구현하였습니다.
f는 Movable 인터페이스를 구현하였습니다.
f는 Attackable 인터페이스를 구현하였습니다.
f는 Object 클래스의 자손입니다.

 **/

