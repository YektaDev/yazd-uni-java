package dev.yekta.uni.code2;

public class Author {
    private int id;
    private String name;
    private String email;
    private String bookName;

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
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Author(String name, String email, String bookName) {
        App.lastAuthorId++;

        this.id = App.lastAuthorId;
        this.name = name;
        this.email = email;
        this.bookName = bookName;
    }

    public Author(String name, String email) {
        this(name, email, null);
    }

    public Author(String name) {
        this(name, null, null);
    }

    public Author() {
        this(null, null, null);
    }

    public void printInfo() {
        System.out.println("Author ID: " + id);
        if (name != null)
            System.out.println("Author Name: " + name);
        if (email != null)
            System.out.println("Author Email: " + email);
        if (bookName != null)
            System.out.println("Book Name: " + bookName);
    }
}
