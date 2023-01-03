package ch02.sec01;

public class VariableInitiallizationExample {

    public static void main(String[] args) {

        // 변수 value 선언
//        int value;
        int value = 10;
        // 연산 결과를 변수 result의 초기값으로 대입
        int result = value + 10;
        // value가 초기화 되지 않았기 때문에 값을 읽어올 수 없다. (컴파일 에러 발생)

        // 변수 result 값을 읽고 콘솔에 출력
        System.out.println(result);
    }
}
