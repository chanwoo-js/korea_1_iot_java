package chapter09;

interface Fruit {
	String color(); // 추상 메서드 - public abstract 생략 가능
	
	// 디폴트 메서드
	default void describe() {
		System.out.println("과일의 색상은 " + color() + "입니다.");
	}

	// 정적 메서드
	static void printType () {
		System.out.println("과일의 타입입니다.");
	}
}

class Apple implements Fruit{

	@Override
	public String color() {
		return "red";
	}
	// 디폴트 메서드를 재정의 x
	// fruit 에 있는 디폴트 메서드가 생략된 형태
	
	// 디폴트 메서드
	//	default void describe() {
	//		System.out.println("과일의 색상은 " + color() + "입니다.");
	//	}
	
	 
}

class Orange implements Fruit {

	@Override
	public String color() {
		return "orange";
	}
	
}
public class F_Practice {

	public static void main(String[] args) {
		Fruit apple = new Apple();
		Fruit orange = new Orange();
		
		apple.describe(); // 과일의 색상은 red 입니다.
		orange.describe(); // 과일의 색상은 orange 입니다.
		
		// 정적 메서드 활용
		// 인터페이스 자체로 호출
		Fruit.printType(); // 과일의 타입입니다.
	}

}
