package chapter06;

class Mammel {
	String name = "Parent";

	Mammel() {
		System.out.println("d");
	}
	Mammel(String name) {
		this.name = name;
	}
}

class Cat extends Mammel {
	String name = "Child";
	
	// super () ;
	// 자식 클래스의 기본 생성자는 사용자 정의 생성자가 없더라도
	// super () 부모 클래스 생성자 호출 키워드가 정의되어 있음( 생략 )
	
	Cat () {
		// super();
		System.out.println("빈 자식 생성자");
	}
	
	Cat (String name) {
		// super() 는 부모 클래스의 생성자를 가지고 오기 때문에
		// 기본 생성자 또는 사용자 정의 생성자의 형태를 그대로 사용
		super (name); // 얘는 부모 클래스를 가르키고 이름 가졌던 애를 호출하게 됨
		this.name = name;
		System.out.println("자식 클래스를 생성하였습니다.");
		
	}
	// 인스턴스 메서드
	
	void greet () {
		// 해당 클래스가 가진 인스턴스 변수에 접근 this (생략 o)
		System.out.println("자식 : " + this.name);
		
		// 부모 클래스가 가진 인스턴스 변수에 접근 super (생략 x)
		System.out.println("부모 : " + super.name);
	}
}

public class Inheritance02 {

	public static void main(String[] args) {
		Cat voidCat = new Cat();
		Cat myCat = new Cat("choco");
		
		// 
		voidCat.greet();
		// 자식 : Child
		// 부모 : Parent
		myCat.greet();
		// 자식 : Child
		// 부모 : choco => this.name = name; 을 사용하지 않았기 때문  => 사용하면 자식도 choco로 바뀐다
		

	}

}
