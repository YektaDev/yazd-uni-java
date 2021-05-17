/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

package dev.yekta.uni.exam1;

public class UniversityTest {
    public static void main(String[] args) {
        System.out.println("=========================> Init University:");
        University u1 = new University(3);
        System.out.println(u1);

        System.out.println("=========================> Add Student:");
        u1.addStudent(100, "Ali", "Khaleqi", new double[]{18, 19, 20});

        System.out.println("=========================> Add Student:");
        u1.addStudent(80, "Yekta", "Alizadeh", new double[]{10, 11, 12});

        System.out.println("=========================> Add Student:");
        u1.addStudent(90, "Khaleq", "Khaleqi Yekta", new double[]{15, 17, 17.5});

        System.out.println("=========================> Swap Student:");
        Student s1 = new Student(90, "Khaleq", "Khaleqi Yekta", new double[]{15, 17, 17.5});
        Student s2 = new Student(80, "Yekta", "Alizadeh", new double[]{10, 11, 12});
        u1.swapStudent(s1, s2);

        System.out.println("=========================> Set Grades:");
        u1.setGrades(s1.getStudentNumber(), new double[]{12.75, 13.5, 18.75, 20, 19.5, 8.75});

        System.out.println("=========================> Sort By Average:");
        u1.sortStdAve();
    }
}
