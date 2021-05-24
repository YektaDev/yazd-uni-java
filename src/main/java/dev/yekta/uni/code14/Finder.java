/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

package dev.yekta.uni.code14;

import java.io.RandomAccessFile;

public class Finder {
    private final RandomAccessFile file;

    Finder(RandomAccessFile file){
        this.file = file;
    }

    @SuppressWarnings("SameParameterValue")
    Student find(String lastname){
        Student s;

        do {
            s = Student.nextStudent(file);

            if (s == null)
                break;
        } while (!s.getLastname().equalsIgnoreCase(lastname));

        return s;
    }
}
