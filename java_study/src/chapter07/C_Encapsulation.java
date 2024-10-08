package chapter07;

// 캡슐화
// : 객체 지향 프로그래밍에서 데이터와 해당 데이터를 처리하는 함수를 하나로 묶는 것
// - 객체 내부의 구현을 숨기고 외부에서는 제공된 메서드를 통해서만 접근할 수 있도록 함
// - 데이터 보호, 유지보수성 향상, 사용의 편의성 증대

// getter & setter 메서드
// - 캡슐화된 데이터에 안전하게 접근하고 수정할 수 있도록 하는 기능

// getter
// : 객체의 특정 필드 값을 읽을 수 있게 해주는 메서드
// setter
// : 객체의 특정 필드 값을 설정 할 수 있게 해주는 메서드

// 학생 정보를 관리하는 클래스
class Student{
	// private 접근이 제어
	private String name;
	private int age;
	private int score;
	// score(점수) 필드를 선언 - private
	// : 해당 필드에 대한 getter setter 구현
	// : 점수 값을 설정할 때는 0 보다 크고 100 보다 작은지 확인하는 검사 코드도 추가
	// : 유효하지 않은 점수일 경우 '유효하지 않습니다.' 출력 
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		if(score > 0 && score < 100) {
			this.score = score;
		} else {
		System.out.println("유효하지 않습니다.");
		}
	}
	
	// getter & setter - 캡슐화 되어있는 데이터에 접근
	// 메서드 형식을 get변수, set변수로 지정하는 것을 ㄱ권장
	// :  해당 메서드의 구현목족에 대한 설명
	public String getName() {
		// private 선언이 되어있는 name 변수는 반드시 getName 메서드를 통해서만 
		// , 외부 클래스 또는 외부 패키지에서 접근이 가능
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age < 0) {
			System.out.println("유효하지 않은 나이입니다.");
		}else {
			this.age = age;			
		}
	}
}

public class C_Encapsulation {
	public static void main(String[] args) {
		Student student1 = new Student();
//		student1.name = "이승아"; -Eror
		
		// setter를 통한 데이터 수정
		student1.setName("이승아");
		student1.setAge(28);
		student1.setAge(-19); //유효하지 않은 나이입니다.
		
		// getter를 통한 데이터 접근
		System.out.println(student1.getName()); // 이승아
		System.out.println(student1.getAge()); // 90
		
		// 점수 필드를 설정하고 접근하는 예시
		student1.setScore(85);
		System.out.println(student1.getScore());
		
		student1.setScore(-10);
		student1.getScore();
		
	}
}