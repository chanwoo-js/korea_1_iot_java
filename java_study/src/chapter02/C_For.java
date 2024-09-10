package chapter02;

public class C_For {

	public static void main(String[] args) {
		System.out.println("구구단 시작");
		for (int num1 = 1; num1 <= 9; num1++) {
		    if (num1 == 1) {  // 첫 번째 행일 때만 단을 출력
		        for (int num2 = 2; num2 < 10; num2++) {
		            System.out.print("[" + num2 + "]dan ");
		        }
		        System.out.println();
		    }

		    for (int num2 = 2; num2 <= 9; num2++) {
		        if ((num1 * num2) < 10) 
		            System.out.print(num2 + "x" + num1 + "=" + num1 * num2+ "  ");
		        else 
		            System.out.print(num2 + "x" + num1 + "=" + num1 * num2+ " ");
		    }
		    System.out.println();
		}

	}

}