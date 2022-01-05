package beginner_class_211230;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CStackExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Stack & Queue (스택과 큐)
 * 
 * LIFO(Last in First out): 마지막에 들어간 데이터가 제일 먼저 나간다. 스택은 마지막에 저장한 데이터를 가장 먼저 꺼낸다.(ArrayList)
 * FIFO(First in First out): 처음에 들어간 데이터라 먼저 나온다. 큐는 처음에 저장한 데이터를 먼저 꺼낸다.(LinkedList)
 * 
 * 자바에서 스택은 Stack 클래스로 구현하여 제공, 한편 Queue는 인터페이스로만 저의해놓고 별도의 클래스 제공하지 않음.
 * Queue 인터페이스를 구현한 클래스를 선택하여 사용한다.
 * 
 * 스택과 큐의 활용
 * - 스택의 활용: 수식계산, 수식괄호검사, 웹브라우저의 앞/뒤, 워드에서 undo/redo 등
 * - 큐의 활용: 인쇄대기목록, 최근사용문서, 은행줄서기
 */
		Stack st = new Stack();
		Queue qu = new LinkedList();
		
		st.push("0");
		st.push("1");
		st.push("2");
		qu.offer("0");
		qu.offer("1");
		qu.offer("2");
		
		System.out.println("= Stack =");
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		System.out.println("= Queue =");
		while(!qu.isEmpty()) {
			System.out.println(qu.poll());
		}
	}

}
