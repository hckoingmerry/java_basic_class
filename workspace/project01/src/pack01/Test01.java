package pack01;

import java.util.Scanner; //Scanner 활용
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); //키보드 입력 받을 수 있는 scanner 객체를 변수명 sc로 생성
		System.out.println("-----------------------------");
		System.out.println("건강검진을 위해 회원의 정보를 입력해주세요"); //소제목
		System.out.println("-----------------------------");
		System.out.print("당신의 소속은>> "); String a = sc.next(); //소속을 a라는 변수에 문자열로 입력받기
		System.out.println("당신의 소속은 " + a + "이시군요!"); //a소속 입력
		
		System.out.print("당신의 나이는>> "); int age = sc.nextInt(); //나이를 a라는 정수형 변수에 입력받기
		int lyage = age - 1; //작년 나이를 lage(last year age)라는 정수형 변수에 새로 입력
		System.out.println("당신의 작년 나이는 " + lyage + "세였겠군요!"); //작년 나이 lyage 입력
		
		System.out.print("현재 당신의 몸무게는>> "); int weight = sc.nextInt(); //몸무게를 weight라는 변수에 문자열로 입력받기
		if (weight >= 90) { //if문으로 90kg 이상 설정하기
			System.out.println("당신은 과체중이시군요!"); //90kg 이상이면 과체중 입력
		} else if (weight >= 70) { //if문으로 70kg 이상 설정하기
			System.out.println("당신의 체중은 보통이시군요!"); //70kg 이상이면 보통 입력
		} else { //if문으로 그 외(즉 70kg 미만) 설정하기
			System.out.println("당신의 체중은 미달이시군요"); //그 외 체중이면 미달 입력
		}
		
		System.out.print("당신은 결혼하셨나요>> "); String ans = sc.next(); //결혼 여부를 ans라는 문자열 변수로 입력받기
		if (ans == "true") { //if문으로 만약 ans가 "true"로 입력된다면 설정
			System.out.println("배우자가 있겠군요."); //true면 배우자가 있겠군요 출력
		} else if (ans == "false") {
			System.out.println("배우자가 없겠군요."); //만약 false면 배우자가 없겠군요 출력
		}
		System.out.println("-----------------------------");
		System.out.println("입력을 마무리합니다."); //출력 마무리
	}

}

