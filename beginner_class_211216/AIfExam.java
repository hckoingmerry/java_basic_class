public class AIfExam {
    public static void main(String[] args) {
        
        //제어문(Control Statement): if, Switch
        /* if문
        - 코드의 제일 위에서부터 아래로 한 문장식 순차적으로 진행되는 프로그램의 흐름을 조절하여 일부분은 건너뛰기도 하고, 다시 위에서부터 내려올 수 없게 제어한다.
        - if문은 항상 {}(블럭)처리를 해줘야 함. 그래야 그 안에 조건이 true인지 false인지 판단됨

        ex)
        int score = 80;
        if (score > 60) { // 80>60이기 때문에 true
            System.out.println("합격입니다.")
        }

        (90 <= x && x <= 100) 점수 x가 90점 이상 100점 이하 동시 만족
        (x < 0 || x > 100) 점수 x가 0 미만 또는 100 초과 하나만 만족
        (x % 3 == 0 && x % 2 != 0) x가 3의 배수이면서 동시에 2의 배수는 아닌 조건
        */

        /* if ~ else if 구문
        else if는 처리해야 할 경우의 수가 3개 이상이면 else if구문으로 구분하여 사용
        else는 그 밖의 나머지 모든 것

        ex)
        if (조건식1) {
            true...
        } else if (조건식2) {
            true...
        } else {
            else...
        }
        */

        /*
        Quiz. 점수를 입력받아 98 이상이면 A+, 94 이상이면 A, 90 이상이면 A-
        
        int x = 91;
        if (x >= 90) {
            System.out.println(x >= 98 ? "A+" : x >= 94 ? "A" : "A-");
        } else if (x >= 80) {
            System.out.println(x >= 88 ? "B+" : x >= 84 ? "B" : "B-");
        } else if (x >= 70) {
            System.out.println(x >= 78 ? "C+" : x >= 74 ? "C" : "C-");
        } else if (x >= 60) {
            System.out.println(x >= 68 ? "D+" : x >= 64 ? "D" : "D-");
        } else {
            System.out.println("F");
        }
        */


        /* Switch 구문
        - if문의 경우 항목이 많아질수록 코드 가독성이 많이 떨어지고, 평균적인 처리시간도 길어지게 된다.
        - 하지만 Switch문은 보다 간결하고 알아보기 쉽다.
        - 그래서 보통 처리해야 하는 경우의 수가 아주 많을 경우에 Switch를 씀.
        - Switch로 만든 구문은 모두 if로도 구현할 수 있지만, if문의 모든 구문을 switch로 구현할 수는 없다.
        - Switch 구문의 조건식의 결과는 정수 또는 문자열이다.

        1. 조건식을 계산
        2. 조건식을 만족하는 case문으로 이동
        3. 해당 case문의 구문을 실행
        4. break 만나기 전까지 모든 구문을 전부 실행
        */

        /*
        Quiz. 특정 월을 입력받아서 3,4,5 봄, 6,7,8 여름, 9,10,11 가을, 12,1,2 겨울
        "?월의 계절은 ?입니다."
        조건: switch 구문의 총 줄 수는 11줄 이내로 작성
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String season = "";
        switch(a) {
            case 3: case 4: case 5: season = "봄"; break;
            case 6: case 7: case 8: season = "여름"; break;
            case 9: case 10: case 11: season = "가을"; break;
            case 12: case 1: case 2: season = "겨울"; break;
        } System.out.println(a + "월의 계절은 " + season + "입니다.");
        */

        /*
        Quiz. 가위(1) 바위(2) 보(3) 중 하나를 입력하세요 >1
        당신은 가위이고, 컴퓨터는 바위입니다.
        컴퓨터가 이겼습니다.

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("가위(1) 바위(2) 보(3) 중 하나를 입력하세요.> "); int me = sc.nextInt();
        int com = 1 + rand.nextInt(3);

        System.out.printf("당신은 %d이고 컴퓨터는 %d입니다. ", me, com);
    
        switch(me-com) {
        case 2: case -1:
        System.out.println("컴퓨터가 이겼습니다."); break;
        case 1: case -2:
        System.out.println("당신이 이겼습니다."); break;
        case 0:
        System.out.println("비겼습니다.");
        }
        */

        /*
        Quiz. 주민등록번호를 입력하세요 >
        "당신은 남성입니다."
        "당신은 여성입니다."

        Scanner sc = new Scanner(System.in);
        System.out.println("주민등록번호를 입력하세요.");
		String id = sc.next();
		
		char i = id.charAt(7);
		switch(i) {
		case '1': case '3': System.out.println("남자");break;
		case '2': case '4': System.out.println("여자");break;
        }
        */
    }
}
