package ch02.sec06;

public class TextBlockExample {

    public static void main(String[] args) {

        String str = "" +
                "{\n" +
                "\t\"id\":\"winter\",\n" +
                "\t\"name\":\"눈송이\"\n" +
                "}";


        // 자바 13부터 지원되는 문법
//        String str2 = """
//            {
//                "id":"winter",
//                "name":"눈송이"
//            }
//            """;

        System.out.println("str = " + str);
    }
}
