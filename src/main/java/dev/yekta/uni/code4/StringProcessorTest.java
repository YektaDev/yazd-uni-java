/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

package dev.yekta.uni.code4;

public class StringProcessorTest {

    public static void main(String[] args) {
        printTestResultOf("Ali Yekta Ali", "Ali");
        printTestResultOf("Hello World!", "ll");
        printTestResultOf("aaaaaaaaa", "aa");
    }

    public static void printTestResultOf(String str, String subStr) {
        String reverse = new StringProcessor(str).reverse().getText();
        String upperLowerCase = new StringProcessor(str).upperLowerCase().getText();
        int freq = new StringProcessor(str).freq(subStr, false);
        int freqOverlap = new StringProcessor(str).freq(subStr, true);

        System.out.println("============ Test Results ============");
        System.out.println("Input: " + str);
        System.out.println("\tReverse: " + reverse);
        System.out.println("\tUpperLowerCase: " + upperLowerCase);
        System.out.printf("\tFrequency of '%s': %d\n", subStr, freq);
        System.out.printf("\tFrequency of '%s' (overlap): %d\n\n", subStr, freqOverlap);
    }
}
