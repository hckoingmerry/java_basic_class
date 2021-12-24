package beginner_class_211223;

/* (선생님도 오류 못 찾으심)
interface Repairable {}

class Unit {
	int hitPoint;
	final int MAX_HP;
	Unit(int hp) {
		MAX_HP = hp;
	}
}
class GroundUnit extends Unit {
	GroundUnit(int hp) {
		super(hp);
	}
}
class AirUnit extends Unit {
	AirUnit(int hp) {
		super(hp);
	}
}
class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150);
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "Tank";
	}
}
class Dropship extends AirUnit implements Repairable {
	Dropship() {
		super(125);
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "Dropship";
	}
}
class Marine extends GroundUnit {
	Marine() {
		super(40);
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "Marine";
	}
}
class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(60);
		hitPoint = MAX_HP;
	}
	void repair(Repairable r) {
		if (r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString() + "의 수리가 끝났습니다.");
		}
	}
}


public class CRepairableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		scv.repair(tank); //implements repairable로 위에서 연결해놨기 때문에 가능한 것
		scv.repair(dropship);
		//scv.repair(marine); //얘는 위에서 연결 안해놔서 에러 발생
	}
}
*/