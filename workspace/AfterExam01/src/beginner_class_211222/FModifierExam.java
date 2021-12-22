package beginner_class_211222;

/* 접근제어자: public, protected, (default), private / (일반)제어자: static, final, abstract 등등
 * - 접근제어자는 한번에 네가지 중 하나만 선택하여 사용할 수 있다.
 * 
 * static:
 * '클래스의 ...', '공통적인...' 의 의미를 가진다.
 * 객체변수는 객체들마다의 고유한 값을 따로 유지하지만 static은 객체에 관계없이 같은 값을 유지한다.
 * 하나의 변수를 모든 객체가 공유한다.
 * 
 * final:
 * '마지막의...', '변경될 수 없는...'의 의미를 가진다.
 * final이 선언된 변수는 그 값을 변경할 수 없는 상수가된다.
 * final이 선언된 매서드는 오버라이딩을 할 수 없게 된다.
 * final이 선언된 클래스는 상속을 허용하지 않는다.
 * ex) final class / FinalTest 등은 조상이 될 수 없는 클래스
 * final int Max = 10; 값을 변경할 수 없는 변수(상수)
 * final void getMaxSize() //오버라이딩 금지 매서드
 * 
 * 
 * public > protected > (default) > private
 * private: 같은 클래스 안에서만 접근이 가능하다.
 * default: 같은 패키지 내에서만 접근이 가능하다.
 * protected: 같은 패키지 내에서 그리고 다른 패키지 자손 클래스에서 접근 가능
 * public: 접근 제한이 전혀 없다.
 * 
 * 만약 매서드 하나를 변경해야 할 때,
 * - 이 매서드의 접근제어자가 public이라면, 매서드를 변경한 후에 오류가 없는지 테스트해야 하는 범위가 아주 크다.
 * - 이 매서드의 접근제어자가 default라면, 패키지 내부에서만 접근이 가능하므로 패키지 내의 클래스만 테스트하면 된다.
 * - 이 매서드의 접근제어자가 private라면, 해당 클래스만 확인해보면 된다.
 * 따라서 접근제어자 하나로 상당한 차이를 만들 수 있으므로, 접근제어자를 적절하게 선택하여 접근범위최소화를 위해 노력하자.
 * 
 * 
 * 생성자의 접근제어자
 * - 생성자의 접근제어자를 사용하면 객체 생성을 제한할 수 있다.
 * - 생성자에 private을 지정하면 외부에서 생성자에 접근할 수 없다. 클래스 내부에서만 객체를 생성할 수 있다.
 * 
 */

public class FModifierExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
