import java.util.Scanner;
;public class ForExam {
    public static void main(String[] args) {
        //"lines?" 3이면 별이 3개
        //"lines?" 5면 별이 5개
        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Lines? ");
        num = sc.nextInt();

        for (int j = 0; j < num; j++) {
            for (int i = 0; i < num; i++) {
            System.out.print("*");
            }  System.out.println("");
        }
    } 
}
