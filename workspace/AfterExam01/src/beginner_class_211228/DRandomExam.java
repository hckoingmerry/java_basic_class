package beginner_class_211228;

import java.util.Random;
public class DRandomExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* Random()
 * 난수를 구하는 Math.random()과의 가장 큰 차이점은 바로 종자값을 설정할 수 있다는 점
 * - 종자값이 같은 Random 객체들은 항상 같은 난수를 갖는다.
 */
		
		Random rand = new Random(10); //seed값 10 설정
		Random rand2 = new Random(10);
		for (int i = 0; i < 5; i++) {
			System.out.println(rand.nextInt());
		}
		for (int j = 0; j < 5; j++) {
			System.out.println(rand2.nextInt());
		}
	}

}
