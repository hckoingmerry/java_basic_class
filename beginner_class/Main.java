//작성자: 고현창
//작성일: 2021.12.08

//(주석 적기: java에서는 //, 라인주석이라고 함)
//(파이썬에서는 #)
//(HTML에서는 <!---->)
/*여러 줄로 주석을 적을 경우에는 이렇게 적으면 됨, 블럭주석이라고 함 (css랑 같음)*/

/* 주석comment :
1. 코드에 대한 설명을 적는다. (열심히 잘 적어줘야 나중에 다시 봐도 이해 가능)
2. 참고로 주석은 컴퓨터가 읽지 않음
3. 코드의 실행을 잠시 멈추고 문제점을 파악하는 용도로도 사용*/

/*
class는 객체를 찍어내는 도구 -> 객체지향언어
class Main {
  public static void main(String[] args) {
  System.out.println("Hello World!");
  }
}
*/


/*
//클래스 선언
//클래스 블록 (class { ~ }) : 소스 코드의 가장 바깥 (자바는 언제나 class로 시작)
//class명은 파일명과 반드시 동일해야 함
class main {
  
  //클래스 안에는 매서드 블록 (또는 함수 블록. 어쨌든 정확한 표현은 매서드 블록): 기능을 정의
  //main 메서드가 프로그램 전체의 시작점이다.
  public static void main(String[] args) {
    //public: 접근제어자 (public이라고 적는 건 모두 접근 가능이라는 것)
    //static: 객체를 생성하지 않고도 사용 가능
    //void: 리턴값이 없음을 의미함
    //[] 배열 / String: 문자열 / args: 변수들
    
    System.out.println("Hello world!");//Hello World를 출력한다.
    //ln(line): 줄바꿈을 의미함
    //System의 s는 무조건 대문자
    //구문의 끝에는 항상 세미콜론(;)
  }
}
*/

/*
변수: 어떤 값을 보관하는 용도
ex) int a; => a라는 변수명에 int(정수)를 보관할 것이다.
ex) String b; => b라는 변수명에 String(문자열)을 보관할 것이다.

변수명 선언 규칙
1. 변수명은 숫자로는 시작할 수 없다.
ex) a100 (O), 100a(X)
2. 언더바(_)와 $는 사용가능하지만, @, ! 등 특수문자는 사용하지 못한다.
3. 예약어는 변수명으로 사용할 수 없다. (int, class 등은 X)
4. 한글은 사용하지 않는다. 그리고 변수는 가급적 소문자로 만든다.

잘못된 변수명 예시
int 2nd;
String b#;
int main;

자료형 (type)
int a; 변수명 a는 int 자료형 변수이므로 a라는 변수에는 정수만 담을 수 있다. (1, 2, 10, 100, 300......)
String b; 변수명 b는 String 자료형 변수이므로 b라는 변수에는 문자열만 담을 수 있다. ("boy", "Hello World"...)
*/

/*
class: java는 class 단위로 프로그램을 구성한다.
- 클래스명은 명서로 만든다.
- 여러개의 단어로 만들 경우 각 단어의 첫 문자는 대문자로 만든다. (띄어쓰기X)
ex) class Raster {} / class ImageSprite {}

Method: 하나의 class 안에는 매서드가 여러개 존재할 수 있다.
- 매서드명은 주로 동사로 만든다.
- 여러개의 단어로 만들 경우 처음 시작하는 문자는 소문자로 시작하고, 두번째 단어부터는 대문자를 사용한다.
ex) run(); / runFast {}; / getBackground{};

** 권장사항: 변수명은 짧지만 의미가 있게 만든다. 변수명을 통해 사용 의도를 알 수 있기 때문.
*/

/*
숫자자료형(number, integer)

정수: int(숫자) (long이 들어가면 엄청 큰 숫자)
ex) int age() = 21
ex) long countStar = 2545654786783528L (끝에 L이 붙으면 엄청 큰 숫자임을 알 수 있음)

실수: 주로 double을 쓰며, 무한소수면 float를 쓰기도 함
ex) float pi = 3.14F
ex) double morePi = 3.141592
*/

/*
class Main {
  public static void main(String[] args) {
    
    int a = 10;
    int b = 5;

    System.out.println(a+b);
    System.out.println(a-b);
    System.out.println(a*b);
    System.out.println(a/b);
    System.out.println(a%b); //나머지 연산자 (홀/짝/배수 찾기에 용이함)
    System.out.println(6%2); //1 (2로 나눠지지 않으니 즉 홀수)
    System.out.println(6%2); //0 (2로 나눠지므로 즉 짝수)
    System.out.println(7%2); //1 (나머지가 1이 있으므로 배수가 아님)
    

    
    int i = 0;
    int j = 10;

    i++; //하나 증가 (자바적 표현)
    j--; //하나 감소 (자바적 표현)
    이렇게 적을 수도 있음
    i = i + 1 / i += 1
    j = j - 1 / j -= 1

    System.out.println(i); //1
    System.out.println(j); //9
    
    
    i++와 ++i는 어떻게 다른가?

    int i = 0;

    System.out.println(++i); //1 (하나를 증가하고 출력)
    System.out.println(i++); //0 (출력을 하고 하나 증가)
    System.out.println(i); //1
    
  }
}
*/


/*
String 문자열, 글자들 다 가능

String a = new String("Hello World");
원래는 위와 같이 표현하여 객체를 생성한 후 사용하는 게 원칙

String a = "Hello World";
자바에서 String을 특별 취급하여 이렇게 간단하게 사용할 수도 있다.
*/

/*
문자열에서 많이 사용되는 메서드 정리 (0에서 시작, 빈칸도 글자, 이하가 아닌 미만으로 표현)
- equals: 두 개의 문자열이 동일한지 비교하여 결과 리턴
- indexOf: 문자열에서 특정 문자가 시작되는 위치를 리턴
- replaceAll: 문자열 중 특정 문자열을 다른 문자열로 치환
- substring: 문자열 중 특정 부분을 뽑아낼 때 사용
- toUpperCase: 모든 문자열을 대문자로 변환


class Main {
  public static void main(String[] args) {
    String a = "hello";
    String b = "java";
    String c = "hello";

    System.out.println(a.equals(b)); //false
    System.out.println(a.equals(c)); //true
  }
}

class Main {
  public static void main(String[] args) {
    String a = "hello World";

    System.out.println(a.indexOf("World")); // 6
  }
}

class Main {
  public static void main(String[] args) {
    String a = "hello World";

    System.out.println(a.replaceAll("World", "Java")); //Hello Java
  }
}

class Main {
  public static void main(String[] args) {
    String a = "Hello World";
    System.out.println(a.substring(0,4)); //Hell (미만이기 때문에 마지막 4번째 문자열은 안 나옴)
  }

}

class Main {
  public static void main(String[] args) {
    String a = "Hello World";
    System.out.println(a.toUpperCase()); //HELLO WORLD
  }
}
*/




/*
Bool: 불(Boolean) - true 1 (0이 아닌 모든 것), false 0

class Main {
  public static void main(String[] args) {
    int base = 100;
    int height = 185;
    boolean isTall = height > base;

    if (isTall) {
      System.out.println("키가 큽니다"); //isTall이 true기 때문에 "키가 큽니다"가 입력됨
    }
  }
}
*/

/*
char: 문자(문자열X) - 그냥 String 쓰면 돼서 굳이 얘를 쓸 일은 없긴 함
class Main {
  public static void main(String[] args) {
    char a = 'a';
    char b = 97;
    char c = 122;

    System.out.println(a); //a
    System.out.println(b); //a (ascII라는 코드값이 있는데 여기서 97은 a)
    System.out.println(c);
  }
}
*/

/*
Array: 배열 - 여러 개의 원소를 한번에 담는 자료형 (다만 길이가 고정되어 한번 생성하면 길이를 수정할 수 없다는 단점이 있음)

    int KimengScore = 80; //1개만 저장
    int[] engScore = {80, 90 70, 65, 100};
    String[] names = {"kim", "park", "son", "yoon", "lee"}
*/

/*
class Main {
  public static void main(String[] args) {
    
    String[] weeks = new String[7];
    weeks[0] = "Mon";
    weeks[1] = "Tue";
    weeks[2] = "Wedn";
    weeks[3] = "Thur";
    weeks[4] = "Fri";
    weeks[5] = "Sat";
    weeks[6] = "Sun";
    

    //위의 표현은 아래와 같이 더 간단히 표현할 수 있음
    String[] weeks = {"Mon", "Tue", "Wedn", "Thur", "Fri", "Sat", "Sun"};

    System.out.println(weeks[3]);

    반복문 for/while, (do~while);
    for: 몇번 반복할지 정확히 알 때
    while: 몇번 반복할지 모를 때
    그러나 실제로는 바꿔 써도 전혀 문제없음

    for (int i = 0; i < weeks.length; i++) {
      System.out.println(weeks[i]);
      (ArrayIndexOutOfBoundsException: 인덱스가 없는 위치를 지정했을 때 뜨는 에러)
    }
  }
}
*/

/*
리스트(list): 배열과 비슷한 자료형인데, 크기가 정해지지 않고 동적으로 변한다. 배열은 크기가 생성시에 정해지지만 리스트는 그 크기가 정해지지 않아서 원하는 만큼 자유롭게 담을 수 있음.
그중 ArrayList가 가장 많이 쓰임. 그리고 보통 같이 쓰이는 게 import java.util.ArrayList;

import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    
    ArrayList pitches = new ArrayList();
    pitches.add("123");
    pitches.add("234");
    pitches.add("789");

    pitches.add(0,"133"); //이걸로 0번째에 우겨넣은 것

    System.out.println(pitches.get(1)); //123
    //(즉 두번째를 뽑아내는 건데, 위에서 0번째에 다른 것을 넣었기 때문에 기존의 0번째가 1번이 된 것)
    //get() 메서드를 이용하여 특정 인덱스값을 추출

    System.out.println(pitches.size()); //4
    //size() 메서드를 이용하여 리스트의 개수를 확인

    System.out.println(pitches.contains("234")); //true
    //contains() 메서드를 이용하여 포함 여부 확인

    System.out.println(pitches.remove("789")); //remove() 메서드를 이용하여 해당 객체 삭제하고 결과를 리턴

    System.out.println(pitches.remove(0)); //133
    //remove() 메서드를 이용하여 해당 인덱스의 객체를 삭제
  }
}
*/



/*
Generics: 입력되는 객체의 자료형을 강제한다.

ArrayList pitches = new ArrayList();
//이렇게 해서 문자만 넣어야 하는데 실수로 ""를 빼먹어서 숫자로 들어갈 수도 있음

ArrayList<Strings> pitches = new ArrayList<String>();
//"pitches라는 ArrayList에 담을 수 있는 자료형은 String뿐이다."라고 제한하는 것
*/
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    
    ArrayList aList = new ArrayList();
    
    //Generics를 이용한다면
    //ArrayList<String> aList = new ArrayList<String>();
    

    aList.add("hello");
    aList.add("java");

    String hello = (String)aList.get(0);
    String java = (String)aList.get(1);
    
    //Generics 반영하여 수정한다면,
    //System hello = aList.get(0);
    //System java = aList.get(1);
    
    //String에는 String만 들어올 수 있고 객체는 들어올 수 없기에 객체를 강제로 String화 시켜서 집어넣은 것
    //Generics를 사용하여 자료형을 선언하면 그 이후로는 자료형에 대한 형변환 casting이 필요 없다. 이미 자바가 aList에는 반드시 String 자료형만 추가된다는 것을 알고 있다. Generics를 사용하면 형변환에 대한 불필요한 코딩과 잘못된 형변환 등의 예외를 방지할 수 있다.

    System.out.println(hello);
    System.out.println(java);
  }
}
*/