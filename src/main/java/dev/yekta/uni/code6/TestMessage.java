package dev.yekta.uni.code6;

public class TestMessage {
    public static void main(String[] args) {
        Message msg = new Message();

        msg.printMessageCode(8);
        msg.printMessageCode(8.8f);
        msg.printMessageCode(8.080808d);
        msg.printMessageCode("Eight");
    }
}
