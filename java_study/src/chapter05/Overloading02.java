package chapter05;

// 음식점 클래스
// : 다양한 방법으로 주문을 받는 메서드 정의
class Restaurant {
	// 메서드 정의
	// : placeOrder 주문 메서드
	// >> 메뉴 이름(String dish)
	void placeOrder (String dish) {
		System.out.println(dish);
	}
	// >> 메뉴 이름, 수량 제공(int quantity)
	void placeOrder (String dish, int quantity) {
		System.out.println("메뉴 이름 : " + dish + " 수량 제공 : " + quantity);
	}
	// >> 메뉴 이름, 특별 요청 사항 제공(String specialRequests)
	void placeOrder (String dish, String specialRequests) {
		System.out.println("메뉴 이름 : " + dish + " 특별 요청 사항 제공 : " + specialRequests);
	}
	// >> 메뉴 이름, 수량 제공, 특별 요청 사항 제공
	void placeOrder (String dish, int quantity, String specialRequests) {
		System.out.println("메뉴 이름 : " + dish + " 수량 제공 : " + quantity + " 특별 요청 사항 제공 : " + specialRequests);
	}
}

public class Overloading02 {
	
	public static void main(String[] args) {
		// 인스턴스 생성
		Restaurant a = new Restaurant();
		a.placeOrder(null);
		a.placeOrder(null, 0);
		a.placeOrder(null, null);
		a.placeOrder(null, 0, null);
	}
}