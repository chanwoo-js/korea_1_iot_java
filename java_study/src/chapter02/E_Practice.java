package chapter02;

import java.util.Scanner;

public class E_Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean isRun = true; // 실행여부
		
		System.out.println("프로그램 시작");
		
		while(isRun) {
			System.out.println("[메인 메뉴]");
			System.out.println("1. 회원 등록");
			System.out.println("2. 회원 조회");
			System.out.println("3. 회원 탈퇴");
			System.out.println("q. 프로그램 종료");
			
			System.out.println("메뉴 선택 : ");
			
			String selectedMenu = sc.nextLine(); // 값 배출 후 엔터까지 처리하는 역할
			switch (selectedMenu) {
			case "1":
				System.out.println("회원 등록 기능입니다");
				break;
			case "2" :
				System.out.println("회원 조회 기능입니다.");
				boolean isRunMunu2 = true;
				while(isRunMunu2) {
					System.out.println("[회원 조회]");
					System.out.println("1. 회원 번호로 조회");
					System.out.println("2. 회원 이름으로 조회");
					System.out.println("b. 뒤로가기");	
					selectedMenu = sc.nextLine();
					switch (selectedMenu) {
					case "1" :
						System.out.println("번호로 회원을 조회합니다.");
						break;
					case "2" :
						System.out.println("이름으로 회원을 조회합니다.");
						break;
					case "b" :
						System.out.println("메인 메뉴로 돌아갑니다.");
						isRunMunu2 = false;
						break;
					}
				}
				break;
			case "3" :
				System.out.println("회원 탈퇴 기능입니다.");
				break;
			case "q" :
				System.out.println("프로그램을 종료합니다.");
				isRun = false;
				isRunMunu2 = false;
				break;
			default :
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			}		
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
}
