public interface TV {
    public int MIN_VOLUME=0;
    public int MAX_VLOUME=100;
    public void turnOn();
    public void turnOff();
    public void changeVolume(int volume);
    public void changeChannel(int channel);
}
