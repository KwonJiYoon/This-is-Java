package ch05.sec03;

public class ReferenceVariableCompareExample {
    public static void main(String[] args) {

        // 배열 변수 arr1, arr2, arr3 선언
        int[] arr1;
        int[] arr2;
        int[] arr3;

        // 배열 {1, 2, 3}을 생성하고 arr1에 대입
        arr1 = new int[] {1, 2, 3};

        // 배열 {1, 2, 3}을 생성하고 arr2에 대입
        arr2 = new int[] {1, 2, 3};

        // arr2의 값을 arr3에 대입
        arr3 = arr2;

        System.out.println(arr1 == arr2);
        System.out.println(arr2 == arr3);
    }
}
