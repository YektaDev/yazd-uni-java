/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

package dev.yekta.uni.code7;

public class University implements Printable {
    private int universityID;
    private Student[] students;

    public int getUniversityID() {
        return universityID;
    }
    public void setUniversityID(int universityID) {
        this.universityID = universityID;
    }

    public Student[] getStudents() {
        return students;
    }
    public void setStudents(Student[] students) {
        this.students = students;
    }
    public void setStudent(int index, Student student) {
        students[index] = student;
    }

    public University(int universityID, int studentNumbers) {
        this.universityID = universityID;
        this.students = new Student[studentNumbers];
    }

    @Override
    public String toString() {
        StringBuilder studentsStr = new StringBuilder();

        for (Student student : students) {
            String studentStr = student.toString();

            for (String s : studentStr.split("\n"))
                studentsStr.append("\t\t").append(s).append('\n');
        }

        return String.format("University:\n\tUniversityId: %d\n\tStudents:\n%s",
                universityID,
                studentsStr
        );
    }
}
