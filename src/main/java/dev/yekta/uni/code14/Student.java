/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

package dev.yekta.uni.code14;

import java.io.IOException;
import java.io.RandomAccessFile;

@SuppressWarnings({"unused", "UnusedReturnValue"})
public class Student {
    public static final int STRING_LENGTH = 20;

    private final int studentNumber;
    private String name;
    private String lastname;
    private double grade;

    public Student(int studentNumber, String name, String lastname, double grade) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.lastname = lastname;
        this.grade = grade;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

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

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    private String fixString(String str) {
        StringBuilder stringBuilder = new StringBuilder(STRING_LENGTH);
        for (int i = 0; i < STRING_LENGTH; i++){
            if (i < str.length())
                stringBuilder.append(str.charAt(i));
            else
                stringBuilder.append(' ');
        }

        return stringBuilder.toString();
    }

    private static String nextString(RandomAccessFile file) {
        StringBuilder str = new StringBuilder();
        try {
            for (int i = 0; i < STRING_LENGTH; i++) {
                str.append(file.readChar());
            }
        } catch (IOException e) {
            return null;
        }
        return str.toString().trim();
    }

    boolean writeStudentInFile(RandomAccessFile file) {
        try {
            file.writeInt(studentNumber);
            file.writeChars(fixString(name));
            file.writeChars(fixString(lastname));
            file.writeDouble(grade);
        } catch (IOException e) {
            return false;
        }
        return true;
    }

    static Student nextStudent(RandomAccessFile file) {
        int studentNumber;
        String name;
        String lastname;
        double grade;

        try {
            studentNumber = file.readInt();
            name = nextString(file);
            lastname = nextString(file);
            grade = file.readDouble();
        } catch (IOException e) {
            return null;
        }
        return new Student(studentNumber, name, lastname, grade);
    }

    @Override
    public String toString() {
        return "Student{ studentNumber=" + studentNumber +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", grade=" + grade +
                '}';
    }
}
