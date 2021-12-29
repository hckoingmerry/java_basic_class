package beginner_class_211227;

/* String
 * 다른 언어에서는 문자열을 char형의 배열로 다루었으나, 자바에서는 문자열 클래스를 별도로 제공한다.
 * String 클래스는 문자열을 다루는 데 필요한 메서들을 함께 제공한다.
 * 
 * 1. immutable 클래스(변경 불가능):
 * 		- 한번 생성한 String은 읽어올 수만 있고 변경할 수는 없다.
 * 		- 만약 +연산자를 이용해서 문자열을 결합하는 경우 문자열 자체가 바뀌는 것이 아니라 결합된 새로운 문자열이 생성되는 것이다.
 * 		- 문자열같이 결합 추출 등 문자열 작업이 많은 경우에는 String 대신 StringBuffer를 사용하는 것이 좋다.
 * 		- String 문자열의 비교는 언제나 항상 반드기 꼭 a.equals(b)를 사용한다.
 * 
 * 빈 문자열
 * String s = ""; // 참조변수 s가 참조하고 있는 String 객체는 내부에 new char[0]과 같이 길이가 0인 char형 배열을 저장하고 있는 것과 같다.
 * char[] chArr = new char[0] ; //길이가 0인 char배열 (가능은 하지만 아무 의미 없음)
 * char c = ''; //이건 안 됨. char 형 변수에는 반드시 하나의 문자를 지정해야만 한다.
 * System.out.println(cArr.length)
 * 
 * 
 */
import java.util.StringJoiner;

public class CStringExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] cArr = new char[0];
		String s = new String(cArr);
		System.out.println(cArr.length);
		System.out.println("@@@" + s + "@@@");
		
		String a = new String("Hello");
		
		char[] b= {'h','e','l','l','o'};
		String c = new String(b);
		System.out.println(c);
		
		//charAt() 지정된 위치 index에 있는 문자를 반환 (0부터 시작)
		String d = "Hello";
		String e = "012345";
		char f = d.charAt(2);
		char g = e.charAt(2);
		System.out.println(f);
		System.out.println(g);
		
		//compareTo() 비교해서 같으면 0, 이전이면 -1, 이후 1로 반환
		int i = "a".compareTo("a");
		int i2 = "a".compareTo("b");
		int i3 = "b".compareTo("a");
		System.out.println(i + "/" + i2 + "/" + i3);
		
		//concat() 문자열들을 붙인다.
		String h = "Hello";
		String k = "World";
		String l = h.concat(k);
		System.out.println(l);
		
		//contains() 문자열이 포함되었는지 검사
		String z = "abcdefg";
		boolean y = z.contains("bc");
		System.out.println(y);
		
		//endsWith() 지정된 문자열로 끝나는지 검사
		String ab = "Hello.txt";
		boolean aa = ab.endsWith("txt");
		System.out.println(aa);
		
		String r = "Hello";
		//startsWith(): 지정된 문자열로 시작하는지 검사
		System.out.println(ab.startsWith("He"));
		
		//equalsIgnoreCase(): 대소문자 구분없이 같은지 비교
		System.out.println(r.equalsIgnoreCase("HELLO"));
		
		//IndexOf(): 주어진 문자가 문자열에 존재하는지 확인, 없으면 -1
		System.out.println(r.indexOf('o'));
		System.out.println(r.indexOf('e'));
		
		//lastIndexOf(): 지정된 문자가 오른쪽부터 찾아서 index를 알려준다.
		System.out.println(r.lastIndexOf('l'));
		
		//length(): 문자열의 개수(길이)를 리턴한다.
		System.out.println(r.length());
		
		//replace(): 글자를 바꿔서 보여준다.
		System.out.println(r.replace('e', 'a'));
		System.out.println(r);
		
		//replaceAll(): 문자를 바꿔서 보여준다.
		System.out.println(r.replaceAll("ll", "rr"));
		
		//split(): 문자열을 지정된 분리자로 나누어 배열로 변환
		String animals = "dog, cat, bear";
		String[] arr = animals.split(", ");
		for (int j = 0; j < arr.length-1; j++) {
			System.out.print(arr[j] + ", ");
		} System.out.println(arr[arr.length-1]);
		
		//substring(): 문자열(몇 글자) 잘라내기
		System.out.println(r.substring(2)); //llo
		System.out.println(r.substring(2,4)); //ll (4 미만)
		
		//toLowerCase(): 전부 소문자로 보여주기
		//toUpperCase(): 전부 대문자로 보여주기
		System.out.println(r.toLowerCase());
		
		//trim(): 문자열 앞뒤에 있는 불필요한 여백 제거
		String rr = "   Hello   ";
		System.out.println(rr.trim());
		
		//join(): 문자열들을 결합한다. split과 반대
		String animals2 = "dog, cat, bear";
		String[] arrs = animals2.split(", ");
		System.out.print("[");
		System.out.print(String.join(", ",  arrs));
		System.out.println("]");
		// import java.util.StringJoiner;
		StringJoiner sj = new StringJoiner("/","[","]");
		for (String ani:arrs) {
			sj.add(ani);
		} System.out.println(sj.toString());
		
		//String을 기본형 값으로 변환
		int ii = Integer.parseInt("100");
		int jj = Integer.valueOf("100"); //새로 추가된 방식
		int iVal = 100;
		String strVal = String.valueOf(iVal); //int를 String으로 변환
		double dVal = 200.0;
		String strVal2 = dVal + ""; //숫자를 문자열로 바꾸는 또 다른 방법
		
		double sum = Integer.parseInt(strVal) + Double.parseDouble(strVal2);
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		System.out.println(sum);
		System.out.println(sum2);
		//int val = Integer.parseInt("  123  "); //에러 발생: 숫자에 문자(빈칸)이 포함됐기 때문
		int val = Integer.parseInt("  123  ".trim());
		System.out.println(val);
		//문자열을 숫자로 변환하는 과정에서는 예외가 발생할 확률이 아주 높기 때문에 주의 필요

		//Quiz
		String fullName = "Hello.java";
		//확장자를 제외한 이름과 확장자를 구분해서 출력
		//1. 점의 위치 찾기 / 2. 첫글자부터 점까지 추출 / 3. 점부터 끝까지
		int idx = fullName.indexOf('.');
		String fName = fullName.substring(0, idx);
		String eName = fullName.substring(idx+1, fullName.length());
		System.out.println("확장자를 제외한 이름은 " + fName);
		System.out.println("확장는 " + eName);
		
		//다른 방법1
		String[] strArr = fullName.split("\\.");
		System.out.println("확장자를 제외한 이름은 " + strArr[0]);
		System.out.println("확장자는 " + strArr[1]);
		//다른방법2
		System.out.println("확장자를 제외한 이름은 " + fullName.substring(0,fullName.indexOf('.')));
		System.out.println("확장자는 " + fullName.substring(1+fullName.indexOf('.')));
				
	}

}
