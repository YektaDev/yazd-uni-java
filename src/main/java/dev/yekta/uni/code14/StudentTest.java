/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

package dev.yekta.uni.code14;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

@SuppressWarnings("BooleanMethodIsAlwaysInverted")
interface handler {
    void handle() throws Exception;

    default boolean safeRun() {
        try {
            handle();
        } catch (Exception ignored) {
            System.out.println("Something bad happened!");
            return false;
        }
        return true;
    }
}

public class StudentTest {
    public static void main(String[] args) {
        RandomAccessFile file;

        // Init
        try {
            file = new RandomAccessFile("students.dat", "rw");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }

        Student s = new Student(808080, "Ali", "Khaleqi Yekta", 20.0);

        // Write
        if (!s.writeStudentInFile(file)){
            return;
        }

        // Reset pointer
        if (!((handler) () -> file.seek(0)).safeRun()){
            return;
        }

        // Read
        System.out.println(Student.nextStudent(file));

        // Reset pointer
        if (!((handler) () -> file.seek(0)).safeRun()){
            return;
        }

        // Find
        System.out.println(new Finder(file).find("Khaleqi Yekta"));
    }
}
