package dev.yekta.uni.code6;

public class TestUser {
    public static void main(String[] args) {
        System.out.println(
                new User(8888)
                        .setUserInfo("Ali", "foo@foo8.dev", 'm', 19)
                        .toString()
        );

        System.out.println(
                new User(888)
                        .setUserInfo("Jade", "foo@gmail.com", '-')
                        .toString()
        );

        System.out.println(
                new User(88)
                        .setUserInfo("Sarah", "foo2@gmail.com")
                        .toString()
        );

        System.out.println(
                new User(8)
                        .setUserInfo("Dave")
                        .toString()
        );

        System.out.println(
                new User()
                        .toString()
        );
    }
}
