/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

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
