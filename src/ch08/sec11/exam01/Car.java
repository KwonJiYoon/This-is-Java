package ch08.sec11.exam01;

public class Car {

    // 필드
    Tire tire1 = new HankookTire();
    Tire tire2 = new KumhoTire();

    // 메소드
    void run(){
        // 인터페이스에 선언된 추상 메소드 호출
        tire1.roll();
        tire2.roll();
    }
}
