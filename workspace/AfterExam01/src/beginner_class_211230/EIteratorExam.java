package beginner_class_211230;

import java.util.ArrayList;

public class EIteratorExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Iterator
 * - 저장된 요소에 접근하는 데에 사용된다. Enumeration은 Iterator의 구버전이며,
 * - ListIterator는 Iterator의 기능을 향상시킨 버전이다.
 * - List계열의 클래스들은 저장순서를 유지하는 반면, Set계열의 클래스들은 각 요소간의 순서가 유지되지 않는다.
 * - Iterator를 통해 저장된 요소를 읽어와도 처음에 저장된 순서와 같지 않다.
 */
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
	}

}
