public class DCar {
    public void run() {
        System.out.println("RUN!!!");
    }

    public static void main(String[] args) {
        DCar car = new DCar();
        car.run();
        //bus.ppangppang();
        //부모 클래스로 만든 인스턴스 car는 부모 즉 자신의 자원은 쓸 수 있지만 자식 즉 bus의 메서드는 사용할 수 없다.
    }
}
