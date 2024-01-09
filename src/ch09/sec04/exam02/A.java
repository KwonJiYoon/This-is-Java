package ch09.sec04.exam02;

public class A {

    // 메소드
    void useB() {

        // 로컬 글래스
        class B {
            // 인스턴스 필드
            int field = 1;

            // 생성자
            B() {
                System.out.println("B-생성자 실행");
            }

            // 인스턴스 메소드
            void method() {
                System.out.println("B-method 실행");
            }
        }

        // 로컬 객체 생성
        B b = new B();

        // 로컬 객체의 인스턴스 필드와 메소드 사용
        System.out.println(b.field);
        b.method();
    }
}
