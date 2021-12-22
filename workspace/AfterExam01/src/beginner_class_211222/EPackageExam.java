package beginner_class_211222;

/* 패키지(package)
 * - 패키지는 클래스들의 모음이다. 또한 패키지에는 클래스와 인터페이스를 포함할 수 있고,
 * - 연관이 있는 클래스들을 그룹으로 묶어 효율적으로 관리할 수 있다.
 * - 같은 이름의 클래스라도 패키지명이 다르면 서로 다른 패키지 내에 존재할 수 있다.
 * - 클래스가 물리적으로 하나의 <클래스파일.class>인 것과 같이 패키지는 물리적으로 하나의 디렉토리다.
 * 
 * 특징
 * 1. 모든 클래스는 반드시 패키지 안에 존재해야 한다.
 * 2. 패키지는 점(.)을 구분자로 하여 계층 구조를 구성한다.
 * 3. 패키지 선언은 반드시 클래스의 제일 첫줄에서 선언한다. (주석 제외)
 * 4. 패키지 선언을 안하면 자동으로 '이름 없는 패키지'에 속한다.
 * 5. 페키지 선은을 안한 클래스들은 모두 같은 패키지에 속하게 되는 것이다.
 * 6. 패키지는 대소문자를 모두 허용하지만 관용적으로 클래스명과의 구분을 위해 소문자로 사용한다.
 */

/*import
 * 다른 패키지에 있는 클래스를 사용하려면 패키지명이 포함된 클래스 이름을 사용해야 한다.
 * 그러나 매번 패키지명까지 붙여서 사용하기는 너무 불편하다.
 * 클래스의 첫 부분에 import문으로 사용하고자 하는 클래스의 패키지를 미리 명시해주면 그 뒤로는 패키지명을 쓰지 않아도 된다.
 * 이클립스에서는 ctrl+shift+o를 통해 쉽게 import구문을 완성한다. (또는 ctrl+space)
 * ex) import java.util.Calendar; java.util.ArrayList;
 * 그런데 또 import할 게 많다면 그냥 아예 *로 모든 걸 대타할 수 있다. -> import java.util.*; (util까지 생략은 안 됨)
 */

import java.util.Date;
import java.text.SimpleDateFormat;
public class EPackageExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd"); //아래 시간의 minute(mm)과 구별하기 위해 month만 대문자 MM으로 씀
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		System.out.println("오늘의 날짜는 " + date.format(today));
		System.out.println("현재의 시간은 " + time.format(today));
	}

}
