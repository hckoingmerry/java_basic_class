package beginner_class_211221;

public class ConstructorExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
/* 생성자(Constructor)
* 생성자는 객체가 생성될 때 자동으로 제일 먼저 호출되는 '초기화 매서드'
* 따라서 객체 변수의 초기화 작업에 주로 사용된다.
* 웹개발에서도 게시물이나 사용자 정보들을 데이터베이스에서 가져와서 생성자를 통해 객체로 만들어 사용된다.
* 생성자도 결국 매서드이므로 오버로딩이 사용된다.
*/
		
/* 기본생성자(default contructor)
 * 생성자를 모르고도 클ㄹ래스를 통해서 객체를 생성해왔지만 사실 모든 클래스에서는 반드시 하나 이상의 생성자가 정의되어야만 한다.
 * 그러나 생성자를 정의하지 않고서도 사용할 수 있었던 이유는 기본 생성자 덕분이다.
 * 생성자가 하나도 정의되지 않은 경우에는 자바가 자동적으로 기본생성자를 하나 추가해주기 때문에 문제가 발생하지 않은 것이다.
 * 기본생성자는 매개변수도 없고 아무런 내용도 없고 리턴도 없는 아주 간단한 생성자를 말한다. 즉 이름뿐인 생성자를 기본생성자.
 * 
 * ex) class ConCarTest
 * 기본생성자
	 class Car {
		 Car() {
		 }
   매개변수가 있는 생성자
		 Car(String a, String b) {
			 color = a;
			 door = c;
		 }
   
*/