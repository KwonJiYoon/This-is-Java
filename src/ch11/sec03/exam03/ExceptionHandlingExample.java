package ch11.sec03.exam03;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "] : " + value);
            } catch (NumberFormatException e) {
                System.out.println("배열 인덱스가 초과됨 :" + e.getMessage());
            } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
                // 2가지 예외를 동일하게 처리
                System.out.println("문자열이 없거나 항목 수가 부족합니다.");
            }
        }
    }
}
