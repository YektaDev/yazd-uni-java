package dev.yekta.uni.code2;

public class Book {
    private int id;
    private String name;
    private String author;
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

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public Book(String name, String author, int price) {
        App.lastBookId++;

        this.id = App.lastBookId;
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public Book(String name, String author) {
        this(name, author, 0);
    }
    public Book(String name) {
        this(name, null, 0);
    }
    public Book() {
        this(null, null, 0);
    }

    public void printInfo() {
        System.out.println("Book ID: " + id);

        if (name != null)
            System.out.println("Book Name: " + name);

        if (author != null)
            System.out.println("Author Name: " + name);

        System.out.println("Price: " + price);
    }
}
