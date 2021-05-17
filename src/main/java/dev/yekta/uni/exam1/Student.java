/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

package dev.yekta.uni.exam1;

import java.util.Arrays;

public class Student {
    private String name;
    private String lastname;
    private int studentNumber;
    private double[] grades;

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

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public Student(int studentNumber, String name, String lastname, double[] grades) {
        this.name = name;
        this.lastname = lastname;
        this.studentNumber = studentNumber;
        this.grades = grades;
    }

    public double getAverage() {
        if (grades == null || grades.length == 0) {
            return 0;
        }

        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", studentNumber=" + studentNumber +
                ", grades=" + Arrays.toString(grades) +
                "', avg='" + getAverage() + "'}";
    }
}
