package beginner_class_211229;

import java.util.Scanner;

public class BScannerExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* Scanner: 문자데이터를 입력받는 목적
 * JDK1.5부터 추가되었으며, 정규표현식과 함께 쓸 수 있다.
 */
		
//퀴즈:
		Scanner sc = new Scanner(System.in);
		String[] argArr = null;
		while (true) {
			String input = sc.nextLine();
			argArr = input.split(" +"); //입력받은 내용을 공백으로 자른다 (공백의 개수는 랜덤)
			if (input.contentEquals("q")) {
				break;
			} else {
				for (String item: argArr) {
					System.out.println(item.toLowerCase());
				}
			} 
		}
	}

}
