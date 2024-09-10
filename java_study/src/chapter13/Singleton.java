package chapter13;

public class Singleton {

    // static 필드로 Singleton 인스턴스를 선언
    private static Singleton instance;

    // private 생성자: 외부에서 직접 인스턴스 생성 불가
    private Singleton() {
    }

    // 전역 접근을 제공하는 static 메서드
    public static Singleton getInstance() {
        if (instance == null) { // 인스턴스가 없을 때만 생성
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        // Singleton 패턴으로 객체 생성
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // 두 인스턴스가 동일한지 확인
        System.out.println(singleton1 == singleton2);  // true 출력 (같은 인스턴스)
    }
}
