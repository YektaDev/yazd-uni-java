/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

package dev.yekta.uni.code10;

public class Processor {
    private final String value;
    private int num;

    public Processor(String value) {
        this.value = value;
    }

    public Processor(int num) {
        this.num = num;
        this.value = null;
    }

    public String[] process() {
        if (value == null) return null;
        return value.trim().replaceAll(" +", " ").split(" ");
    }

    public boolean has(String subStr) {
        if (value == null) return false;
        return value.contains(subStr);
    }

    public String reverseWordsOrder() {
        if (value == null) return null;
        String[] arr = process();
        StringBuilder reversed = new StringBuilder();

        for (int i = arr.length - 1; i > 0; i--)
            reversed.append(arr[i]).append(i > 1 ? " " : "");

        return reversed.toString();
    }

    public String reverseWhole() {
        if (value == null) return null;
        return new StringBuilder(value).reverse().toString();
    }

    public int sumDigits() {
        return String.valueOf(num).chars().map(Character::getNumericValue).sum();
    }

    @Override
    public String toString() {
        if (value == null)
            return String.valueOf(num);

        StringBuilder sb = new StringBuilder();
        String[] val = process();

        for (int i = 0; i < val.length; i++)
            sb.append(i).append(" > ").append(val[i]).append('\n');

        return sb.toString();
    }
}
