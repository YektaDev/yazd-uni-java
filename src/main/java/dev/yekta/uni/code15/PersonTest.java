/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

package dev.yekta.uni.code15;

public class PersonTest {
    public static void main(String[] args) {
        Student s = new Student("Ali", "You@Yekta.Dev", 8888, new float[]{20.0f, 20f, 20f});

        System.out.println("Previous Email: " + s.getEmail());
        s.setEmail("Me@Yekta.Dev");
        System.out.println("New Email: " + s.getEmail());
    }
}
