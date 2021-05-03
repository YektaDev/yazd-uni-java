/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

package dev.yekta.uni.code10;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class ProcessorTest {
    public static void main(String[] args) {
        Processor strInput = new Processor(new Scanner(in).nextLine());
        Processor intInput = new Processor(Integer.parseInt(new Scanner(in).nextLine()));

        /* Print indexed */
        out.println(strInput);

        /* Find */
        out.println(">> Enter a word: " + (strInput.has(new Scanner(in).nextLine()) ? "FOUND!" : "NOT FOUND!"));

        /* Reverse Words */
        out.println(strInput.reverseWordsOrder());

        /* Reverse the Text */
        out.println(strInput.reverseWhole());

        /* Sum Digits of an Integer */
        out.println(intInput.sumDigits());
    }
}
