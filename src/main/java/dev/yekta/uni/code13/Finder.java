package dev.yekta.uni.code13;

import java.util.Scanner;

@SuppressWarnings("unused")
public class Finder {
    public static Student findStudent(Scanner input, String lastname) {
        while (input.hasNext()) {
            Student s = Student.readStudentFromFile(input);
            if (s.getLastname().equalsIgnoreCase(lastname)) {
                return s;
            }
        }

        return null;
    }

    public static Student findStudent(Scanner input, int studentNumber) {
        while (input.hasNext()) {
            Student s = Student.readStudentFromFile(input);
            if (s.getStudentNumber() == studentNumber) {
                return s;
            }
        }

        return null;
    }

    public static Student findStudent(Scanner input, double grade) {
        while (input.hasNext()) {
            Student s = Student.readStudentFromFile(input);
            if (s.getGrade() == grade) {
                return s;
            }
        }

        return null;
    }
}
