package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        // Queue 컬렉션 생성
        Queue<Message> messageQueue = new LinkedList<>();

        // 메시지 넣기
        messageQueue.offer(new Message("send Email", "홍길동"));
        messageQueue.offer(new Message("send SNS", "신용권"));
        messageQueue.offer(new Message("send KakaoTalk", "김자바"));

        // 메세지를 하나씩 꺼내어 처리
        while (!messageQueue.isEmpty()) {
            Message message = messageQueue.poll();

            switch (message.command) {
                case "send Email":
                    System.out.println(message.to + "님에게 메일을 보냅니다.");
                    break;
                case "send SNS":
                    System.out.println(message.to + "님에게 SNS를 보냅니다.");
                    break;
                case "send KakaoTalk":
                    System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
                    break;
            }
        }
    }
}
