/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

package dev.yekta.uni.code12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class RandomAccessFileWrapper {
    @SuppressWarnings("unused")
    enum Mode {RW, R, W}

    public static RandomAccessFile create(String pathname, Mode mode) {
        RandomAccessFile file = null;
        try {
            file = new RandomAccessFile(
                    new File(pathname),
                    mode == Mode.RW ? "rw" : (mode == Mode.W ? "w" : "r")
            );
        } catch (FileNotFoundException ignored) {
        }

        return file;
    }
}
