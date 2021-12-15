public class AVariable {
  public static void main(String[] args) {

    /*
    변수(variable): 단 하나의 값을 저장할 수 있는 메모리공간
    - 변수를 사용하기 위해서는 먼저 초기화를 해야 한다.
    ex) int age; (여기서 int는 변수 type, age는 변수명)
    - 변수type: 변수에 저장될 값의 종류를 지정하는 것
    int age = 25; 변수 age를 선언하고 25로 초기화한다.
    int a;
    int b; --> 이건 int a, b; 이렇게 바꿀 수 있음
    int x = 0;
    int y = 0; 이것도 in x = 0, y = 0; 이럿게 바꿀 수 있음

    변수를 사용하기 전에 적절한 값(0, 1)로 초기화한다. (변수의 초기화란, 변수를 사용하기 전에 처음으로 값을 저장하는 값을 말함)

    변수값 바꿔쓰기
    int x = 10;
    int y = 20;
    int temp;
    temp = x;
    x = y;
    y = temp;
    System.out.println("x = " + x); //20
    System.out.println("y = " + y); //10
    //그냥 x=y, y=x라고 했다면 x=y값이 y값에 저장될 것

    변수 선언 규칙
    1. 대소문자를 구분하여 길이에는 제한이 없다.
    2. 예약어를 사용할 수 없다.
    3. 숫자로 시작할 수 없다.
    4. 특수문자는 _와 $만 된다.
    5. 변수명(+메서드명)의 첫글자는 항상 소문자로 시작을 권장함 (반대로 클래스명의 첫글자는 대문자 권장)
    6. 여러 단어를 붙여 쓸 때는 단어의 첫글자를 대문자로 사용 권장
    7. 상수이름은 전부 대문자 사용을 권장

    변수 타입
    - 주로 사용하는 값은 크게 문자와 숫자(정수와 실수)
    
    자료형 변수: 값(data)의 종류(type)에 따라 저장될 공간의 크기와 형식을 정하는 것 (기본형과 참조형으로 나뉨)
    - 기본형: 실제 값을 저장함 (8가지 - 논리Boolean, 문자char, 정수int/long, 실수double/float, 그 외 byte, short)
    - 참조형: 실제 값이 저장되어 있는 주소값을 저장함 (기본형을 제외한 나머지)

    논리Boolean: true or false, 조건식/논리계산
    문자char: 변수 하나에 한글자만 저장 (근데 사실 아스키코드가 적용되어 내부적으로는 숫자 정수로 저장됨)
    정수int/long + byte/short: 주로 int를 제일 많이 씀
    실수double/float: 주로 double를 많이 씀

    int              -2,147,483,648 ~ 2,147,483,648 (10자리)
    long -9,223,372,036,845,775,808 ~ 9,223,372,036,845,775,807


    # 상수 constant
    변수처럼 값을 저장할 수 있는 공간변와는 달리 한번 값을 저장하면 변경하지 않고 사용한다. 선언하는 방법도 변수와 동일하지만 final을 붙여서 상수를 나타낸다. (관습적으로 대문자로 표현)
    ex) final int MAX_SPEED = 100; (final로 선언하면 변경불가능)
    상수 선언은 반드시 선언과 동시에 초기화해야 한다.
    ex) final int MIN_SPEED; (X);
    long이 int보다 더 큰 개념이기 때문에 int는 포함됨

    변수와 함께 많이 사용되는 printf()
    - 지금까지는 println()만 사용했지만 println()은 변수값을 그대로 출력하므로 다른 형태로 출력은 안된다. 예를 들어 소수는 소수자리 2개로만 출력낭한드다든가. 그래서 %d로 자리표시할 때 필요함
    %d decimal 10진수 (수의 자리 출력)
    %s String 문자열 출력
    %f 실수 출력
    %c 문자 출력
    %n 줄바꿈

    int age = 14;
    int year = 2021
    System.out.printf("age:%d", age);
    System.out.printf("age:%d%n year%d, age, year");

    String url = "www.naver.com"
    float f1 = .10f;
    float f2 = 3.14e3f;
    double d = 1.23456789;
    System.out.printf("f1 : %f", f1);
    System.out.printf("d : %d", d);
    System.out.printf("Address : %s", url);
    
    %10.8s%n 이렇게 하면 총 10칸을 만들고 주소 중 8칸까지만 표시하고 줄바꿈 -> www.naver.com에서 8칸까지만 표시한다면 www.nave까지이고, 10칸을 만들어야 하니 앞에 2칸 뛰고 www.nav.이렇게 표시될 것
    %-10.8s%n -> 이렇게 하면 오른쪽에서부터 잘림

    %10.2f 이렇게 하면 총 10칸을 만들고 소수자리 둘째자리까지 표시
    */
  }
}