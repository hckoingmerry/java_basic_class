public class ACar {
    
    String name;
    int number;
    
    public ACar(String n) {
        this.name = n;
    }
    //생성자는 클래스명과 동일해야 하며, 리턴 타입과 리턴이 없다.(void도 없음)
    //생성자를 1개라도 만들지 않으면 자바가 자동으로 기본생성자를 만들지만, 1개라도 만들기만 하면 기본생성자는 만들지 않는다.
}
