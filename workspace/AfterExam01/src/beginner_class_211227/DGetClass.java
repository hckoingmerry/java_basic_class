package beginner_class_211227;

/* 자신이 속한 클래스의 class객체를 반환하는 메서드
 * class객체는 클래스의 모든 정보를 담고 있다. 클래스파일이 메모리에 올라갈 때 자동으로 생성된다.
 */
final class Kard {
	String kind;
	int num;
	
	Kard() {
		this("SPADE", 1);
	}
	
	Kard(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}
	
	public String toString() {
		return kind + ":" + num;
	}
}

public class DGetClass {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Kard c = new Kard("HEART", 3);
		Kard c2 = Kard.class.newInstance();
		
		System.out.println(c);
		System.out.println(c2);
	}

}
