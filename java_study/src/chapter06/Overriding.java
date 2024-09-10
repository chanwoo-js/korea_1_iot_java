package chapter06;

class AnimalClass {
	void sound () {
		System.out.println("동물이 소리를 냅니다.");	
	}
}
class DogClass extends AnimalClass {
	// void sound () {
    //	 System.out.println("동물이 소리를 냅니다.");	
    // }메서드가 생략 되어있다.
	
	// 어노테이션
	// 코드에 메타데이터를 제공하는 방법
	// 현재 메서드가 부모 클래스의 메서드를 오버라이딩 한다는 것을 명시하는 것이다.
	@Override 
	void sound() {
		System.out.println("개가 멍멍하고 짖습니다.");
	}
}

class CatClass extends AnimalClass {
	@Override
	void sound() {
		System.out.println("고양이가 야옹하고 웁니다.");
	}
}
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DogClass dog1 = new DogClass();
		dog1.sound();
		CatClass cat1 = new CatClass();
		cat1.sound();
		// 부모로 부터 상속받은 속성이나 메서드를 확장하는 개념이고
		// 해당 상태나 동작을 반드시 가지지만 상속받는 클래스마다 차이를 두고 싶을 때  사용한다.
		
		// 오버로딩과 오버라이딩
		// 모두 메서드의 이름을 재사용하는 방법 (다형성)
		// 오버로딩은
		// 같은 클래스 내에서 같은 이름을 가진 메서드를 여러 개 정의
		// 오버로딩은 메서드 명이 동일해야하지만 매개변수 타입과 개수 , 순서 중에 적어도 하나 이상은 달라야 한다.
		// 메서드의 동작을 다양한 상황에 맞게 조정한다
		
		
		
		// 오버라이딩은
		// 상속 관계에 있는 클래스에서 사용
		// 메서드의 시그니처(이름, 매개변수, 반환타입)가 같아야 함
		// 메서드의 동작을 변경하거나 확장하는 경우가 많다.
		// @Override 어노테이션을 사용하면 컴파일러에게 전달한다.
		
		
		
	}

}
