package beginner_class_211230;

import java.util.Stack;

public class CStackExam1 {

	public static Stack back = new Stack();
	public static Stack forward = new Stack();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		goURL("1.네이트");
		goURL("2. 구글");
		goURL("3. 네이버");
		goURL("4. 다음");
		
		printStatus();
		
		goBack();
		System.out.println("= 뒤로 버튼을 누른 후 =");
		printStatus();
		
		goForward();
		System.out.println("= 뒤로 버튼을 누른 후 =");
		printStatus();
		
		goURL("austiny.snu.ac.kr");
		System.out.println("= 새로운 주소로 이동 =");
	}
	public static void printStatus() {
		System.out.println("back: " + back);
		System.out.println("forard" + forward);
		
		System.out.println("현재 화면은 '" + back.peek() +"' 입니다.");
		System.out.println();
	}
	public static void goURL(String url) {
		back.push(url);
		if(!forward.empty()) {
			forward.clear();
		}
	}
	public static void goForward() {
		if (!forward.empty()) {
		back.push(forward.pop());
		}
	}
	public static void goBack() {
		if (!back.empty()) {
			forward.push(back.pop());
		}
	}
}
