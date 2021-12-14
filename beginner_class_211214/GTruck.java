public class GTruck extends GCar {
    
    int fee;

    public GTruck(String name, int number, int fee) {
    
        //super를 이용해 GCar클래스의 생성자를 이용하기
        super(name, number);
        this.fee = fee;
    }
}
