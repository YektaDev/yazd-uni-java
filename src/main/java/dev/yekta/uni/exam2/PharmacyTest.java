package dev.yekta.uni.exam2;

import java.io.IOException;

public class PharmacyTest {
    public static void main(String[] args) throws IOException {
        Pharmacy pharmacy = new Pharmacy();
        pharmacy.createPrescriptions(1000);

        // خواندن نسخه ای که قیمت یکی از داروها برابر با 1000 باشد
        pharmacy.findPrescriptions(23000000);
    }
}
