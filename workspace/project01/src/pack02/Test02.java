package pack02;

import java.util.Scanner;
public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int count = 0; //전체 질문 횟수 변수
        int fno = 0; //정수형 변수 first number
        int lno = 0; //정수형 변수 last number
        String ox = "o"; //문자열 변수명 ox
        Scanner sc = new Scanner(System.in); //키보드 입력값 받을 sc변수
        
        while (ox != "x") { //문자열 변수ox가 "x"가 아닌 이상 아래 식을 반복한다
        	System.out.println(""); //한줄 띄고
        	System.out.println("숫자 크기 판별"); //소제목
            System.out.println("-----------");
        	System.out.print("숫자 입력>>"); int a = sc.nextInt(); //입력받을 첫 숫자는 a변수
            System.out.print("숫자 입력>>"); int b = sc.nextInt(); //입력받을 둘째 숫자는 b변수
            if (a>b) {
                System.out.println("판결은 앞숫자가 크다."); //만약 a가 b보다 크면 "앞 숫자가 크다" 입력
                fno++; //그리고 앞숫자가 큰 횟수에 1 추가
                count++; //시도 횟수도 1 추가
            } else if (a<b) {
                System.out.println("판결은 뒷숫자가 크다."); //근데 만약 a보다 b가 크면 "뒷 숫자가 크다" 입력
                lno++; //그리고 뒷숫자가 큰 횟수에 1 추가
                count++; //시도 횟수도 1 추가
            } System.out.print("계속 하시겠습니까? (계속: o, 중단: x)"); ox = sc.next();
            //ox변수에 계속 할지 말지 키보드로 입력받는다
        } 
    System.out.println("프로그램을 종료합니다."); //while 반복이 종료되면 프로그램 종료
    System.out.print("시도횟수: " + count); //시도 횟수 표시
    System.out.printf(", 앞 숫자가 큰 경우: %d", fno); //앞숫자가 컸던 횟수 표시
    System.out.printf(", 뒷 숫자가 큰 경우: %d", lno); //뒷숫자가 컸던 횟수 표시
	}

}
