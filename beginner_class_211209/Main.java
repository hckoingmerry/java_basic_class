/*
Map맵 - 데이터를 키값과 밸류값을 쌍으로 저장하는 구조 (파이썬의 '딕셔너리', JS의 'Json'과 같은 자료구조)

key         value
name        고현창
age         27
위 예시에서 알 수 있듯이 key값에는 순서(인덱스)가 없이 키값으로만 밸류값을 얻는 것

import java.util.HashMap;
class Main {
  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<String, String>();
    map.put("people", "사람");
    map.put("baseball", "야구");

    //키값으로 밸류값 가져오기 get()
    System.out.println(map.get("people"));

    //키값의 존재 유무 확인 containsKey()
    System.out.println(map.containsKey("people"));

    //map의 항목을 삭제 remove()
    System.out.println(map.remove("people"));

    System.out.println(map.size());

    //map의 가장 큰 특징은 순서에 의존하지 않고 key값으로 value값을 가져오는 것
    //그러나 순서로 데이터를 가져올 필요가 있으면 LinkedHashMap, TreeMap 등을 사용함
  }
}
*/

/*
class Main {
  public static void main(String[] args) {

    boolean money = true;

    if (money) {
      System.out.println("택시");
    } else {
      System.out.println("도보");
    }
  }
}

class Main {
  public static void main(String[] args) {

    int money = 2000;
    boolean card = true;

    // || = or = "둘 중 하나만 만족해도")
    // && = and = "둘 다 만족해야만)"
    // ||나 &&처럼 2번 들어가는 것과 1번 들어가는 거의 차이는, 2번 넣으면 앞에 거로만 조건을 따지는 것. 즉 처리시간을 단축시키는 것. or라면 앞에만 만족해도 true이니 뒤에 거는 볼 필요 없음. and라면 앞에만 false여도 뒤는 볼 필요 없이 false.
    if (money >= 5000 || card) {
      System.out.println("택시");
    } else {
      System.out.println("도보");
    }
  }
}

import java.util.ArrayList;
class Main {
  public static void main(String[] args) {

    ArrayList<String> pocket = new ArrayList<String>();

    pocket.add("paper");
    pocket.add("handphone");
    pocket.add("money");

    if (pocket.contains("card")) {
      System.out.println("택시");
    } else {
      if (pocket.contains("money")) {
        System.out.println("택시");
      } else {
        System.out.println("도보");
      }
    }
  }
}
//하지만 보통 조건이 이렇게 한두개이기보단 더 많아질 수 있기에 if 안에 if를 넣는 건 별로 좋은 방식이 아님(가독성 문제). 아래와 같이 쓰는 걸 권장함.

import java.util.ArrayList;
class Main {
  public static void main(String[] args) {

    ArrayList<String> pocket = new ArrayList<String>();

    pocket.add("paper");
    pocket.add("handphone");
    pocket.add("money");

    if (pocket.contains("card")) {
      System.out.println("택시");
    } else if (pocket.contains("money")) {
      System.out.println("택시");
    } else {
      System.out.println("도보");
      }
    }
  }
}
*/

/*
테스트

class Main {
  public static void main(String[] args) {
    int x = 50;
    int y = 60;

    if(x>y) {
      System.out.println("x는 y보다 작습니다.");
    }
  }
}

class Main {
  public static void main(String[] args) {
    int x = 50;
    int y = 60;

    if(x > y) {
      System.out.println("x는 y보다 큽니다.");
      System.out.println("test1");
    }
    if(x > y) //여기에 중괄호를 뺐음
      System.out.println("x는 y보다 큽니다.");
      System.out.println("test2");
  }

class Main {
  public static void main(String[] args) {
    int x = 50;
    int y = 60;

    if(x == y) {
      System.out.println("x는 y와 같습니다.");
    } else {
         System.out.println("x는 y와 다릅니다.");
    }
  }
}

class Main {
  public static void main(String[] args) {
    int x = 50;
    int y = 60;

    if(x == y) {
      System.out.println("x는 y와 같습니다.");
    } else if(x > y) {
      System.out.println("x는 y보다 큽니다.");
    } else if(x < y) {
      System.out.println("x는 y보다 작습니다.");
    }
  }
}

//위에 방법대로라면 하나하나 다 확인해봐야 하는 번거로움이 있음. 하지만 아래는 마지막 조건 하나로 다 걸리게 할 수 있음.
class Main {
  public static void main(String[] args) {
    int x = 50;
    int y = 60;

    if(x == y) {
      System.out.println("x는 y와 같습니다.");
    } else if(x > y) {
      System.out.println("x는 y보다 큽니다.");
    } else {
      System.out.println("x는 y와 다릅니다.");
    }
  }
}
*/

/*
테스트2
class Main {
  public static void main(String[] args) {
    int value = 6;

    if (value % 3 == 0) {
      System.out.println(value+"는 3의 배수입니다.");
    }
  }
}

class Main {
  public int IfTest(int value) {
    // 변수가 value가 선언됐다고 가정
    int ret = 0; //초기화
    if(value % 3 == 0) {
      ret = 3;
    } else if(value % 4 == 0) {
      ret = 4;
    }
    return ret;
  }
  public static void main(String[] args) {
    Main exam = new Main();
    System.out.println(exam. IfTest(6)); //3
    System.out.println(exam. IfTest(8)); //4
  }
}
*/

/*
// switch case 구문: if문과 비슷하지만 좀 더 절차를 단순화하는 조건판단문이다.

public class Main {
  public static void main(String[] args) {
    int month = 8;
    String monthString = "";

    switch (month) {
      case 1: monthString = "Jan";
      break;
      case 2: monthString = "Feb";
      break;
      case 3: monthString = "Mar";
      break;
      case 4: monthString = "Apr";
      break;
      case 5: monthString = "May";
      break;
      case 6: monthString = "Jun";
      break;
      case 7: monthString = "Jul";
      break;
      case 8: monthString = "Aug";
      break;
      case 9: monthString = "Sept";
      break;
      case 10: monthString = "Oct";
      break;
      case 11: monthString = "Nov";
      break;
      case 12: monthString = "Dec";
      break;
    }
    System.out.println(monthString);
  }
}

//만약 위 식을 if문으로 만든다면
public class Main {
  public static void main(String[] args) {
    int month = 8;
    
    if(month == 1) {
      System.out.println("Jan");
    } else if (month == 2) {
      System.out.println("Feb");
    } else if (month == 3) {
      System.out.println("Mar");
    } else if (month == 4) {
      System.out.println("Apr");
    } else if (month == 5) {
      System.out.println("May");
    } else if (month == 6) {
      System.out.println("Jun");
    } else if (month == 7) {
      System.out.println("Jul");
    } else if (month == 8) {
      System.out.println("Aug");
    } else if (month == 9) {
      System.out.println("Spet");
    } else if (month == 10) {
      System.out.println("Oct");
    } else if (month == 11) {
      System.out.println("Nov");
    } else if (month == 12) {
      System.out.println("Dec");
    }
  }
}

import java.util.Calendar;
public class Main{
  public static void main(String[] args) {
    int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
    //0부터 시작하기 때문에 +1을 해준 것
    String season = "";

    switch (month) {
      case 1: season = "Winter";
      case 2: season = "Winter";
      break;
      case 3: season = "Spring";
      case 4: season = "Spring";
      case 5: season = "Spring";
      break;
      case 6: season = "Summer";
      case 7: season = "Summer";
      case 8: season = "Summer";
      break;
      case 9: season = "Auntumn";
      case 10: season = "Auntumn";
      case 11: season = "Auntumn";
      break;
      case 12: season = "Winter";
      break;
    } //어차피 3개월치는 다 같은 계절이기 때문에 중간에 break 걸 필요도 없음
    System.out.println(season);
  }
}

//심지어 아래처럼 더 간략화할 수 있음
import java.util.Calendar;
public class Main{
  public static void main(String[] args) {
    int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
    String season = "";

    switch (month) {
      case 12: case 1: case 2: 
      season = "Winter";
      break;
      case 3: case 4: case 5: 
      season = "Spring";
      break;
      case 6: case 7: case 8: 
      season = "Summer";
      break;
      case 9: case 10: case 11: 
      season = "Auntumn";
      break;

    }
    System.out.println(season);
  }
}

//if문으로 바꾸면 아래와 같이 됨
import java.util.Calendar;
public class Main{
  public static void main(String[] args) {
    int month = Calendar.getInstance().get(Calendar.MONTH) + 1;

    if(month <= 2 || month == 12) {
      System.out.println("Winter");
    } else if (month <= 5) {
      System.out.println("Spring");
    } else if (month <= 8) {
      System.out.println("Summer");
    } else if (month <= 11) {
      System.out.println("Autumn");
    }
  }
}
*/

/*
//while(반복문) - 조건이 참일 때만 계속 반복실행한다.
public class Main{
  public static void main(String[] args) {
    int i = 0;

    while(i < 10) {
      i++; //i=i+1 또는 i+=1
      System.out.println("나무를 " + i + "번 찍었습니다.");
      if (i == 10) {
        System.out.println("나무 넘어간다~");
        break; //반복이기 때문에 다시 위로 올라니까 break로 끊어주는 것. 반복실행에서 빠져나가게 해주는 것.
      }
    }
  }
}

public class Main{
  public static void main(String[] args) {
    int coffee = 10;
    int money = 300;

    while(money > 0) {
      System.out.println("커피를 드립니다.");
      coffee --;
      System.out.println("남은 커피는 " + coffee + "입니다.");

      if (coffee == 0) {
        System.out.println("커피가 다 떨어졌습니다. 판매를 종료합니다.");
        break;
      }
    }
  }
}

//continue: 조건에 맞는 경우 실행하지 않고 다시 반복문의 처음으로 돌아가도록 하는 방법

public class Main{
  public static void main(String[] args) {
    int i = 0;

    while (i <= 10) {
      i++;
      if (i % 2 == 0) {
        continue;
      } System .out.println(i);
    }
  }
}

// 1~10까지 숫자 모두 보이게 하는 방법
public class Main{
  public static void main(String[] args) {
    int i = 0;

    while (true) {
      i++;
      if (i == 11) {
        break;
      } System .out.println(i);
    }
  }
}

// 1부터 100까지 차례대로 더한 값을 모두 보이게 하는 방법
public class Main{
  public static void main(String[] args) {
    int sum = 0;
    int i = 1;

    while (i <= 100) {
      i++;
      sum = sum + i;
      System .out.println("i = "+ i +" sum =" + sum);
    }
  }
}
*/

/*
public class Main{
  public static void main(String[] args) {
    int i = 1;
    
    while (i < 11) {
      i++;
      if (i % 2 == 1) {
        System.out.println(i);
      }
    }
  }
}
*/

/*
//do~while: 조건이 참일 때 반복실행하나, while과의 차이점은 무조건 한번은 반드시 실행됨

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    int i = 0;
    Scanner scan = new Scanner(System.in);

    do {
      i = scan.nextInt();
      System.out.println("입력받은 값:" +i);
    } while(i != 0);
      System.out.println("종료");
  }
}

import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int value = 0;
    int sum = 0;

    do {
      value = scan.nextInt();
      sum += value;
    } while (value < 100);
    System.out.println("sum:" +sum);
  }
}

public class Main{
  public static void main(String[] args) {
    int sum = 0;

    for (int i = 1; i <= 100; i++) {
      //Start; Stop; Step
      sum = sum + i;
      System.out.println("i = "+ i +" sum =" + sum);
    }
  }
}
*/

/*
//테스트: 1부터 100까지의 수 중 홀수들의 누적합계를 continue를 사용하여 구하시오.
public class Main{
  public static void main(String[] args) {
    int sum = 0;

    for (int i = 1; i <= 100; i++) {
      if (i % 2 == 0) {
        continue;
      } sum = sum + i;
    } System.out.println(sum);
  }
}
//또는 continue가 아닌 break를 사용한다면
public class Main{
  public static void main(String[] args) {
    int sum = 0;

    for (int i = 1; i <= 100; i++) {
      if (i == 50) {
        break;
      } sum = sum + i;
    } System.out.println(sum);
  }
}
*/

/*
//for each (=for)
public class Main{
  public static void main(String[] args) {
    
    String[] number = {"one", "two", "three"};
    for (int i = 0; i < number.length; i++) {
      System.out.println(number[i]);
    }
  }
}
//여기서 만약 for each를 쓴다면 아래와 같음
public class Main{
  public static void main(String[] args) {
    
    String[] number = {"one", "two", "three"};
    for (String num: number) {
      System.out.println(num);
    }
  }
}

public class Main{
  public static void main(String[] args) {
    
    // if (5 > 4) {
      // System.out.println(50);
    // } else {
    //   System.out.println(40);
    // }
    //위에 식을 if를 사용하지 않고 표현하기
    System.out.println((5>4) ? 50:40);
    //?:true, ::false
  }
}
*/