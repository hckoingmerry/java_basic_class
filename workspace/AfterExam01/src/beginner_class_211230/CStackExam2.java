package beginner_class_211230;

import java.util.Stack;

public class CStackExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack st = new Stack();
		String expression = "((2 + 3) * 1) + 3";
		
		try {
			for (int i = 0; i < expression.length(); i++) {
				char ch = expression.charAt(i);
				
				if (ch =='(') {
					st.push(ch +"");
				} else if (ch == ')') {
					st.pop();
				}
				System.out.println(st);
			}
			if (st.isEmpty()) {
				System.out.println("괄호가 일치합니다.");
			} else {
				System.out.println("괄호가 일치하지 않습니다.");
			}
		} catch (Exception e) {
			System.out.println("괄호가 일치하지 않습니다.");
		}
	}
}
