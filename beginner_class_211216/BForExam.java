/*
for 반복문:
- 어떤 작업을 반복적으로 수행되도록 할 때 사용 (주로 반복횟수를 정확히 특정할 때 사용됨)
- 문법이 직관적이라 가독성이 좋음

for (start; stop; step)
초기값: 반복문에 사용할 변수를 초기화 처음에 딱 한번만 실행한다. 보통은 변수를 하나만 사용하지만 2개 이상도 사용 가능하다.
조건식: 조건식의 값이 참일 경우에만 계속 반복 실행. 거짓이 되는 경우 반복 종료한다. 조건식을 잘못 설정할 경우 한번도 실행되지 않는 경우 또는 영원히 반복되는 경우도 발생 가능
증감식: 초기값, 조건식, 증감식 전부 혹은 하나도 생략 가능하다.
*/

/*
public class BForExam {
    public static void main(String[] args) {
      int i;

      for (i = 1; i <= 5; i++) {
        System.out.println(i);
      } System.out.print(i);
    }
}
*/
/*
//Quiz. 1부터 10까지의 합을 출력하시오. 단 누계값까지 출력하시오.
public class BForExam {
    public static void main(String[] args) {
      int sum = 0;
      for(int i = 1; i <= 10 ; i++) {
        System.out.printf("1부터 %d까지의 합: %d%n", i, sum += i);
      }
  }
}

//Quiz. 1에서 10으로, 옆에서는 10에서 1로 열거
public class BForExam {
  public static void main(String[] args) {

    for (int i = 1, j = 10 ; i <= 10 ; i++, j--) {
      System.out.printf("%d \t %d\n", i, j); // /t: 일정간격 띄기
    }
  }
}

//Quiz. 구구단
public class BForExam {
  public static void main(String[] args) {
    for (int i = 2; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
        System.out.printf("%d * %d = %d\t", i, j, i*j);
      } System.out.println();
    }
  }
}

//Quiz. * 개수에 맞게 삼각형 만들기
public class BForExam {
  public static void main(String[] args) {
    int num = 5;
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      } System.out.println();
    }
  }
}


//Quiz. * 개수에 맞게 역삼각형 만들기
public class BForExam {
  public static void main(String[] args) {

    for (int i = 1; i <= 5; i++) {
      for (int j = 5; j >= i; j--) {
        System.out.print("*");
      } System.out.println();
    }
  }
}
*/

/* 향상된 for 구문
for each


public class BForExam {
  public static void main(String[] args) {
    
    int[] arr = {1,2,3,4,5};
    
    //그냥 for로 하면 이렇게 함
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    
    //for each로 하면 이렇게 됨
    for (int i : arr) {
      System.out.println(i);
    }

    //거기에 총합까지 더하려면
    int sum = 0;
    for (int i : arr) {
      System.out.println(i);
      sum += i;
    } System.out.printf("총합은 %d입니다.", sum);

    //거기에 개수까지 구한다면
    int sum = 0;
    int count = 0;
    for (int i : arr) {
      System.out.println(i);
      sum += i;
      count = i;
    } System.out.printf("총합은 %d입니다.\n", sum);
      System.out.printf("총 개수는 %d입니다.", count);
  }
}
*/