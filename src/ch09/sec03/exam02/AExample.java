package ch09.sec03.exam02;

public class AExample {
    public static void main(String[] args) {

        // B 객체 생숭 및 인스턴스 필드 및 메소드 사용
        A.B b = new A.B();
        System.out.println(b.field1);

        b.method1();
    }
}
