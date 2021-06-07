package dev.yekta.uni.exam2;/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class Prescription {
    private Code code;
    private String prescriptionCode;
    private String doctorCode;
    private String patientCode;
    private Medicine[] medicines;
    private final int fixLen = 20;

    public Medicine[] getMedicines() {
        return medicines;
    }

    void createPrescription(int i) {
        this.code = new Code();
        this.prescriptionCode = code.prescriptionCode(i);
        this.doctorCode = code.doctorCode(i);
        this.patientCode = code.patientCode(i);
        this.medicines = new Medicine[]{new Medicine(i, code), new Medicine(i, code)};
    }

    void writePrescriptionInFile(RandomAccessFile file) throws IOException {
        file.writeChars(fixStringLength(prescriptionCode));
        for (int i = 0; i < 2; i++) {
            file.writeChars(fixStringLength(medicines[i].getMedicineCode()));
            file.writeInt(medicines[i].getPrice());
        }
        file.writeChars(fixStringLength(doctorCode));
        file.writeChars(fixStringLength(patientCode));
    }

    void readPrescriptionFromFile(RandomAccessFile file) throws IOException {
        this.prescriptionCode = readString(file);

        this.medicines = new Medicine[2];
        for (int i = 0; i < medicines.length; i++) {
            medicines[i] = new Medicine() {{
                setMedicineCode(readString(file));
                setPrice(file.readInt());
            }};
        }

        this.doctorCode = readString(file);
        this.patientCode = readString(file);
    }

    private String readString(RandomAccessFile file) throws IOException {
        StringBuilder stringBuilder = new StringBuilder(fixLen);

        for (int i = 0; i < fixLen; i++) {
            stringBuilder.append(file.readChar());
        }

        return stringBuilder.toString().trim();
    }

    private String fixStringLength(String str) {
        int length = str.length();

        if (length > fixLen) {
            return str.substring(0, fixLen);
        } else if (length == fixLen) {
            return str;
        }

        StringBuilder stringBuilder = new StringBuilder(str);
        for (int i = length; i < fixLen; i++) {
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "Prescription:\n\tprescriptionCode: " + prescriptionCode +
                "\n\tdoctorCode: " + doctorCode +
                "\n\tpatientCode: " + patientCode +
                "\n\tmedicines: " + Arrays.toString(medicines);
    }
}
