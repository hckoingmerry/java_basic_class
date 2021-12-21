/*
do~while은 while의 변형으로
- 기본 구조는 같지만
- 경우에 따라 한번도 실행되지 않을 수 있는 while에 반해
- do~while은 무조건 한번은 실행함
*/

/*
Quiz. 스무고개 게임
1~100 사이의 난수를 하나 생성해서,
1과 100 사이의 정수를 입력하세요>>
더 작은 값으로 다시 입력하세요.
1과 100 사이의 정수를 입력하세요.
더 큰 값으로 다시 입력하세요.
정답입니다. 총 시도한 횟수는 ?번입니다.

import java.util.Random;
import java.util.Scanner;
public class BDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        Random rand = new Random();
        int r = rand.nextInt(99)+1;
        int count = 0; //시도 횟수

        do {
            System.out.println("1과 100 사이의 정수를 입력하세요."); a = sc.nextInt();
            if (a > r) {
                System.out.println("더 작은 값으로 다시 입력하세요.");
                count++;
            } else if (a < r) {
                System.out.println("더 큰 값으로 다시 입력하세요.");
                count++;
            }
        } while (a != r);
        System.out.print("정답입니다. 총 시도한 횟수는" + count + "입니다.");
    }
}
*/

/* Quiz. 369게임
100 이하에서 3,6,9가 들어가는 숫자에서 "짝"을 출력하시오.

import java.util.Scanner;
public class BDoWhile {
    public static void main(String[] args) {
        System.out.println("100 이하에서 3,6,9가 들어가는 숫자에서 짝을 출력하시오.");
        
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            int tmp = i;
            do {
                if (tmp%10%3==0 && tmp%10!=0) {
                    System.out.print("짝");
                }
            } while ((tmp/=10)!=0);
            //tmp/=10 => tmp=tmp/10
            System.out.println();
        }
    }
}
*/

/*Quiz. 100 이하에서 3의 배수만 출력하시오. (for-continue 사용)
public class BDoWhile {
    public static void main(String[] args) {
        System.out.println("100 이하에서 3의 배수만 출력하시오.");
        
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0) continue; {
                System.out.println(i);
            }
        }
    }
}
*/


/*이름붙은 반복문: break문은 근접한 단 하나의 반복문을 벗어날 수 있다.
여러개의 반복문이 중첩된 경우 break만으로는 완전히 벗어날 수 없다.
그럴 때 쓰는 방법 - loop:-break loop: */

/*구구단 2단만 찍는다고 했을 때
public class BDoWhile {
    public static void main(String[] args) {
        loop:
        for (int i = 2; i <= 9; i++) {
           for (int j = 1; j <= 9; j++) {
               if (j == 5) break loop;
               System.out.println(i + "*" + j + "=" + i*j);
           } System.out.println();
       }
    }
}
*/


