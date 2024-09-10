package chapter10;

public class Exception01 {

	public static void main(String[] args) {
		try {
			// 런타임 (언체크) 예외
			int division = 10 / 0;
			// 수를 0으로 나눌 수 없다.

		} catch (Exception e) { // exception (자동형변환) 타입
			// try 블록 내에서 발생하는 예외를 () 소괄호 내에서 매개변수로 전달받아
			// {} 실행문에서 처리
			// 매개변수의 형식 : 타입 변수명
			System.out.println("0으로 나눌 수 없습니다.");
		}
		System.out.println("정상적인 실행입니다.");
		System.out.println("====================");

		try {

			int division = 10 / 0;
			int[] numbers = new int[5];
			numbers[10] = 50;

			// ArithmeticException 발생
			String text = null;
			System.out.println(text.length());
			// 자료형중에 기본자료형, 참조 자료형이 있는데
			// String 은 참조 자료형이라서 비어있는 값이면 null 이 된다.

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 초과 오류 발생" + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("null을 계산할 경우 오류 발생" + e.getMessage());
		} catch (Exception e) {
			System.out.println("초과 오류 발생" + e.getMessage());
		} finally {
			System.out.println("finally 블록 실행");
			// 예외 발생 여부와 상관없이 항상 실행되는 코드 블록
		}

		// throw 블록
		// 예외를 직접 발생시키는데 사용한다.
		// 특정 조건에서 예외를 발생 시킬 경우 사용
		// 주로 조건문과 함께 사용
		int age = -10;
		try {
			if (age < 0) {
				// throw new 예외타입( "예외 메시지 작성" );
				// 예외 메세지는 예외 객체의 .getMessage()를 통해 출력된다.
				throw new Exception ("나이는 음수가 될 수 없습니다.");
			}
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// 나이는 음수가 될 수 없습니다.

		}
		System.out.println("반드시 실행되어야 할 코드");
		
	}
}
