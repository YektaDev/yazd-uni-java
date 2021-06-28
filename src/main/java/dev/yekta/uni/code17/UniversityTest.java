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

public class UniversityTest {
    public static void main(String[] args) {
        University u;
        Map<String, List<Student>> studentsCourses = new HashMap<>();
        Student s1 = new Student("Ali", 8);
        Student s2 = new Student("Yekta", 88);
        Student s3 = new Student("Mike", 2538);
        Student s4 = new Student("Sam", 123456);

        studentsCourses.put(
                "Kotlin",
                new ArrayList<>() {{
                    add(s1);
                    add(s2);
                }}
        );
        studentsCourses.put(
                "Java",
                new ArrayList<>() {{
                    add(s1);
                    add(s3);
                }}
        );

        u = new University(studentsCourses);

        new ChainPrint()
                .title("Initial State")
                .out(u)
                .title("Remove Ali From Java")
                .out(u.removeStudentCourse("Java", s1))
                .title("Add Sam To Kotlin")
                .out(u.addStudentCourse("Kotlin", s4));
    }
}
