public class LedTV implements TV {
    // LedTV클래스는 TV인터페이스를 구현했다.
    //TV 인터페이스에 정의된 메서드는 모두 구현해야만 한다.
    
    // @_____ (annotation): 확인요청 (필수는 아님)
    @Override
    public void turnOn() {
        System.out.println("TV on");
    }
    @Override
    public void turnOff() {
        System.out.println("TV off");
    }
    @Override
    public void changeVolume(int volume){
        System.out.println("Volume Change");
    }
    @Override
    public void changeChannel(int channel){
        System.out.println("Channel Change");
    }
}
