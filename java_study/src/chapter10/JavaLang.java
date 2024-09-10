package chapter10;

// java.lang
// : 자바 프로그래밍의 가장 기본적인 클래스들을 포함
// : 다른 모든 자바 애플리케이션에서 기본적으로 사용 가능
// : 별도의 import문 없이 사용 가능  

// Object 클래스
// : 자바의 모든 클래스의 최상위 클래스
// : 모든 클래스는 Object 클래스로 부터 상속 받음, 기본적으로 생략 가능

// - toSting() 메서드
// : 객체의 문자열 표현을 반환
// - equals() 메서드
// : 두 객체가 동등한지 비교

// Math 클래스
// : 수학적 연산 및 함수를 제공하는 유틸리티 클래스
// : 모든 메서드와 변수가 static >> 객체 생성 없이 사용 가능
// abs(데이터) : 절대값 반환
// max(데이터1, 데이터2), min(데이터1, 데이터2) : 최대값과 최소값을 반환
// sqrt(데이터) : 제곱근 계산
// random() : 0.0과 1.0 사이의 난수를 생성
// pow(데이터1, 데이터2) : 거듭제곱 계산

// String 클래스
// : 문자열의 내용 작성에 유용한 유틸리티를 담은 클래스
// - length() : 문자열의 길이를 반환
// - equals(데이터1, 데이터2) : 두 문자열을 비교
// - substring(int 시작인덱스, int 끝인덱스) : 부분 문자열을 반환
// - indexOf(String str) : 특정 문자열의 위치를 찾음
// - charAt(int index) : 특정 위치의 문자를 반환

class MyClass {
	// MyClass라는 사용자 정의 클래스로, id와 name이라는 두 개의 필드를 가짐
	private int id; // id 필드, 숫자를 저장
	private String name; // name 필드, 문자열을 저장

	// 생성자: 객체 생성 시 id와 name을 초기화함
	public MyClass(int id, String name) {
		this.id = id; // 전달받은 id 값을 객체의 id 필드에 저장
		this.name = name; // 전달받은 name 값을 객체의 name 필드에 저장
	}

	// toString 메서드 재정의 (Object 클래스에서 상속받음)
	// 객체의 정보를 문자열로 표현
	@Override
	public String toString() {
		// "MyClass{123이승아}"와 같은 형식으로 출력
		return "MyClass{" + id + name + "}";
	}
}

public class JavaLang {
	public static void main(String[] args) {
		// MyClass 클래스의 객체 생성
		MyClass myClass = new MyClass(123, "이승아");
		// 객체를 출력할 때 toString 메서드 호출됨
		System.out.println(myClass.toString()); // "MyClass{123이승아}" 출력

		// String 객체 생성
		String name = "이승아";
		// nickname은 name과 동일한 참조를 가짐 (같은 메모리 주소)
		String nickname = name;
		// nickname2는 동일한 문자열 값을 가지지만 다른 참조로 메모리에 저장
		String nickname2 = "이승아";

		// equals 메서드는 문자열의 내용을 비교함
		System.out.println(name.equals(nickname)); // true, 내용이 동일
		System.out.println(name.equals(nickname2)); // true, 내용이 동일

		// == 연산자는 참조값(메모리 주소)을 비교
		System.out.println(name == nickname); // true, 같은 참조(주소)임

		// Math 클래스 사용 예시
		System.out.println("Math 클래스");
		// abs는 절대값을 반환
		double result1 = Math.abs(-3.5);
		System.out.println(result1); // 출력: 3.5

		// max는 두 값 중 더 큰 값을 반환
		System.out.println(Math.max(12312453, 124857382)); // 출력: 124857382

		// random 메서드는 0.0과 1.0 사이의 난수를 반환
		System.out.println(Math.random()); // 난수 출력

		// pow 메서드는 거듭제곱 계산 (2의 4제곱)
		System.out.println(Math.pow(2, 4)); // 출력: 16.0

		// String 클래스 사용 예시
		String hello = "Hello, World!";
		// 문자열의 길이 반환 (띄어쓰기와 기호 포함)
		int length = hello.length();
		System.out.println(length); // 출력: 13

		// 문자열 비교, 대소문자도 구분하여 비교
		boolean isEqual = hello.equals("Hello, World!"); // true
		System.out.println(isEqual);

		// substring 메서드는 부분 문자열 반환
		// 시작 인덱스 7부터 (포함), 끝 인덱스 12까지 (미포함) 추출
		String sub = hello.substring(7, 12); // "World" 추출
		System.out.println(sub); // 출력: "World"

		// charAt 메서드는 해당 인덱스의 문자를 반환
		char ch = hello.charAt(1); // 'e' 반환
		System.out.println(ch); // 출력: 'e'

		// indexOf 메서드는 특정 문자열이 처음 등장하는 위치를 반환
		int index = hello.indexOf("World"); // "World"가 시작하는 인덱스인 7 반환
		System.out.println(index); // 출력: 7
	}
}
