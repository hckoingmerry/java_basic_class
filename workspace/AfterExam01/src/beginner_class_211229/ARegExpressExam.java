package beginner_class_211229;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ARegExpressExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* 정규표현식/정규식(Regular Expression)
 * -텍스트 중에서 원하는 조건과 일치하는 문자열을 찾아내기 위해 사용한다.
 * - 원래는 Unix에서 사용하는 것이었는데 현재는 다양한 대부분의 언어에서 지원하고 있다.
 * - 많은 양의 텍스트 데이터에서 원하는 데이터를 쉽게 뽑아낼 수도 있고, 데이터가 어떤 형식에 맞는지 체크할 수 있다.
 * - 예를 들면 html에서 전화번호나 이메일 주소만 추출하거나 입력한 비밀번호가 숫자와 영문자의 조합으로 되어있는지 등을 쉽게 확인할 수 있다.
 */
				
		String[] data = {"bat", "body", "bonus", "cA", "ca", "co", "c0",
		                 "car", "combat", "count", "date", "direct"};
		Pattern p = Pattern.compile("c[a-z]*"); //c로 시작하고 뒤에는 알파벳으로 이루어진 소문자 영단어
		//문자열 배열에 담긴 문자열 중에서 지정한 정규식과 일치하는 문자열을 찾아서
		//출력pattern은 정규식을 정의하고 Matcher를 비교하는 역할을 한다.
		//1. 정규식을 매개변수로 Pattern클래스의 static메서드인 pattern.compile() 호출하여 Pattern객체를 얻는다.
		//2. 정규식으로 비교할 대상을 매개변수로 pattern클래스의 Matcher를 호출하여 객체를 얻는다.
		//3. Matcher객체에 matches() 호출하여 정규식에 부합하는지 확인한다.
		for (String d: data) {
			Matcher m = p.matcher(d);
			if (m.matches())
				System.out.print(d + ", ");
		}		
	}

}

/* Pattern p의 종류 (Pattern p = Pattern.compile("c")
 * Pattern p = Pattern.compile("c[a-z]*"): c로 시작하는 소문자 영단어
 * Pattern p = Pattern.compile("c[a-z]"): c로 시작하는 두자리 소문자 영단어
 * Pattern p = Pattern.compile("c[a-zA-Z]"): c로 시작하는 두자리 대소문자 영단어
 * Pattern p = Pattern.compile("c[azA-Z0-9]"): c로 시작하는 두자리 대소문자숫자 영단어
 * Pattern p = Pattern.compile(".*"): 모든 문자열
 * Pattern p = Pattern.compile("c."): c로 시작하는 두자리 문자열
 * Pattern p = Pattern.compile("c.*"): c로 시작하는 두자리 문자열
 * Pattern p = Pattern.compile("c\\."): c로 시작하는 두자리 문자열 (\\는 기능을 제거해준다는 뜻, 즉 마침표(.)을 단순 문자열로 인식)
 * Pattern p = Pattern.compile("c[0-9]"): c로 시작하고 숫자 1개
 * Pattern p = Pattern.compile("c\\d"): c로 시작하고 숫자 1개
 * Pattern p = Pattern.compile("c.*t"): c로 시작하고 t로 끝나는 모든 문자열
 * Pattern p = Pattern.compile("[b|c].*"): c 또는 b로 시작하는 모든 문자열 ([bc] 또는 [b-c] 이렇게도 표현할 수 있음)
 * Pattern p = Pattern.compile("[^b|c]."): 위와 동일 ([^bc] 또는 [^b-c]도 표현할 수 있음)
 * Pattern p = Pattern.compile(".*a.*"): a를 포함하는 모든 문자열
 * Pattern p = Pattern.compile(".*a.+*]"): 반드시 1개 이상 있어야 하는 a를 포함하는 모든 문자열
 * Pattern p = Pattern.compile("[b|c].{2}"): c와 b로 시작하는 모든 세가지 문자열(숫자나 영어도 상관없음)
 * Pattern p = Pattern.compile("0\\d{1,2}"): 0으로 시작하는 최소 2자리 최대 3자리 숫자
 * Pattern p = Pattern.compile("\\d{3,4}"): 최소 3자리 최대 4자리의 숫자
 * Pattern p = Pattern.compile("\\d{4}"): 숫자 4개
 */

/* 퀴즈: 전화번호 찾기
 * Pattern p = Pattern.compile("(0\\d{3}) -(\\d{3,4}+")-(\\d)
 */
