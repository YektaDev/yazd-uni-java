/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

package dev.yekta.uni.code13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        File file = new File("student_data.txt");
        Formatter f;
        Scanner s0, s1, s2;
        Student student;

        try {
            f = new Formatter(file.getAbsolutePath());
            s0 = new Scanner(file);
            s1 = new Scanner(file);
            s2 = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!");
            return;
        }

        student = new Student("Jade", "Thirlwall", 26199228, 19.92);

        if (student.writeStudentInFile(f) == null) {
            System.out.println("Something went wrong!");
            return;
        }
        f.close();

        System.out.println("Submitted Student: " + Student.readStudentFromFile(s0));

        printResultOf(Finder.findStudent(s2, "Nelson"));
        printResultOf(Finder.findStudent(s1, "Thirlwall"));
    }

    private static void printResultOf(Student student) {
        if (student != null) {
            System.out.println("Found: " + student);
            return;
        }

        System.out.println("No Matches Found!");
    }
}
