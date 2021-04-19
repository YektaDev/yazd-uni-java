/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

package dev.yekta.uni.code8;

public class Author {
    final String BOOKS_NOT_FOUND = "No Books Are Found!";

    private String name;
    private String address;
    private Book[] books;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Author(String name, String address, Book[] books) {
        this.name = name;
        this.address = address;
        this.books = books;
    }

    public Author(String name, String address) {
        this(name, address, null);
    }

    public Author(String name, Book[] books) {
        this(name, null, books);
    }

    public Author(String name) {
        this(name, null, null);
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder(
                String.format(
                        "Author Name: %s\nAuthor Address: %s\nBooks: \n",
                        name == null ? "No Name!" : name,
                        address == null ? "No Address!" : address
                )
        );

        if (books == null || books.length == 0)
            info.append("No Books!");
        else
            for (String book : getBooksInfo().split("\n"))
                info.append("\t").append(book).append("\n");

        return info.toString();
    }

    public String getBooksInfo() {
        StringBuilder info = new StringBuilder();

        for (Book book : books)
            if (book != null)
                info.append(book);

        return info.toString();
    }

    public void printBooksInfo() {
        System.out.println(getBooksInfo());
    }

    public void printInfo() {
        System.out.println(this);
    }

    public String findBooks(String bookName) {
        if (books == null || books.length == 0)
            return BOOKS_NOT_FOUND;

        bookName = bookName == null ? "" : bookName;

        StringBuilder foundBooks = new StringBuilder("Found Books: \n");
        String simpleBookName = bookName.trim().toLowerCase();

        for (Book book : books)
            if (book != null && book.getName().trim().toLowerCase().contains(simpleBookName))
                foundBooks.append(book);

        return foundBooks.toString().length() == 0 ? BOOKS_NOT_FOUND : foundBooks.toString();
    }

    public String findBook(int bookId) {
        if (books == null || books.length == 0)
            return BOOKS_NOT_FOUND;

        for (Book book : books)
            if (book != null && book.getId() == bookId)
                return book.toString();

        return BOOKS_NOT_FOUND;
    }
}
