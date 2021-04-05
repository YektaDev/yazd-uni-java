/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

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
