package dev.yekta.uni.code6;

public class Message {
    public void printMessageCode(int code) {
        printMessageCode(String.valueOf(code));
    }

    public void printMessageCode(float code) {
        printMessageCode(String.valueOf(code));
    }

    public void printMessageCode(double code) {
        printMessageCode(String.valueOf(code));
    }

    public void printMessageCode(String code) {
        System.out.printf("The message code is %s!%n", code);
    }
}
