package ch07.sec03.exam01;

public class SmartPhone extends Phone {

    // 자식 생성자 선언
    public SmartPhone(String model, String color) {
        // 부모의 기본 생성자 호출
        // 컴파일 시 자동 추가되어 생략 가능
        super();
        this.model = model;
        this.color = color;
        System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
    }
}
