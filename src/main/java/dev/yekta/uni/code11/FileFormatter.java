/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

package dev.yekta.uni.code11;

import java.util.Formatter;
import java.util.Scanner;

public class FileFormatter {
    private Formatter f;
    private final String filename;

    public String getFilename() {
        if (f == null) return null;
        return f.out().toString();
    }

    public FileFormatter(String filename) {
        this.filename = filename;
    }

    public boolean createNew(String initialData) {
        if (filename == null) return false;

        try {
            f = new Formatter(filename);
        } catch (Exception e) {
            return false;
        }

        append(initialData);

        return true;
    }

    public String read() {
        if (filename == null) return null;

        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(filename);

        while (scanner.hasNextLine())
            sb.append(scanner.nextLine()).append(System.lineSeparator());

        return sb.toString();
    }

    public String getLinesMatching(String regex) {
        if (filename == null) return null;

        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(filename);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (line.matches(regex))
                sb.append(line).append(System.lineSeparator());
        }

        return sb.toString();
    }

    public FileFormatter flush() {
        f.flush();
        return this;
    }

    public FileFormatter append(String data) {
        if (data == null || filename == null) return this;

        f.format(data);

        return this;
    }

    public FileFormatter appendLine(String data) {
        if (data == null) return appendLine();

        append(data + System.lineSeparator());

        return this;
    }

    public FileFormatter appendLine() {
        append(System.lineSeparator());
        return this;
    }

    public FileFormatter close() {
        f.close();
        return this;
    }
}
