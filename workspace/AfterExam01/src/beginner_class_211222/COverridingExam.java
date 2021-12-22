package beginner_class_211222;


/* 오버라이딩(Overriding):
 * 조상클래스로부터 상속받은 메서드의 내용을 변경하여 '동일한' 이름으로 자식클래스에 만다는 것
 * 
 * 특징
 * 1. 부모의 매서드 이름과 동일한 이름을 사용한다.
 * 2. 부모의 매서드에 있는 매개변수와 같은 형과 개수를 사용한다.
 * 3. 부모의 매서드에 있는 반환타입과도 동일하다.
 * 
 * 오버로딩과 오버라이딩은 단어가 비슷해서 혼동을 일으키기 쉽다.
 * 1. 오버로딩은 기존에 없는 새로운 매서드를 정의하는 것(new)
 * 2. 오버라이딩은 상속받은 매서드의 내용을 변경하는 것(change, modify)
 * 
 * 
 * class Parent {
 * 		void parentMethod() {
 * 		}
 * }
 * Class Child extends Parent {
 * 		void parentMethod() {} //오버라이딩
 * 		void parentMethod(int i) {} //오버로딩
 * 
 * 		void childMethod() {}
 * 		void childMethod(int i) {}
 * 		void childMethod() {} //에러...중복정의
 * }
 */
public class COverridingExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
