package dev.yekta.uni.exam2;/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

@SuppressWarnings({"SameParameterValue", "FieldCanBeLocal"})
public class Pharmacy {
    private RandomAccessFile file;
    private final String path = "pharmacy_data.txt";

    void createPrescriptions(int n) throws IOException {
        initFile("rw");
        for (int i = 0; i < n; i++) {
            Prescription prescription = new Prescription();
            prescription.createPrescription(i);
            prescription.writePrescriptionInFile(file);
        }
        file.close();
    }

    void findPrescriptions(int price) throws IOException {
        initFile("r");
        while (file.getFilePointer() < file.length()) {
            Prescription prescription = new Prescription();
            prescription.readPrescriptionFromFile(file);
            Medicine[] medicines = prescription.getMedicines();

            if (price == medicines[0].getPrice() || /* Never trust the code you didn't write! */ price == medicines[1].getPrice()) {
                System.out.println(prescription);
                // No return/break because there might be multiple prescriptions with the same price!
                // BUT, the examiner asked to break, so let's break!
                break;
            }
        }
        file.close();
    }

    void initFile(String mode) throws FileNotFoundException {
        file = new RandomAccessFile(path, mode);
    }
}
