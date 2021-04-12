/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

package dev.yekta.uni.code7;

public class Student implements Printable {
    private String name;
    private int studentNumber;
    private double[] grades;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }
    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }
    public double[] getGrades() {
        return grades;
    }

    public Student(String name, int studentNumber, double[] grades) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.grades = grades;
    }

    public Student() {
        this(null, -1, null);
    }

    public double[] getMinMaxAvg() {
        if (grades == null)
            return null;
        if (grades.length == 0)
            return null;

        double min = -1d;
        double max = -1d;
        double sum = 0d;

        for (double grade : grades) {
            if (min == -1d) {
                min = grade;
                max = grade;
            }

            if (grade > max)
                max = grade;
            if (grade < min)
                min = grade;

            sum += grade;
        }

        return new double[]{
                min,
                max,
                sum / grades.length
        };
    }

    @Override
    public String toString() {
        double[] minMaxAvg = getMinMaxAvg();
        String baseString = String.format(
                "Student:\n\tName: %s\n\tStudent Number: %d\n\t", name, studentNumber
        );

        return (minMaxAvg == null) ? baseString + "No grades are assigned yet." : String.format(
                baseString + "Minimum Grade: %.2f\n\tMaximum Grade: %.2f\n\tAverage Grade: %.2f",
                minMaxAvg[0],
                minMaxAvg[1],
                minMaxAvg[2]
        );
    }
}
