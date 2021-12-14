public class GTruck extends GCar {
    public GTruck() {
        int fee;
        public GTruck(String name, int number, int fee) {
            
            //super를 이용해 GCar클래스의 생성자를 이용하기
            super("트럭");
            this.fee = fee;
        }
    }
}
