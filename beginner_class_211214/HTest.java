public class HTest {
    public void sayNick(String nick) {
        try {
            if("fool".equals(nick)) {
                throw new HFoolException();
            } System.out.println("당신의 별명은 " + nick + "입니다.");
        } catch(HFoolException e) {
            System.out.println("에러가 발생했습니다.");
        }
    }
    
    public static void main(String[] args) {
        HTest test = new HTest();
        test.sayNick("fool");
        test.sayNick("genious");
    }
}
