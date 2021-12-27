package beginner_class_211227;

/* equals: 문자열을 비교하여 그 결과를 boolean값으로 알려준다.
 * 
 */

public class AEqualsExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* ex)
		String a = "password"; //사용자로부터 키보드로 입력받은 비번
		String b = "password"; //회원가입 시 DB에 저장된 비번
		if (a.contentEquals(b)) {
			System.out.println("비번이 일치합니다. 로그인 허용");
		} else {
			System.out.println("잘못된 비번입니다. 다시 입력하세요.");
		}
		*/
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
		if (p1 == p2) {
			System.out.println("p1과 p2는 같은 사람입니다.");
		} else {
			System.out.println("p1과 p2는 다른 사람입니다.");
		}
		if (p1.equals(p2)) {
			System.out.println("p1과 p2는 같은 사람입니다.");
		}
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = "abc";
		
		System.out.println(str1.contentEquals(str2));
		System.out.println(str1.contentEquals(str3));;
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
	}

}

class Person {
	long id;
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			return id == ((Person)obj).id;
			//obj가 Object타입이므로 id값을 참조하기 위해서는 Person타입으로 형변환이 필요하다.
		} else {
			return false; //타입이 Person이 아니면 값을 빅할 필요 없다.
		}
	}
	Person(long id) {
		this.id = id;
	}
}