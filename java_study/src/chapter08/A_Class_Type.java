package chapter08;

class Parent {
	void displayInfo () {
		System.out.println("부모 클래스입니다.");
	}
} 

class Child extends Parent {
	// 메서드 재정의 : 오버라이드 (상속 관계에서만 가능하다)
	@Override
	void displayInfo() {
		System.out.println("자식 클래스입니다.");
	}
	void ownMethod () {
		System.out.println("자식만의 메서드입니다.");
	}
}

//class Animal {
//	void display () {
//		System.out.println("동물입니다.");
//	}
//}
//
//class Dog extends Animal {
//	void display () {
//		System.out.println("강아지입니다.");
//	}
//	void bark () {
//		System.out.println("멍멍 짖습니다.");
//	}
//}

public class A_Class_Type {

	public static void main(String[] args) {
		// 클래스의 자동 타입 변환 (업캐스팅)
		// 자식 클래스의 객체를 부모 클래스 타입으로 변환하는 것을 의미한다
		// 직접 명시하지 않고, 자동으로 타입 변환이 일어남
		
		// 1. 자식 객체를 생성하면서 바로 부모타입으로 변환하는 방법이 있다.
		// 부모클래스 객체변수 = new 자식클래스();
		Parent childObject = new Child();
		
		childObject.displayInfo(); // 자식 클래스입니다라는 재정의된 값이 나온다.
//		childObject.ownMethod(); // 해당 메서드는 정의되어있지않다. 부모타입에 error
		// 자동 형 변환의 경우, 해당 객체는 보존되면서 사용은 부모 객체처럼 사용
		// 두클래스 간에 공통된 특성이 아닌 경우 자식만의 기능은 사용 x
		
		// 이미 만들어진 자식 객체를 부모 타입으로 변환
		Child child1 = new Child();
		Parent prent1 = child1;
		// 부모클래스 객체변수 = 자식객체변수;
		
		// 클래스의 강제 타입 변환 (다운캐스팅)
		// 부모 클래스 타입으로 변환된 객체를
		// 다시 자식 클래스 타입으로 변환하는것을 의미한다.
		
		// 자식클래스에 정의된 멈버에 접근 가능하다
		Parent p2 = new Child(); // 자동 형 변환 (묵시적)
		// p2.ownMethod(); - error
		
		// 자식타입 변수 = (자식타입) 부모객체;
		Child c2 = (Child)p2;
		c2.ownMethod();
		// 자기 자신만 가지고 있었던 메소드 호출이 가능해진다.
	}

}
