public class CWhileExam {
    public static void main(String[] args) {
        
        /* while 반복문
        - for에 비해서 구조가 간단하다.
        - 조건식이 참일 동안 반복 수행한다.
        - 조건식 생략 불가, 보통 조건식에 true를 넣어 무한반복 수행
        */

        /*
        //Quiz1. While문을 사용하여 카운트 다운 시작
        System.out.println("카운트 다운 시작");
        int i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;
            Long j = 99_999_999L;
            while(j >= 0) {
                j--;
            }
        } System.out.println("Awesome!!");
        

        //Quiz2. 숫자를 입력하면 각 자리의 숫자들의 합을 계산하여 출력하세요.
        int num = 321;
        int sum = 0;

        while(num != 0) {
            sum += num % 10;
            num /= 10;
        } System.out.printf("각 자리수의 합: %d", sum);
        */

        //Quiz3. 왼쪽에는 1에서 차례대로, 오른쪽은 왼쪽 숫자를 더한 만큼
        int i = 1;
        int sum = 0;
        while (i <= 10) {
            sum += i;
            System.out.println(i + "-" + sum);
            i++;
        }
    }
}
