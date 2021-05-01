package dev.yekta.uni.code9;

public class CelebrationTest {
    public static void main(String[] args) {
        Celebration c = new Celebration(16);

        c.showNumber(0b1010101010101010).print(); // 43690
        c.showNumber(0b0101010101010101).print(); // 21845
        c.showNumber(43690).print();
        c.showNumber(21845).print();
        System.out.println();
        c.showNumber(0b0000000000000000).print();
        c.showNumber(0b1111111111111111).print();
        c.showNumber(0b0000000000000000).print();
        System.out.println();
        c.showNumber(0b1100011000110001).print();
        c.showNumber(0b0011100111001110).print();
        c.showNumber(0b1100011000110001).print();
    }
}
