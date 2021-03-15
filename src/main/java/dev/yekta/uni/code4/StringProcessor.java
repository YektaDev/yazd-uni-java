/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

package dev.yekta.uni.code4;

public class StringProcessor {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public StringProcessor(String text) {
        this.text = text;
    }

    public StringProcessor reverse() {
        if (text == null || text.length() < 2)
            return this;

        char[] textChars = text.toCharArray();
        int textLength = textChars.length;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < textLength; i++) {
            result.append(textChars[textLength - i - 1]);
        }

        text = result.toString();

        return this;
    }

    public StringProcessor upperLowerCase() {
        if (text == null)
            return this;

        char[] textChars = text.toCharArray();
        StringBuilder result = new StringBuilder();

        for (char ch : textChars) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else {
                result.append(Character.toUpperCase(ch));
            }
        }

        text = result.toString();

        return this;
    }

    public int freq(String str, boolean overlapping) {
        if (text == null)
            return 0;

        int textLength = text.length();
        int strLength = str.length();

        int freq = 0;

        for (int i = 0; i < textLength; i++) {
            if (textLength < i + strLength)
                break;

            if (text.substring(i, i + strLength).equals(str)) {
                freq++;

                if (!overlapping)
                    i += strLength - 1; // DOES NOT ALLOW OVERLAPPING
            }
        }

        return freq;
    }
}
