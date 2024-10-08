package chapter14.model;

import java.util.HashMap;
import java.util.Map;

// 음식점 메뉴 주문 시스템
// 사용자가 메뉴를 선택, 수량을 입력하면 총 가격을 계산해줌
// 종류 옵션을 선택할 때까지 반복하여 메뉴 선택을 받음
public class OrderModel {
	// 메뉴 이름(키), 가격(값) 으로 하는 HashMap을 사용
	private Map<String, Integer> menuPrices;

	// 주문된 메뉴의 이름과 키를 가지는 HashMap
	private Map<String, Integer> order;

	// 주문이 완료되었는지 여부 - boolean
	private boolean isCompleted;

	public OrderModel() {
		menuPrices = new HashMap<String, Integer>();
		order = new HashMap<String, Integer>();
		isCompleted = false;

		// 메뉴와 가격을 초기화
		menuPrices.put("Pizza", 22000);
		menuPrices.put("Pasta", 18000);
		menuPrices.put("Coke", 2000);
		menuPrices.put("Ade", 5000);
	}

	// 기능 정의
	// 1. 주문을 추가하는 메서드
	public void addOrder(String dish, int quantity) {
		if (menuPrices.containsKey(dish)) {
			// 주문 목록에 메뉴 추가 또는 이미 존재할 경우 수량을 업데이트
			// getOrDefault(Key, defaultValue)
			// : 찾는 key 가 존재한다면 key 의 value 를 반환
			// : null 이면 default 값을 반환
			order.put(dish, order.getOrDefault(dish, 0) + quantity);
		}
	}

	public int calculateTotal() {
		int total = 0; // 총 가격 저장 변수

		// 주문된 모든 메뉴에 대해 반복
		for (String dish : order.keySet()) {
			total += order.get(dish) * menuPrices.get(dish);
		}
		return total; // 계산된 총 가격을 반환

	}

	// 주문 완료 상태를 설정하는 메서드
	public void setComlete(boolean isComplete) {
		this.isCompleted = isComplete;
	}

	// 주문 완료 여부를 반환하는 메서드
	public boolean isComplete() {
		return isCompleted;
	}
}
