package interfaceStudy;

interface Repairable{}
class R_Unit {
	int hitPoint;
	final int MAX_HP;
	R_Unit(int hp) {
		MAX_HP = hp;
	}
}

class GroundUnit extends R_Unit {
	public GroundUnit(int hp) {
		super(hp);	// R_Unit(int hp)
	}
}

class AirUnit extends R_Unit {
	public AirUnit(int hp) {
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable {
	Tank(){
		super(150);		// Tank의 HP는 150
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "Tank";
	}
}

class Dropship extends AirUnit implements Repairable {
	Dropship(){
		super(125);		// Dropship의 HP는 125
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "Dropship";
	}
} 

class Marine extends GroundUnit {
	Marine(){
		super(40);	
		hitPoint = MAX_HP;
	}
} 

class SCV extends GroundUnit implements Repairable {
	SCV(){
		super(60);	
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) {
		if(r instanceof R_Unit) {
			R_Unit u = (R_Unit) r;
			while(u.hitPoint != u.MAX_HP ) {
				u.hitPoint++; // R_Unit의 HP 증가
			}
			System.out.println(u.toString() + "의 수리가 끝났습니다.");
		}
	}
} 
class RepairableTest {
	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		scv.repair(tank);
		scv.repair(dropship);
	//	scv.repair(marine); // 에러 
	}
}
