package chapter08;


class Vehicle {
	void display () {
		System.out.println("운송수단입니다.");
	}
}

class Bus extends Vehicle {
	@Override
	void display () {
		System.out.println("버스를 타고 갑니다.");
	}
}

class Subway extends Vehicle {
	@Override
	void display () {
		System.out.println("지하철을 타고 갑니다.");
	}
}

public class B_Ploymorphism {

	public static void main(String[] args) {
		// 다형성 적용
		// 부모 클래스 타입의 참조 변수로 자식 클래스 객체를 참조
		Vehicle myVehicle = new Vehicle(); // Vehicle 객체 
		Vehicle myBus = new Bus(); // 버스객체 (자동타입변환)
		Vehicle mySubway = new Subway(); // subway 객체(자동타입변환)
		
		if (myBus instanceof Vehicle) {
			// myBus 객체가 Vehicle의 인스턴스 이거나
			// 해당 클래스를 상속받은 클래스의 인스턴스 인 경우
			myBus.display(); // 버스를 타고 갑니다.
		}
		if (myVehicle instanceof Bus) {
			System.out.println("운송수단은 버스입니다.");
			
		}else {
			System.out.println("운송수단은 버스가 아닙니다.");
		}
		
		// instanceof 연산자 계산식에서 true 의 결과값이 출력되면 해당 클래스 타입으로 형 변환이 가능하다.
		// 형 변환 이전에는 instanceof 연산자를 통해 오류 방지
		
		
	}

}
