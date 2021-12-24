package beginner_class_211224;

/* 예외처리(Exception Handling)
 * - 프로그램이 실행 중 어떤 원인에 의해 오작동하거나 비정상적인 종료가 되는 경우가 있다.
 * - 이러한 결과를 초래하는 원인을 에러 또는 오류라고 한다. 이걸 처리하는 것이 '예외처리'
 * - 즉 프로그램 실행 시 발생할 수 있는 예기치 못한 예외의 발생에 대비한 코드를 작성하는 것을 말하며,
 * - 예외 발생으로 인한 프로그램의 비정상적인 종료를 막고 정상적인 실행상태를 유지할 수 있도록 하는 것이다. 
 * - 컴파일에러, 런타임에러, 논리적에러 등이 있음
 * 
 * 컴파일 에러: 컴파일 시 발생하는 에러 - 프로그램 진입 불가
 * 			- 오타나 잘못된 구문, 잘못된 자료형 등 기본적인 검사를 수행하여 오류를 확인
 * 런타임 에러: 실행 중에 발생하는 에러 - 프로그램 진입 후 실행 불가
 * 			- 컴파일 시 에러가 발생하지 않았다고 하더라도 프로그램이 동작 중에 에러가 발생할 수 있음.
 * 			- 프로그램 실행 중 동작을 멈춘 상태로 오랜시간 지속되거나 갑자기 프로그램이 실행을 멈추고 강제종료되는 경우 등
 * 논리적 에러: 실행 후 발생하는 에러 - 프로그램 진입 후 실행 후 원하는 결과 도출 불가 (의도와 다르게 동작함)
 * 			- 이는 그냥 프로그래머 실수로, 예외처리 얘기할 때는 주로 위 2개만을 얘기함
 * 
 * 굳이 구분해보자면:
 * 에러(error): 프로그램 코드에 의해 수습될 수 없는 심각한 오류
 * 예외(exception): 프로그램 코드에 의해 수습될 수 있는 다소 미약한 오류
 * 자바에서는 발생할 수 있는 오류를 Exception과 Error 클래스로 정의하고 있다.
 * 
 * try-catch 구문
 * 에러는 (수습불가라서) 어쩔 수 없지만, 예외는 프로그래머가 그에 대한 처리를 미리 해줘야 한다.
 * try {
 * 		//예외가 발생할 가능성이 있는 문장들을 넣는다.
 * } catch (Exception e) {
 * 		//예외가 발생 시 예외 처리 구문
 * } finally {
 * 		//예외 발생 유무와는 상관없이 항상 실행 (생략 가능)
 * }
 * 
 * 1. 발생한 예외와 일치하는 catch블록이 있는지 확인한다. (catch가 여러 개 존재 가능)
 * 2. 일치하는 catch블록을 찾게 되면 그 블록의 문장을 수행하고 빠져나간다.
 * 예외가 발생하지 않는 경우는 catch를 거치지 않고 빠져나간다.
 * throw를 통해 예외를 강제 발생시킬 수 있다.
 * 
 * 예외처리 방법
 * 1. method1() 예외처리: 예외가 발생한 그 해당 위치에서 바로 예외처리
 *					- 호출한 main은 method1()에서 에러가 발생했는지조차 알 수가 없음
 * 2. main() 예외처리: 예외 발생시 메서드를 호출한 지점에서 예외를 받아서 처리
 * 					- 예외를 돌려받게 되면 예외를 인지할 수 없게 됨
 * 3. finally블럭: 예외의 발생 여부와는 상관없이 어떤 경우에도 실행되는 코드들을 포함한다.
 * 				- 선택적으로 사용 여부를 결정할 수 있지만 필수는 아니다.
 * 
 * 
 * 예외가 예외를 발생시킨다. (chained exception)
 * 예외A가 예외B를 발생시킨다면 A를 B의 '원인 예외(cause exception)'이라고 한다.
 * try {
 * 		startinstall();
 * 		copyFiles();
 * } catch (SpaceException e) {
 * 		installException ie = new InstallException("설치 중 발생);
 * 		ie.intiCause(e); //Install Exception의 원인 예외를 지정
 * 		throw ie;
 * } catch (MemoryException me) {
 * 	.... 등등
 */

public class CExceptionExam {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		int num = 100;
		int result = 0;
		for (int i = 0; i < 10; i++) {
			try {
				result = num / i;
				System.out.println(result);
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
		}
		*/
		
		/*
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			//System.out.println(0/0); //만약 이게 추가되면, 예외발생 즉시 catch로 넘어가기 때문에 3은 출력되고 4는 출력되지 않는다. 
			System.out.println(4);
		} catch (Exception e) {
			System.out.println(5); //하지만 예외가 없기 때문에 5는 출력되지 않는다.
		}
		System.out.println(6);
		*/
		
		/*
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch (ArithmeticException ae) {
			if (ae instanceof ArithmeticException)
				System.out.println("true");
			System.out.println("ArithmeticException"); //여기가 출력될 것. 왜냐하면 이건 특정 에러를 지칭하는데, 특정과 모두가 같이 있다면 특정이 우선시됨
		} catch (Exception e) {
			System.out.println("Exception");
		}
		System.out.println(6);
		*/
		
		/*
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch (ArithmeticException ae) {
			System.out.println("에러메세지: " + ae.getMessage()); //어떤 에러인지 보여줌
		}
		System.out.println(6);
		*/
		
		/*
		//예외 강제 발생
		try {
			Exception e = new Exception("예외 강제 발생");
			throw e;
			//아니면 그냥 throw new Exception("예외 강제 발생") 이렇게 한줄로 쓸 수도 있음
		} catch (Exception e) {
			System.out.println("에러 메세지: " + e.getMessage());
		}
		System.out.println("프로그램 종료");
		*/
		
		/*
		//예외 강제 발생 (더 짧게)
		System.out.println("예외 발생");
		throw new RuntimeException();
		*/
	
	/*
	//예외 처리
	public static void main(String[] args) throws Exception {
		method1(); //같은 클래스 내에서 static이면 객체 생성없이 바로 호출 가능
	}
	static void method1() throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1에서 예외 처리되었습니다.");
		}
	}
	static void method2() throws Exception {
		throw new Exception();
	}
}
//위를 출력하면 이렇게 됨
Exception in thread "main" java.lang.Exception
	at beginner_class_211224_exceptionExam.ExceptionExam.method2(ExceptionExam.java:125)
	at beginner_class_211224_exceptionExam.ExceptionExam.method1(ExceptionExam.java:122)
	at beginner_class_211224_exceptionExam.ExceptionExam.main(ExceptionExam.java:119)
1. 예외가 발생했을 때 3개의 메서드가 실행되었고
2. 예외가발생한 곳은 method2이며,
3. main메서드가  method1(), method1()이 method2()를 호출했다는 것을 알 수 있다.
*/

	/*
	public static void main(String[] args) throws Exception {
		method1();
	}
	static void method1() throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1에서 예외 처리되었습니다.");
		}
	}
	static void method2() throws Exception {
		throw new Exception();
	}
	*/
	
	/*
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("메인에서 예외를 처리");
		}
	}
	static void method1() throws Exception {
		throw new Exception();
	}
	*/
	
	
	public static void main(String[] args) {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("에러");
		} finally {
			System.out.println("항상 실행");
		}
	}
}

	
	