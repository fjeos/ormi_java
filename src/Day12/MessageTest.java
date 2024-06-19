package Day12;

import java.util.LinkedList;
import java.util.Queue;

public class MessageTest {
    public static void main(String[] args) {
        Queue<Message> messages = new LinkedList<>();

        messages.offer(new Message("sendMail", "홍길동"));
        messages.offer(new Message("sendSms", "유진"));
        messages.offer(new Message("sendKaKaoTalk", "원영"));
        messages.offer(new Message("send", "레이"));

        while (!messages.isEmpty()) {
            Message message = messages.poll();
            switch (message.getCommand()) {
                case "sendMail":
                    System.out.println(message.getTo() + "에게 메일을 보냅니다.");
                    break;
                case "sendSms":
                    System.out.println(message.getTo() + "에게 문자를 보냅니다.");
                    break;
                case "sendKaKaoTalk":
                    System.out.println(message.getTo() + "에게 카톡을 보냅니다.");
                    break;
                default:
                    System.out.println(message.getTo() + "에게 연락을 취할 수 없습니다.");
            }
        }

    }
}
