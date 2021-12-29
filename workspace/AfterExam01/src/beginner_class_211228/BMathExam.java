package beginner_class_211228;

public class BMathExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* Math 메서드
 * - 기본적인 수학계산에 유용한 메서드들로 구성되어 있음
 * - Math의 생성자는 접근제어자 private()이기 때문에 다른 클래스에서는 Math 객체를 생성할 수 없다.
 * - Math의 메서드는 모두 static
 */
		
		double val = 90.7552;
		System.out.println(Math.round(val)); //반올림
		
		val = val * 100;
		System.out.println(val);
		System.out.println(Math.round(val)/100);
		System.out.println(Math.ceil(val)/100);
		System.out.println(Math.floor(val)/100);
		System.out.println(Math.ceil(val)/100);
		
		
		double d = Math.random();
		System.out.println(d);
		//random(): 0.0 ~ 1.0 사이, 즉 %값 형태로 난수를 발생시킴
		
		int i = (int)(Math.random() * 10);
		System.out.println(i); //0~10 사이
	}

}
