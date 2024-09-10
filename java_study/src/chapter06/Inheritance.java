package chapter06;

class Parent {
} // 기존 클래스 ( 부모 클래스 )

class Child extends Parent {
}; // 새로운 클래스 ( 자식 클래스 )
// 동물 클래스를 만들어보자

class Animal {
	String name;
}

// Dog 자식 클래스는 Animal 부모 클래스의 상속을 받음
class Dog extends Animal {
	// 부모 클래스의 속성과 메서드를 모두 상속받음
	// String name; 생략되어있다고 보면 된다.

	void bark() {
		System.out.println("강아지가 짖습니다.");
		
	}
}

class Tv {
	boolean power; // 전원 상태를 on/off
	int channel; // 채널

	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}
}

class SmartTv extends Tv {
	boolean ott; // ott 플랫폼 전원 상태 on/off

	void displayOtt(String platform) {
		if (ott) {
			System.out.println(platform);
		} else {
		}
		System.out.println("ott 연결이 되지 않았습니다.");
	}

}

public class Inheritance {

	public static void main(String[] args) {

		Dog choco = new Dog();
		choco.name = "초코";
		System.out.println(choco.name);

		SmartTv stv = new SmartTv();
		stv.channel = 10;
		stv.channelUp();
		stv.channelUp();
		stv.channelUp();
		stv.channelUp();
		System.out.println(stv.channel); // 14

		stv.displayOtt("netflix");
		stv.ott = true;
		stv.displayOtt("netflix");
		
	}

}
