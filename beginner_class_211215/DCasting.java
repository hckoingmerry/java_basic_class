public class DCasting {
  public static void main(String[] args) {

    /*
    Casting형변환: 변수 또는 상수의 타입을 다른 타입으로 변환시켜서 자료형의 타입을 일치시킨다.
    ex) int값과 double값을 계산하려면 먼저 두 값을 같은 타입으로 변환하 후 계산해야 함

    방법은 '(타입)피연산자' 방식, 괄호 안에는 '캐스트 연산자' 또는 '형변환 연산자'
    ex) double d = 85.4
    int score = (int)d;
    System.out.println(score); //85

    Bloolean을 제외한 나머지 타입들은 서로 형변환이 가능함
    기본형과 참조형간의 형변환은 불가능하다.

    정수형 간의 형변환
    - 큰 타입에서 작은 타입으로 변환(예를 들어 int의 값을 byte타입으로 변환)하는 경우에는 그 크기의 차이만큼 잘려나간다. 경우에 따라 '값 손실(loss of data)'이 발생할 수도 있음'
    - 반대로 작은 타입에서 큰 타입으로 변환(예를 들어 byte에서 int로 변환)하는 경우에는 잘려나가는 일이 없다. 따라서 값손실이 발생하지 않는다.
    - 나머지 빈 공간들은 0 또는 1로 채워진다.

    ex)
    int i = 10;
    byte b = (byte)i;
    System.out.printf("[int]->[byte] i=%d -> b-%d%n", i, b); //i=10 -> b=10

    i = 300;
    b = (byte)i;
    System.out.printf("[int]->[byte] i=%d -> b-%d%n", i, b); //i=300 -> b=44

    b = 10;
    i = (int)b;
    System.out.printf("[int]->[byte] b=%d -> i-%d%n", b, i); //b=10 -> i=10

    b = =2;
    i = (int)b;
    System.out.printf("[int]->[byte] b=%d -> i-%d%n", b, i); //b=-2 -> i=-2


    float f = 9.1234567f;
    double d = 9.1234567;
    double d2 = f;
    System.out.printf(d2); //9.123456954956055 (즉 이렇게 해도 나오긴 함)

    (만약 아래처럼 했다면)
    double d2 = (double)f;
    System.out.println(d2); //9.123456954956055
    System.out.printf("d=%10.2f%n", d2); //d=9.12


    정수와 실수형 간의 형변환은 둘이 완전히 다르기 때문에 정수형끼리 형변환 하는 것처럼 간단히 처리할 수 없음. 좀더 복잡한 과정을 거친다.

    자동형변환
    서로 다른 타입간의 대입이나 연산을 할 때는 형변환을 통해 일치시키는 것이 원칙이다. 하지만 경우에 따라 생략할 수 있다. 이는 형변환을 하지 않는 게 아니라, 자바가 알아서 해주는 것이다. (예를 들어 실수 float을 쓰면서 값을 정수로 넣는 경우 또는 혼합하여 계산하는 연산 과정에도 자주 일어남(산술변환))
    ex)
    int i = 4;
    double d = 0.1;
    double f = i + d;
    System.out.printf(f); //4.1
    */
  }
}