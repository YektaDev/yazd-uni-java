/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

package dev.yekta.uni.code3;

public class Main {
    public static void main(String[] args) {
        System.out.println(stringFreq("Hello World!", 'l'));
    }

    public static int stringFreq(String str, char ch) {
        int freq = 0;

        if (str == null) {
            return 0;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch)
                freq++;
        }

        return freq;
    }
}
