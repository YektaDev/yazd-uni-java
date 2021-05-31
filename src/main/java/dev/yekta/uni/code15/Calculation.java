/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

package dev.yekta.uni.code15;

public class Calculation {
    protected int number1;
    protected int number2;

    public Calculation(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    final int addition() {
        return number1 + number2;
    }

    final int subtraction() {
        return number1 - number2;
    }
}
