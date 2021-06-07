package dev.yekta.uni.exam2;

public class Medicine {
    private String MedicineCode;
    private int price;

    public Medicine() { // constructor
    }

    public Medicine(int i, Code code) {  // constructor
        this.MedicineCode = code.medicineCode(i);
        this.price = i * 1000;
    }

    public String getMedicineCode() {
        return MedicineCode;
    }

    public void setMedicineCode(String MedicineCode) {
        this.MedicineCode = MedicineCode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "MedicineCode='" + MedicineCode + '\'' +
                ", price=" + price +
                '}';
    }
}
