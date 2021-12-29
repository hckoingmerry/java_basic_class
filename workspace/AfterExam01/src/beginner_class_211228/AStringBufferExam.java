package beginner_class_211228;

public class AStringBufferExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* StringBuffer
 * String은 변경불가(immutable)지만, StringBuffer는 변경 가능하다.
 * StringBuffer는 String과 유사한 점이 많다.
 * 객체를 생성할 때 적절한 길이의 char형 배열이 생성되고 이 배열은 문자열을 저장하고 편집하기 위한 공간으로 사용된다.
 * 
 * ex)
 * StringBuffer sb = new StringBuffer("abc");
 * sb.append("123"); //abc123
 * sb에 새로운 문자열이 추가되고 sb자신의 주소를 반환하여 다시 생성하는 개념이다.
 */
		StringBuffer sb = new StringBuffer("abc");
		System.out.println(sb); //abc
		sb.append("123");
		System.out.println(sb); //abc123
		
		StringBuffer sb2 = sb.append("zz");
		System.out.println(sb2); //abc123zz
		System.out.println(sb); //abc123zz
		
		StringBuffer sb3 = new StringBuffer("abc");
		System.out.println(sb3); //abc
		sb3.append("123").append("zz");
		System.out.println(sb3); //abc123zz
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1 == str2); //false
		System.out.println(str1.equals(str2)); //true
		//String에서는 equals를 오버라이딩해서 문자열의 내용만 비교하도록 구현함 (true)
		
		StringBuffer sbr1 = new StringBuffer("abc");
		StringBuffer sbr2 = new StringBuffer("abc");
		System.out.println(sbr1 == sbr2); //false
		System.out.println(sbr1.equals(sbr2)); //false
		//StringBuffer에서는 equals를 오버라이딩하지 않아서 false 결과가 나옴
		
		StringBuffer str3 = new StringBuffer("abc");
		String str4 = str3.toString();
		System.out.println(str3.equals(str4)); //false
	}

}
