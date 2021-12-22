package beginner_class_211222;


/* super
 * super와 this는 static에서는 사용할 수 없다.
 */
class Parent {
	int x = 10;
}

class Child extends Parent {
	int x = 20;
	void method() {
		System.out.println("x=" + x); //20
		System.out.println("this.x=" + this.x); //20
		System.out.println("super.x=" + super.x); //10
	}
}
public class DSuperExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Child c = new Child();
	c.method();
	}

}
