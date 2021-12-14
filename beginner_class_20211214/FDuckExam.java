public class FDuckExam {
    public static void main(String[] args) {
        FDuck duck = new FDuck();
        duck.sing();
        duck.fly();

        //FBird b = new FBird();
        //추상클래스는 부모 클래스로는 사용할 수 있지만, 객체를 생성할 수는 없다.
        
        //추상클래스는 abstract 키워드를 클라스 앞에 사용한다.
        //추상클래스는 추상메서드(인터페이스/명령서처럼)를 포함할 수 있다.
        //추상메서드도 abstract 키워드를 붙인다.
        //추상메서드는 객체 생성이 불가능하다.
    }
}
