/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

package dev.yekta.uni.code15;

public final class MyCalculation extends Calculation {
    private final int factor;

    public MyCalculation(int number1, int number2, int factor) {
        super(number1, number2);
        this.factor = factor;
    }

    void multiplication() {
        System.out.println("f * (n1 + n2) = " + factor * super.addition());
        System.out.println("f * (n1 - n2) = " + factor * super.subtraction());
    }
}
