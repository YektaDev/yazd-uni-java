/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

package dev.yekta.uni.code16;

import java.util.List;

public class University {
    private final List<Student> studentList;

    public University(List<Student> studentList) {
        this.studentList = studentList;
    }

    public University setFirst(Student student) {
        studentList.set(0, student);
        return this;
    }

    public University addFirst(Student student) {
        studentList.add(0, student);
        return this;
    }

    public University add(Student student) {
        studentList.add(student);
        return this;
    }

    public University delete(int studentId) {
        final Student[] toDelete = {null};

        studentList.forEach(student -> {
            if (student.getId() == studentId) {
                toDelete[0] = student;
            }
        });

        if (toDelete[0] != null) studentList.remove(toDelete[0]);

        return this;
    }

    public University changeName(int studentId, String newName) {
        studentList.forEach(student -> {
            if (student.getId() == studentId)
                student.setName(newName);
        });
        return this;
    }

    @Override
    public String toString() {
        return "University: " + studentList;
    }
}
