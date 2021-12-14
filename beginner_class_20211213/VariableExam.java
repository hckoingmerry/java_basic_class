public class VariableExam {
    // 전역 변수와 지역 변수

    /*
    public void varTest(int a) {
        a++;
    }

    public static void main(String[] args) {
        int a = 1;
        VariableExam testvar = new VariableExam();
        testvar.varTest(a);
        System.out.println(a);
        //위에 a++이니까 2가 나올 거 같은데 실제로는 1이 나옴. 왜냐하면 위의 변수 a와 아래 a는 다른 요소가 된 것. 영향을 미칠 수 없음
        //만약 영향을 미치기 할 거면 아래 메서드의 integer 변수는 전역변수로 쓰기 위해 밖에서 선언해줘야 함
    }*/
    int a;

    public void varTest(VariableExam testvar) {
        testvar.a++;
    }

    public static void main(String[] args) {
        VariableExam testvar = new VariableExam();
        testvar.a = 1;
        testvar.varTest(testvar);
        System.out.println(testvar.a);
    }
}
//다만 전역변수 사용은 지양하는 것을 권장함 (영향을 모든 식에 다 미쳐버리니까)