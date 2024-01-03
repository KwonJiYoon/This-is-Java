package ch05.check;

public class test08 {
    public static void main(String[] args) {

        // 배열의 전체 합과 평균 구하기
        int[][] array = {
                { 95, 86 },
                { 83, 92, 96 },
                { 78, 83, 93, 87, 88 }
        };

        int length = 0;
        int totalSum = 0;
        double totalAvg = 0;

        // 총 합
        for (int[] arr : array) {
            length = arr.length;
            for (int a : arr) {
                totalSum += a;
            }
        }
        System.out.println("총 합 : " + totalSum);

        // 평균
        totalAvg = (double) totalSum / length;
        System.out.println("평균 : " + totalAvg);
    }
}
