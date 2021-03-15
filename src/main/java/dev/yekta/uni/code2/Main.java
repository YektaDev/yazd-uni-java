/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

package dev.yekta.uni.code2;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author();
        Author author2 = new Author("Yekta");
        Author author3 = new Author("Darya", "darya@test.com");
        Author author4 = new Author("Ali Khaleqi Yekta", "me@yekta.dev", "An Imaginary Book That Does Not Exists!");

        System.out.println("*** Author 1 ***");
        author1.printInfo();
        System.out.println("*** Author 2 ***");
        author2.printInfo();
        System.out.println("*** Author 3 ***");
        author3.printInfo();
        System.out.println("*** Author 4 ***");
        author4.printInfo();

        Book book1 = new Book("An Imaginary Book That Does Not Exists!", "Ali Khaleqi Yekta", 50000);

        System.out.println("*** Book 1 ***");
        book1.printInfo();
    }
}
