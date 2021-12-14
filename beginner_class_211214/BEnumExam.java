public class BEnumExam {
    public static final String MALE="MALE";
    public static final String FEMALE="FEMALE";
    //static 객체 생성 없이도 접근하여 사용 허용
    //final를 상수로 선언
    //String 문자열로
    //상수형태로 선언할 경우네는 대문자를 사용한다.

    public static void main(String[] args) {
        String gender1;

        gender1 = BEnumExam.MALE;
        gender1 = BEnumExam.FEMALE;

        gender1 = "boy";

        Gender gender2;
        gender2 = Gender.MALE;
        gender2 = Gender.FEMALE;


    }
}
enum Gender {
    MALE, FEMALE;
}