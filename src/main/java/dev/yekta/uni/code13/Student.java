/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

package dev.yekta.uni.code13;

import java.util.Formatter;
import java.util.Scanner;

public class Student {
    private static final String SEPARATOR = "\u1111\u0000\u9999";
    private String name;
    private String lastname;
    private int studentNumber;
    private double grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public Student(String name, String lastname, int studentNumber, double grade) {
        this.name = name;
        this.lastname = lastname;
        this.studentNumber = studentNumber;
        this.grade = grade;
    }

    public Student writeStudentInFile(Formatter output) {
        if (output == null || name.concat(lastname).contains(SEPARATOR))
            return null;

        output.format(
                name + SEPARATOR +
                        lastname + SEPARATOR +
                        studentNumber + SEPARATOR +
                        grade + System.lineSeparator()
        );

        return this;
    }

    public static Student readStudentFromFile(Scanner input) {
        if (input == null)
            return null;

        String[] data = input.nextLine().split(SEPARATOR);

        try {
            return new Student(data[0], data[1], Integer.parseInt(data[2]), Double.parseDouble(data[3]));
        } catch (Exception ignored) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Student[" +
                "name: " + name +
                ", lastname: " + lastname +
                ", studentNumber: " + studentNumber +
                ", grade: " +
                grade +
                ']';
    }
}
