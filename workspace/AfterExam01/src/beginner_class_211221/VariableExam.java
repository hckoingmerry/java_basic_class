package beginner_class_211221;


/* 선언 위치에 따른 변수의 종류
- 클래스 변수, 인스턴스(객체) 변수, 지역변수
- static 붙는 변수는 클래스 변수, 붙지 않으면 객체 변수

class XX 안에서라면, 전역변수라고 하며 2가지가 있음
- int a는 객체 변수 (객체 생성시 같이 생성됨. 독립적)
- static int a는 클래스 변수 (공유변수, 클래스가 메모리에 올라갈 때 생성됨)

void method() {} 안에서라면,
- int b = 0; 이건 지역 변수 (메소드 영역의 안쪽에서 선언)
*/
public class VariableExam {
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);
        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number);
        System.out.println("c2는 " + c2.kind + ", " + c2.number);

        c1.width = 50; //c1을 수정하였으나 Card.width도 같이 변경됨
        c1.height = 150;
        System.out.println("- 클래스변수 출력- ");
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);
        System.out.println("C2 변수 출력 = " + c2.width);
        System.out.println("C2 변수 출력 = " + c2.height);


    }
}
class Card {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}
//인스턴스 변수 즉 객체변수는 객체가 생성될 때마다 함께 생성되므로 객체마다 각기 다른 값을 유지할 수 있다.
//반면 클래스 변수는 모든 객체들이 하나의 저장공간을 공유한다.
//따라서 항상 같은 공통된 값을 갖는다.
