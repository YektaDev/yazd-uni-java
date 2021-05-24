/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

package dev.yekta.uni.code14;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessWrapper {
    private final RandomAccessFile file;

    RandomAccessWrapper(String name) {
        RandomAccessFile f = null;
        try {
            f = new RandomAccessFile(name, "rw");
        } catch (FileNotFoundException ignored) {
        }
        file = f;
    }

    boolean seek(long position) {
        try {
            file.seek(position);
        } catch (IOException ignored) {
            return false;
        }
        return true;
    }
}
