/*
패키지는 여러 개가 있을 수 있고 하나의 패키지 내에는 자바 클래스파일을 여러개 가질 수 있다.
edu.gt.cs.Test라고 하면: edu 패키지 아래에 gt 패키지 아래에 cs패키지 안에 Test라는 클래스가 위치하고 있다.
*/

/*
int[] n1 = new int[5]; // n1(변수:주소)에 {0,0,0,0,0} 이렇게 임의의 5개의 값이 들어감 (length(5))
int[][] n2 = new int[2][2]; // n2(변수:주소)에 {{0,0}. {0,0}} 이렇게 임의의 2개의 값이 들어감 (length(2))
int[] n3 = {1,2,3}; // n3(변수:주소)에 {1,2,3}의 값이 들어감 (length(3))

int x = 100;
int y = 200;
int z = x + y;
// 메모리(ram)에 있는 변수들의 값을 cpu가 가지고 와서 산술연산을 한 후 다시 메모리에 저장한다.

int age = 23;
String name = "kim";
String a = name + "의 나이는 " + age;
// 메모리(ram)에 있는 변수들의 값을 cpu가 가지고 와서 결합연산을 한 후 다시 메모리에 저장한다.

Scanner sc = new Scanner(System.in);
System.out.println("이름을 입력하세요>>"); //화면에 사용자로 하여금 입력하도록 프롬프트(promt)를 출력한다.
String name = sc.next();                  //사용자가 콘솔에서 스트링(문자열)으로 입력한 값을 변수 name에 저장
System.out.println("나이를 입력하세요>>");
int age = sc.nextInt();                   //입력한 나이데이터를 정수로 변경하여 age 변수에 저장

String h = "안녕하세요" //참고: 한글 한 글자가 2byte => 안녕하세요는 10byte

int n = Integer.parseInt("100"); //100이라는 문자열을 계산하여 가능한 int 정수형으로 변환하여 변수명 n에 저장
Scanner sc = new Scanner(System.in); //키보드 입력을 콘솔을 통해 받을 수 있는 Scanner 객체 sc를 생성
Random r = new Random(10); //시드값 10으로 랜덤한 값을 생성할 수 있는 객체 r을 생성
*/

/*
당신의 정보를 입력하세요.

Scanner sc = new Scanner(System.in);
System.out.println("당신의 부서는>>"); String aff = sc.next();
System.out.println("당신의 소속은 " + aff)
System.out.println("당신의 나이는>>"); int age = sc.nextInt();
int lage = age - 1;
System.out.println("당신의 작년 나이는 " + lage);
System.out.println("당신의 키는>>"); int height = sc.nextInt();
if (age >= 180) {
    System.out.println("당신은 키가 크다");
} else if (age >= 170) {
    System.out.println("당신은 키가 보통이다");
} else {
    System.out.println("당신은 키가 작다");
}
*/

/*
import java.util.Scanner;
public class ATest {
    public static void main(String[] args) {
        int count = 0; //전체 질문 횟수 변수
        int fno = 0; //first number
        int lno = 0; //last number
        String ox = "o";
        Scanner sc = new Scanner(System.in);

        while (ox != "x") {
            System.out.print("숫자를 입력하세요>>"); int a = sc.nextInt();
            System.out.print("숫자를 입력하세요>>"); int b = sc.nextInt();
            if (a>b) {
                System.out.println("앞 숫자가 더 큽니다.");
                fno++;
                count++;
            } else {
                System.out.println("뒷 숫자가 더 큽니다.");
                lno++;
                count++;
            } System.out.println("계속 할까요? (계속: o, 중단: x)"); ox = sc.next();
        } 
    System.out.println("프로그램을 종료합니다.");
    System.out.print("시도횟수" + count);
    System.out.printf("앞 숫자가 큰 경우: %d", fno);
    System.out.printf("뒷 숫자가 큰 경우: %d", lno);
    }
}


import java.util.Scanner;
public class ATest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("원하는 기호를 입력하세요>");
        String sign = scan.next();
        System.out.println("반복할 횟수를 입력하세요>");
        int num = scan.nextInt();
        
        Scanner sc = new Scanner(System.in); int count = 0;
        while (count < 3) {
            System.out.println("1)증가 2)감소 3)종료 >>");
            num = scan.nextInt();
            if (num == 1) {
                count+=1;
                System.out.println("카운트: " + count);
            } else if (num == 2) {
                count -= 1;
                System.out.println("카운트: " + count);
            } else if (num == 3) {
                System.out.printf("프로그램 종료\t최종카운트: %d", count);
                break;
            }
        } System.out.printf("프로그램 종료\t최종카운트: %d", count);
    }
}


Quiz. *로 이루어진 직각삼각형을 for문으로 만들기*/
import java.util.Scanner;
public class ATest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("왼쪽 아래가 직각인 삼각형을 표시합니다.");
        System.out.print("단수는? >>"); String line = sc.next();
        int line1 = Integer.parseInt(line);
        
        for (int i = 1; i <= line1; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            } System.out.println();
        }
        System.out.println("왼쪽 위가 직각인 이등변 삼각형을 표시합니다.");
        System.out.print("단수는? >>"); String line2 = sc.next();
        int line3 = Integer.parseInt(line2);

        for (int i = 1; i <= line3; i++) {
            for (int j = line3; j >= i; j--) {
                System.out.print("*");
            } System.out.println();
        }
    }
}