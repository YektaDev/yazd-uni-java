/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

package dev.yekta.uni.code16;

import java.util.ArrayList;

public class UniversityTest {
    public static void main(String[] args) {
        University u = new University(new ArrayList<>());

        new ChainPrint()
                .out("**[ Add ]**")
                .out(u
                        .add(new Student("Ali Khaleqi", 8))
                        .add(new Student("Khaleq Yekta", 7))
                        .add(new Student("Yekta", 6)))
                .out("**[ Delete ]**")
                .out(u.delete(7))
                .out("**[ Change Name ]**")
                .out(u.changeName(6, "Yekta Alizadeh"))
                .out("**[ Add First ]**")
                .out(u.addFirst(new Student("Bill Gates", 888)))
                .out("**[ Set First ]**")
                .out(u.setFirst(new Student("Linus Torvalds", 888888888)));
    }
}
