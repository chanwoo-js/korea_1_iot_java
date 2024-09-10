package chapter05;

class Calc {
	int a, b;
	int c, d;
	double x, y;
	// 두 정수를 더하는 메서드를 만들어 보기
	
	int add (int a, int b) {
		return a + b;
	}
	// 실제 값 차이 여부와 반환타입의 차이 여부는 오버로딩과 관련이 없다.
	// 반드시!! 매개변수의 개수 또는 타입이 달라야 한다.
    // long add (int c, int d) {
    //	 return c + d;
    // }
	// 에러~
	// 사용하려면 아래처럼 해야된다.
	// 두 정수를 더하는 메서드 (long 타입, 오버로딩)
    long add(long c, long d) {
        return c + d;
    }
    
    double add (double x, double y) {return x + y;};
    double add (int x, double y) {return x + y;};
    double add (double x, int y) {return x + y;};
    double add (double x, int y, int c) {return x + y + c ;};
    // 어차피 더하기 계산을 하는 인스턴스 메서드라면
    // 굳이 실수, 정수를 나누지않아도 계산만 되면 상관 없다면
    // 이런식으로 타입을 다 지정하여 타입을 굳이 신경쓰지않아도
    // 편하게 사용할 수 있도록 만들 수 있다.
    
    // 1. 같은 이름 사용 가능
    // 2. 코드의 재사용성이 높아짐
    // 3. 컴파일 시 타입 체크를 강화 - 올바른 매개변수 타입을 가진 메서드를 선택
    
    
}
public class Overloading01 {

	public static void main(String[] args) {
		Calc calculator = new Calc();
		System.out.println(calculator.add(10,20));
		System.out.println(calculator.add(10.5,20));
		System.out.println(calculator.add(10,20.3));
		System.out.println(calculator.add(10.321,20.32));
		System.out.println(calculator.add(10,20,30));
	}

}
