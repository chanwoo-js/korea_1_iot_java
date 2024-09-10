package chapter09;

// 추상 클래스
// 모바일 애플리케이션

abstract class MobileApp {
	abstract void execute(); // 추상 메서드 (실행에 대한 동작 정의)
	
	// (일반, 구현)메서드
	void appInfo() {
		System.out.println("this is a mobile app");
	}	
}
// 게임 애플리케이션
class GameApp extends MobileApp {
	void execute () {
		System.out.println("game app executes");
	}
}

// 사회 네트워킹 애플리케이션
class SocialApp extends MobileApp {
	
	String name;
	
	// 생성자
	SocialApp (String name) {
		this.name = name;		
	}
	
	void execute() {
		System.out.println(name + " app executes");
		
	}
	@Override
	void appInfo() {
		System.out.println(name + "app is most popular social app");
	}
}

public class E_Practice {

	public static void main(String[] args) {
		MobileApp myGameApp = new GameApp();
		MobileApp mySocialApp = new SocialApp("이름 넣는곳");
		
		myGameApp.execute(); // game app executes
		myGameApp.appInfo(); // 추상 클래스가 가진 일반 메서드 출력
		// this is a mobile app
		
		mySocialApp.execute(); //social app executes
		mySocialApp.appInfo(); // 재정의 된 메서드 출력
		// this is a mobile app
	}

}
