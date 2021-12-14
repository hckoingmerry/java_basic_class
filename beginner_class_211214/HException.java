public class HException {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        try {
            int k = i/j;
            System.out.println(k);
        } catch(ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.\n" + e.toString());
        } finally {
            System.out.println("에러 발생 여부와 상관없이 항상 실행");
        }
        System.out.println("main end!!");
    }
}