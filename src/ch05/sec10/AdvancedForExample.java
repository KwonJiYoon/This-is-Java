package ch05.sec10;

public class AdvancedForExample {
    public static void main(String[] args) {

        // 배열 변수 선언과 배열 생성
        int[] scores = { 95, 71, 84, 93, 87 };

        // 배열 전체 항목 합 구하기
        int sum = 0;
        for (int s : scores) {
            sum += s;
        }
        System.out.println("총 합 : " + sum);

        // 평균
        double avg = (double) sum / scores.length;
        System.out.println("평균 : " + avg);
    }
}
