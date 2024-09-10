package chapter13;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Example {
    
    // 클래스 필드 선언
    private String name;
    private int age;

    public static void main(String[] args) {
        // 객체 생성 및 초기화
        Example exam1 = new Example(); // NoArgsConstructor를 이용한 기본 생성자
        Example exam2 = new Example("이승아", 50); // AllArgsConstructor를 이용한 매개변수 생성자

        // 객체 정보 출력
        System.out.println(exam1); // toString() 메서드가 자동 생성됨
        exam2.setAge(20);
        System.out.println(exam2);
    }
}
