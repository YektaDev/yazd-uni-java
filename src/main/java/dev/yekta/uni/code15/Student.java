/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

package dev.yekta.uni.code15;

public class Student extends Person {
    private int number;
    private float[] grades;

    public Student(String name, String email, int number, float[] grades) {
        super(name, email);
        this.number = number;
        this.grades = grades;
    }

    public final int getNumber() {
        return number;
    }

    public final void setNumber(int number) {
        this.number = number;
    }

    public final float[] getGrades() {
        return grades;
    }

    public final void setGrades(float[] grades) {
        this.grades = grades;
    }
}
