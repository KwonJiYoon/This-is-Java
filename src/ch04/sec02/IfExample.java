package ch04.sec02;

public class IfExample {

    public static void main(String[] args) {

        int score = 93;

        if (score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        }

        if (score < 90)
            System.out.println("점수가 90보다 작습니다.");

        // 중괄호가 없기 때문에 if 문과는 상관없는 실행문이다.
            System.out.println("등급은 B입니다.");

    }
}
