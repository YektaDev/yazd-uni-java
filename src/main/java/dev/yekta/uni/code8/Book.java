/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

package dev.yekta.uni.code8;

public class Book {
    static int lastBookId = -1;

    private int id;
    private String name;
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id >= 0)
            this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 3)
            this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 0)
            System.out.println("Invalid Price!");

        this.price = price;
    }

    public Book(String name, int price) {
        lastBookId++;

        this.id = lastBookId;
        this.name = name;
        this.price = price;
    }

    public Book(String name) {
        this(name, 0);
    }

    public Book() {
        this(null, 0);
    }

    // A totally unnecessary method (for now)
    public void changePrice(int price) {
        setPrice(price);
    }

    // A totally unnecessary method (for now)
    public void changeName(String name) {
        setName(name);
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Book ID: " + id +
                "\nBook Name: " + (name == null ? "No Name!" : name) +
                "\nPrice: " + (price == 0 ? "Free" : price);
    }
}
