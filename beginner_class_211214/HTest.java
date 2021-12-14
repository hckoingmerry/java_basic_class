public class HTest {
    public void sayNick(String nick) throws HFoolException {
            if("fool".equals(nick)) {
                throw new HFoolException();
            } System.out.println("당신의 별명은 " + nick + "입니다.");
    }
    
    public static void main(String[] args) {
        HTest test = new HTest();
        try {
            test.sayNick("fool");
            test.sayNick("genious");
        } catch(HFoolException e) {
            System.out.println("에러가 발생했습니다.");
        }
        
    }
}
