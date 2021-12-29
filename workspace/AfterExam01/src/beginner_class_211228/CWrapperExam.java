package beginner_class_211228;

public class CWrapperExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* 포장클래스(Wrapper Class)
 * 매개변수로 객체를 요구할 때, 기본형 값이 아닌 객체에 저장할 때, 객체간의 비교가 필요할 때 등
 * 기본형 값을 객체 형태로 다룰 수 있다.
 * 
 * 8개의 기본형을 대표하는 래퍼클래스
 * 기본형			래퍼클래스
 * boolean		Boolean		ex) Boolean b = new Boolean(true)
 * char			Character
 * byte			Byte
 * short		Short
 * int			Integer
 * long			Long
 * float		Float
 * double		Double
 */
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		System.out.println(i1 == i2); //false (주소를 비교했기에 false)
		System.out.println(i1.equals(i2)); //true (값만 비교했기에 true)
		System.out.println(i1.toString() == i2.toString()); //false
		//래퍼클래스들은 모두 equals()가 오버라이드 되어 있어서 주소값이 아닌 객체가 가지고 있는 값을 비교한다.
		//toString()도 오버라이딩 되어있어서 객체가 가지고 있는 값을 문자열로 변환하며 반환한다.
		
		int i3 = new Integer("100").intValue();
		int i4 = Integer.parseInt("100"); //주로 사용되는 방법
		Integer i5 = Integer.valueOf("100");
	}

}
