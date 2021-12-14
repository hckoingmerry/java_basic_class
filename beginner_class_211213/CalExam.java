public class CalExam {
    static int result = 0;
    //static을 사용하면 객체 생성 없이도 접근 가능
    
    static int add(int num) {
        result += num; // result = result + num
        return result;
    }
}
