public class AVariableExam {
    //전역변수의 선언 - 위치가 클래스 블록 안에. 그래서 범위는 클래스 전체가 됨
    int globalScope = 10;
    static int staticVaL = 7;

    public void scopeTest(int value) {
        //지역변수의 선언 - 위치가 매서드 블록 안에. 그래서 범위는 매서드에 제한됨
        int localScope = 20;
        
        System.out.println(globalScope);
        System.out.println(localScope);
        System.out.println(value);
        //Static 변수는 static을 선언하지 않은 메서드 내에서는 사용을 해도 문제가 되지 않는다.
    }

    public static void main(String[] args) {
        
    }
}
