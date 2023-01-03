package ch02.sec03;

public class CharExample {
    public static void main(String[] args) {
        // 문자 저장
        char c1 = 'A';

        // 유니코드 직접 저장
        char c2 = 65;

        // 문자 저장
        char c3 = '가';

        // 유니코드 직접 저장
        char c4 = 44032;

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);

//      char c = ''; ---> 컴파일 에러!
        char c = ' ';  // 공백 하나를 포함하여 초기화
    }
}
