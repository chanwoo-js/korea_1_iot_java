package chapter05;

class BaseballPlayer {
	// 인스턴스 변수 생성하기
	// 선수 이름은 String name 이고
	// 타율은 double battingAverage 
	// 홈런수는 int homeRuns
	
	String name;
	double battingAverage;
	int homeRuns;
	
	// 정적 (클래스) 변수
	// 생성된 선수의 총 인원( playerCount int )
	// 모든 인스턴스 공유
	static int playerCount;
	
	// 생성자 
	// 인스턴스 변수 초기화& 정적 변수 후위 증가 (변수명 ++)
	// 인스턴스 메서드
	// 선수의 타율과 홈런 수를 업데이트하는 메서드
	// 매개변수로 newBattingAverage newHomeRuns 을 받아 
	// 기존의 인스턴스 변수에 재할당
	
	BaseballPlayer(String name, double battingAverage, int homeRuns) {
		this.name = name;
		this.battingAverage = battingAverage;
		this.homeRuns = homeRuns;
		playerCount++;
	}
	
	
	void updatesStatus (double newBattingAverage, int newHomeRuns) {
		// 인스턴스 변수 = 매개변수값;
		battingAverage = newBattingAverage;
		homeRuns = newHomeRuns;
	}

}
public class MethodPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 야구 선수 3명의 객체 생성하고
		
		BaseballPlayer player1 = new BaseballPlayer("홍동현", 0.325, 16);
		BaseballPlayer player2 = new BaseballPlayer("최윤성", 0.293, 7);
		BaseballPlayer player3 = new BaseballPlayer("성찬영", 0.301, 11);
		BaseballPlayer player4 = new BaseballPlayer("박영준", 0.274, 3);
		
		// 총 생성된 선수의 수를 출력해라
		// 총 생성된 선수의 수 : 3
		System.out.println( "총 생성된 선수의 수 : " + BaseballPlayer.playerCount);
	}

}
