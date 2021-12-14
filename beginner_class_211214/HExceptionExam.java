public class HExceptionExam {
    public static void main(String[] args) {
        
        try {
            int [] array = new int[10];
            array[20] = 5;
        } catch(Exception e) {
            System.out.println("배열의 범위를 지나쳤어요.");
        } finally {
            System.out.println("성공");
        }
    }
}
