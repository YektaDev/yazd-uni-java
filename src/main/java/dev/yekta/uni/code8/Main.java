/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

package dev.yekta.uni.code8;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("An Imaginary Book That Does Exist!", 8000);
        Book b2 = new Book("An Imaginary Book That May Exist!", 800);
        Book b3 = new Book("An Imaginary Book That Does Not Exist!", 80);

        // new Book(null, 0).printInfo();
        // System.out.println();

        b1.changeName("A Free Book!");
        b1.changePrice(0);

        // new Author("A Newbie Author", "Brazil", null).printInfo();
        // System.out.println();

        // new Author(null, null, null).printInfo();
        // System.out.println();

        Author a1 = new Author("Yekta", "Somewhere, Germany", new Book[]{b1, b2, b3});
        // a1.printBooksInfo(); --> Prints books info
        // a1.printInfo();

        System.out.println(a1.findBooks("fre"));
        // System.out.println(a1.findBooks(null)); --> Prints all books
    }
}
