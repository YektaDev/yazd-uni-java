/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

package dev.yekta.uni.code17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class University {
    private final Map<String, List<Student>> studentsCourses;

    public University() {
        this.studentsCourses = new HashMap<>();
    }

    public University(Map<String, List<Student>> studentsCourses) {
        this.studentsCourses = studentsCourses;
    }

    public University addStudentCourse(String courseName, Student student) {
        if (courseName == null || student == null) {
            return this;
        }

        List<Student> studentList = studentsCourses.get(courseName);

        if (studentList == null)
            studentList = new ArrayList<>();

        studentList.add(student);

        return this;
    }

    public University removeStudentCourse(String courseName, Student student) {
        if (courseName == null || student == null) {
            return this;
        }

        List<Student> studentList = studentsCourses.get(courseName);

        if (studentList == null)
            studentList = new ArrayList<>();

        studentList.remove(student);

        return this;
    }

    @Override
    public String toString() {
        return "University: " + studentsCourses.toString();
    }
}
