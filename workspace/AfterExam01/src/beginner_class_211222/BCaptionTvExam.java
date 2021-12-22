package beginner_class_211222;

class Tv {
	boolean power; //전원
	int channel; //채널
	
	void power( ) {} //전원 기능
	void channelUp() {} //채널 올림 기능
	void channelDown() {} //채널 내림 기능
}

//class Tv를 상속받는 자식 만들기
class CaptionTv extends Tv {
	boolean caption;
	void caption() {} //캡션 기능
}

public class BCaptionTvExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaptionTv tv = new CaptionTv();
		tv.power();
		tv.channel = 11;
		tv.channelUp();
		System.out.println(tv.channel); //11
		
		tv.caption = true;
		tv.caption();
		System.out.println(tv.caption); //true
	}

}
