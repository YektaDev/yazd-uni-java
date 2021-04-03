/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

package dev.yekta.uni.code5;

public class MethodOverloading {
    public void foo(int a, int b, int c) {}
    public void foo(int a, int b, double c) {} // The same count of parameters is accepted
    public void foo(int a, int b) {}
    public void foo() {}
    // public int foo() {} -- Only changing the return type does NOT work
}
