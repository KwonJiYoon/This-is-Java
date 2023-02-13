package ch03.sec03;

public class OverflowUnderflowExample {
    public static void main(String[] args) {

        byte var1 = 125;

        // 5번 반복 실행
        for (int i = 0; i < 5; i++) {
            // var1의 값을 1 증가
            var1 ++;
            System.out.println("var1 = " + var1);
        }

        System.out.println("---------------------------");

        byte var2 = -125;

        // 5번 반복 실행
        for (int i = 0; i < 5; i++) {
            // var2의 값을 1 감소
            var2 --;
            System.out.println("var2 = " + var2);
        }
    }
}
