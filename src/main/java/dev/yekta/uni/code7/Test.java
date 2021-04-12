/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

package dev.yekta.uni.code7;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student(
                "Ali",
                888888,
                new double[]{
                        16.00d,
                        17.50d,
                        18.25d,
                        19.75d,
                        19.99d
                }
        );

        Student s2 = new Student(
                "Yekta",
                800800,
                new double[]{
                        12.25d,
                        13.75d,
                        15.50d,
                        16.00d,
                        19.00d
                }
        );

        University u = new University(123456, 2);
        u.setStudents(new Student[]{s1, s2});
        u.print();
    }
}
