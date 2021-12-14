public class ACarExam {
    public static void main(String[] args) {
        //생성자는 반드시 1개 이상 존재해야 한다.
        //개발자가 만들지 않으면 자동으로 기본생성자
        ACar c2 = new ACar("Grandeur");

        System.out.println(c2.name);
    }
}
