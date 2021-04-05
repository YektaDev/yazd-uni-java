package dev.yekta.uni.code6;

public class User {
    private String username;

    private String name;
    private String email;
    private char gender;
    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User() {
        this.username = "user";
    }

    public User(int userId) {
        this();
        this.username += userId;
    }

    public User setUserInfo(String name) {
        setUserInfo(name, null, '\u0000', 0);
        return this;
    }

    public User setUserInfo(String name, String email) {
        setUserInfo(name, email, '\u0000', 0);
        return this;
    }

    public User setUserInfo(String name, String email, char gender) {
        setUserInfo(name, email, gender, 0);
        return this;
    }

    public User setUserInfo(String name, String email, char gender, int age) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.age = age;
        return this;
    }

    /*
     * A Null-safe representation of User with all initialized properties.
     */
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(
                String.format("User:\n\tUsername: %s\n", username)
        );

        if (name == null) return str.toString();

        str
                .append("\tName: ")
                .append(name)
                .append('\n');

        if (email == null) return str.toString();

        str
                .append("\tEmail: ")
                .append(email)
                .append('\n');

        if (gender == '\u0000') return str.toString();

        String genderRepresentation = switch (gender) {
            case 'm' -> "male";
            case 'f' -> "female";
            default -> "non-binary";
        };

        str
                .append("\tGender: ")
                .append(genderRepresentation)
                .append('\n');

        if (age == 0) return str.toString();

        str
                .append("\tAge: ")
                .append(age)
                .append('\n');

        return str.toString();
    }
}
