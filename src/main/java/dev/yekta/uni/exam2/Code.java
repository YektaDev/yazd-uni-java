package dev.yekta.uni.exam2;

import java.util.Random;

public class Code {

    public String doctorCode(int i) {
        return "doctor_10" + i;  // ایجاد شناسه دکتر با فرمت روبرو
    }

    public String patientCode(int i) {
        return "patient_100" + i;// ایجاد شناسه بیمار با فرمت روبرو
    }

    public String medicineCode(int i) {
        Random random = new Random();
        int r = random.nextInt(9);
        return "medicine_1000" + (i * r);// ایجاد شناسه دارو با فرمت روبرو
    }

    public String prescriptionCode(int i) {
        return "prescription_10000" + i;// ایجاد شناسه نسخه با فرمت روبرو
    }

}



