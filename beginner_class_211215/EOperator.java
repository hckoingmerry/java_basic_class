public class EOperator {
    public static void main(String[] args) {
        
        /*
        연산자(Operator): 연산을 수행하는 기호 (+, -. *, / 등)
        - 'x+3'식이 있다면 연산자는 +, x와 3은 피연산자
        - 연산자는 피연산자로 연산을 수행하고 나서 항상 그 결과값을 반환한다.
        - 결과값은 '평가(evaluation)'이라고 한다.

        연산자의 종류
        - 산술연산자: + - * / %(나머지 연산자가 특히 중요)
        - 비교연산자: > < <= >= == !=
        - 대입연산자: = (우변의 내용을 좌변으로 저장)
        - 논리연산자: || && | &
        - 기타연산자: 삼항연산자(if구문 없이 조건부를 달기)

        연산자의 우선순위:
        - 일반 수학계산 순서와 동일(곱셈이 덧셈보다 먼저)

        피연산자 개수에 따라:
        단항연산자, 이항연산자, 삼항연산자가 있음

        1. 단항연산자:
        증가연산자(++), 증감연산자(--)
        (단항연산자 하나만 사용할 때는 차이가 없다.)
        
        ex) int i = 5;
        System.out.println(i++); //i=5
        
        ex) int i = 5, j = 0;
        j = i++;
        System.out.println("j=i++ 실행후, i="+i+"j="+j) // i=6, j=5

        (만약 j = ++i라면)
        System.out.println("j=i++ 실행후, i="+i+"j="+j) // i=6, j=6

        2-1. 나머지연산자:
        ex) int x = 10, y = 8;
        System.out.printf("%d을 %d로 나누면 %n",x,y); //10을 8로 나누면
        System.out.printf("몫은 %d, 나머지는 %d입니다.%n",x/y,x%y); //몫은 1, 나머지는 2입니다.
        System.out.printf("x를 5로 나눈 나머지는 %d입니다.%n", x%5); //x를 5로 나눈 나머지는 0입니다.


        Quiz1. 정수를 하나 키보드로 입력받아 그 수가 홀수인지 짝수인지를 출력하는 프로그램을 작성
        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("입력하신 수는?: ");
        num = sc.nextInt();
    
        int x = num%2
        if (int x == 0) {
        System.out.printf("입력하신 수 %d는 짝수입니다.%n", x);
        } else {
        System.out.printf("입력하신 수 %d는 홀수입니다.", x);
        }

        2-2. 비교연산자
        두 개의 피연산자의 값이 같은지(==) 또는 다른지(!=)를 비교하여,
        같으면 true, 다르면 false

        문자열 비교 .equals()
        문자열을 비교할 때는 (==)가 아닌 .equals()를 써야 함에 주의

        ex)
        String str1 = "abc";
        String str2 = new String("abc"); (이게 FM이지만, 위와 사실 같음. 다만 .equals()를 써야할 때는 아래와 같은 문제가 있을 수 있음에 주의)
        System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc"); //true
        System.out.printf("abc"==\"abc\" ? %b%n", str1=="abc"); //true
        System.out.printf("str2==\"abc\" ? %b%n", str2=="abc"); //false
        여기에 false가 나온 건 str2는 문자열로 값이 저장됐기 때문에 (==)가 아닌 .equals()를 써야 함
        즉 아래와 같이 수정해줘야 함 (정확히는 (==)는 메모리의 위치값을 비교하는 거고, .equals()는 내용을 비교하는 것. new String으로 묶었을 경우 메모리 위치값이 다 달라짐)
        System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
        (메모리 위치 확인 방법) System.out.println(System.identityHashCode(str1));

        */
    }
}

