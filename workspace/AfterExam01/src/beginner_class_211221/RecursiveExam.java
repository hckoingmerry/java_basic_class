package beginner_class_211221;

import java.util.concurrent.Flow;

/* 재귀호출
-매서드 내부에서 자기 자신 매서드를 다시 호출
-무한히 자기 자신을 호출하기 때문에 무한반복에 빠지게 된다.
-따라서 조건문을 통한 탈출이 필수적으로 따른다.
void method(int n) {
    if (n == 0) {
        return;
    }
    System.out.println(n);
    method(--n);
}
반복문은 같은 문장을 반복해서 수행하지만 재귀호출은 반목문보다 몇 가지 더 과정이 다 많이서 일반적으로 반북문보다 재귀호출이 수행시간이 더 오래 걸린다.
예를 들면 매개변수 복사 종료 후 복귀할 주소 저장 등등

왜 굳이 반복문 대신 재귀를 사용할까? 큰 이유는 재귀의 논리적 간결함 때문
재귀호출은 비효율적이므로 재귀 사용에 드는 비용보다 간결함이 주는 이득이 월등히 충분한 경우메나 사용할 것을 권장한다.

ex)
5! = 5*4*3*2*1
3! = 3*2*1
facfor(5)

public class RecursiveExam {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int result = 0;
        for (int i = 1; i < n; i++) {
            result = result + power(x, i);
        }
        System.out.println(result);
    }
    static int power(int x, int i) {
        if (i == 1) return x;
        return x * power(x, i-1);
    }
}

System.out.println(RecursiveExam.facfor(5));
System.out.println(RecursiveExam.facRecur(5))

static int facfor(int n) {
    int facto = 1;
    for(int i = 1; i <= n; i++) {
        facto *= i; //facto = facto * i
        System.out.println("i = " + i + " facto = " + facto);
    }
    return facto;
}

static int facrecur(int n) {
    int result = 0;
    if (n == 1) result = 1;
    else result = n * facrecur(n-1);
    return result;
}
*/
