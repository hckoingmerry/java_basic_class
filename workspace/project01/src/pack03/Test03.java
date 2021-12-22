package pack03;

import java.util.Scanner;
public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("별 10개를 찍어보세요.");
		 System.out.println("**********");
		
		 Scanner scan = new Scanner(System.in); //변수명scan에 키보드 입력값 받을 객체 생성
	     System.out.print("원하는 기호를 넣으세요>>");
	     String sign = scan.next(); //변수명sign의 문자열에 원하는 기호 입력받게 하기
	     System.out.print("원하는 횟수를 넣으하세요>");
	     String number = scan.next(); //변수명number의 문자열 변수에 반복 횟수 입력받게 하기
		 int i = 0; //정수형 변수i 설정
		 int number1 = Integer.parseInt(number); //문자열 변수 number에 입력한 값을 숫자로 변환
	     while (i < number1) {
	    	 System.out.println(sign);
	     } //변수 i가 입력한 number값 숫자를 넘어가지 않는 선에서 sign 반복
	        
	     int count = 0; //0부터 시작하는 변수명count의 정수형 변수 입력
	     while (count < 3) { //값이 3을 넘어가지 않는 이상 아래 식을 반복한다.
	         System.out.print("1)증가 2)감소 3)종료 >>");
	         int num = scan.nextInt(); //증가, 감소, 종료 중 해당하는 숫자를 정수형 num변수로 입력받게 한다.
	         if (num == 1) {
	             count+=1; //만약 1(증가)을 입력하면 값에 1 증가 
	             System.out.println("카운트: " + count); //변화된 값 출력
	         } else if (num == 2) {
	             count -= 1; //만약 2(감소)를 입력하면 값에 1 감소
	             System.out.println("카운트: " + count); //변화된 값 출력
	         } else if (num == 3) { //만약 3(종료)를 입력하면 프로그램 종료
	             System.out.printf("시스템을 종료합니다.\t현재까지의 카운트: %d", count); //최종값 출력
	             break; //while문에서 빠져나오기
	         }
	     }
	}

}
