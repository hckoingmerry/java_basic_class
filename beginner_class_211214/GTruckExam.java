public class GTruckExam {
    public static void main(String[] args) {
        GTruck t = new GTruck("뛰뛰", 3000, 1050);
        if(t.name != "뛰뛰") {
            System.out.println("truck의 name이 다릅니다.");
        } else if (t.number != 3000) {
            System.out.println("truck의 number가 다릅니다.");
        } else if (t.fee != 1050) {
            System.out.println("truck의 fee가 다릅니다.");
        } else {
            System.out.println("정답입니다.");
        }
    }
}
